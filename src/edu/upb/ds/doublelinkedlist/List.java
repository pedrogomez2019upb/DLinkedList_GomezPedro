package edu.upb.ds.doublelinkedlist;

import java.util.Iterator;

public class List implements ListInterface,Iterable<ListNode>{

    public ListNode head;
    public ListNode tail;
    private ListNode node;
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
        return null;
    }

    @Override
    public Object getTail() {
        return null;
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

    }

    @Override
    public void addEnd(Object object) {

    }

    @Override
    public boolean insert(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        try {
            if (ob != null) {
                ListNode inode = (ListNode) this.search(ob);
                if (inode.next == null) {
                    add(object);
                } else {
                    ListNode newNode = new ListNode();
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
        return false;
    }

    @Override
    public boolean insertTail(Object object) {
        return false;
    }

    @Override
    public boolean set(ListNode node, Object object) {
        return false;
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
        return false;
    }

    @Override
    public boolean isEquals(Object object) {
        return false;
    }

    @Override
    public Iterator<ListNode> iterator() {
        return null;
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
        return null;
    }

    @Override
    public List sortList() {
        return null;
    }

    @Override
    public void toList() {

    }

    @Override
    public ListNode rec(ListNode list) {
        return null;
    }
}
