package edu.upb.ds.doublelinkedlist;

import java.util.Arrays;
import java.util.Iterator;

public class List implements ListInterface,Iterable<ListNode>{

    public ListNode head;
    public ListNode tail;
    private ListNode inode;
    private int size;

    @Override
    public boolean isEmpty() {
        return head ==null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        head=null;
        tail=null;
    }

    @Override
    public Object getHead() {
            Object headObject = head.getObject();
            return headObject;
    }

    @Override
    public Object getTail() {
        Object tailObject = tail.getObject();
        return tailObject;
    }

    @Override
    public Object get(int index) {
        int counter=0;
        ListNode temporalNode=head;
        while (counter<index){
            temporalNode=temporalNode.getNext();
            counter++;
        }
        return temporalNode.getObject();
    }

    @Override
    public Object search(Object object) {
        Iterator<ListNode> i = this.iterator();
        ListNode inode;
        while (i.hasNext()) {
            inode = i.next();
            if (inode.getObject().toString().equals(object.toString())) {
                return inode;
            }
        }
        return null;
    }

    @Override
    public void add(Object object) {
        insertTail(object);
    }

    @Override
    public void addTail(Object object) {
        if(tail==null){
            tail = new ListNode(object);
            head = tail;
        }
        else
        {
            ListNode temporalNode=tail;
            ListNode newNode=new ListNode(object);
            newNode.linkNext(temporalNode);
            tail=newNode;
        }
        size ++;
    }

    @Override
    public void addEnd(Object object) {
        if(!isEmpty()){
            tail.next=new ListNode(object);
            tail=tail.next;
        }else {
            head=tail=new ListNode(object);
        }
        size++;
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        if (node.next == null) {
            add(object);
        } else {
            ListNode temporalNode = new ListNode(object);
            temporalNode.next = node.next;
            temporalNode.before = node;
            node.next = temporalNode;
        }
        return true;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        try {
            if (ob != null) {
                ListNode inode = (ListNode) this.search(ob);
                if (inode.next == null) {
                    add(object);
                } else {
                    ListNode newNode = new ListNode(object);
                    newNode.next = inode.next;
                    inode.next = newNode;
                    size++;
                }
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insertHead(Object object) {
        if (!isEmpty()){
            head= new ListNode(object,head,null);
            head.next.before=head;
        }else{
            head=tail=new ListNode(object);
        }
        size++;
        return true;
    }

    @Override
    public boolean insertTail(Object object) {
        if(!isEmpty()){
            tail=new ListNode(object,null,tail);
            tail.before.next=tail;
        }
        else{
            head=tail=new ListNode(object);

        }
        size++;
        return true;
    }

    @Override
    public boolean set(ListNode node, Object object) {
        ListNode variousNodes = head.before;
        ListNode temporalHead = head;
        boolean result = false;
        while (temporalHead != null) {
            if (temporalHead.isEquals(node.getObject())) {
                ListNode temporalNode = new ListNode(object);
                temporalNode.before = variousNodes;
                temporalNode.next = temporalHead.next;
                if (variousNodes == null) {
                    head = temporalNode;
                } else {
                    variousNodes.next = temporalNode;
                }
                result = true;
                break;
            }
            temporalHead = temporalHead.next;
            variousNodes = temporalHead.before;
        }
        return result;
    }

    @Override
    public void remove(int position) {
        ListNode aux = head;
        for (int i = 0; i < position - 1; i++)
        {
            aux = aux.getNext();
        }
        ListNode nNext = aux.getNext();
        aux.setNext(nNext.getNext());
        size--;
    }

    @Override
    public void removeTail(int position) {
        ListNode aux = head;
        for (int i = 0; i < position - 1; i++)
        {
            aux = aux.getNext();
        }
        ListNode nNext = aux.getNext();
        aux.setNext(nNext.getNext());
        size--;
    }

    @Override
    public boolean contains(Object object) {
        ListNode temporalNode = head;
        boolean result = false;
        while (temporalNode.next != null) {
            temporalNode = temporalNode.next;
            if (temporalNode == object) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean isEquals(Object object) {
        return false;
    }

    @Override
    public Iterator<ListNode> iterator() {
        inode = head;
        Iterator<ListNode> i = new Iterator<ListNode>() {
            @Override
            public boolean hasNext() {
                return inode.next != null ? true : false;
            }

            @Override
            public ListNode next() {
                if (hasNext()) {
                    ListNode tmp = inode;
                    inode = inode.next;
                    return tmp;
                } else {
                    return null;
                }
            }
        };
        return i;
    }

    @Override
    public Object[] toArray() {
        Object[] array= new Object[size];
        ListNode node= head;
        for (int i=0; i<size; i++){
            array[i]=node;
            node= node.next;
        }
        return array;
    }

    @Override
    public Object[] toArray(Object[] object) {
        try {
            ListNode node = head;
            int sizeArray = object.length;
            int x = 0;
            object = new Object[size];
            object[0] = head.getObject();

            do {
                node = node.next;
                x++;
                object[x] = node.getObject();
            } while (x <= sizeArray);
            return object;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Object getBeforeTo() {
        return null;
    }

    @Override
    public Object getBeforeTo(ListNode node) {
        return null;
    }

    @Override
    public Object getNextTo() {
        return null;
    }

    @Override
    public Object getNextTo(ListNode node) {
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        List newList = new List();
        ListNode temporalNode = head;
        while (temporalNode.next != null) {
            temporalNode = temporalNode.next;
            if (temporalNode == from) {
                newList.add(temporalNode);
                while (temporalNode != to) {
                    temporalNode = temporalNode.next;
                    newList.add(temporalNode);
                }
                break;
            }
        }
        newList.head.before = null;
        newList.tail.next = null;
        return newList;
    }

    @Override
    public List sortList() {
        List newList = new List();
        Object[] newArray = toArray();
        Arrays.sort(newArray);
        clear();
        for (int i = 0; i < size; i++) {
            newList.add(newArray[i]);
        }
        return newList;
    }

    @Override
    public void toList() {
    }

    @Override
    public ListNode rec(ListNode list) {
            if(inode.next ==null){
                System.out.println(inode.toString());
            }
            else{
                System.out.println(inode.toString());
                return rec(inode.next);
            }
            return null;
    }
}
