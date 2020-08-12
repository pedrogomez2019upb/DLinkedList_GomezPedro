package edu.upb.ds.doublelinkedlist;

public class ListNode {
    public Object object;
    public ListNode next;
    public ListNode before;

    public ListNode(){}

    public ListNode(Object object){
        object=object;
        next=null;
        before=null;
    }

    public ListNode(Object object, ListNode next, ListNode before) {
        this.object = object;
        this.next = next;
        this.before = before;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getBefore() {
        return before;
    }

    public void setBefore(ListNode before) {
        this.before = before;
    }

    @Override
    public String toString() {
        return String.valueOf(object);
        /*
        return "ListNode{" +
                "object=" + object +
                ", next=" + next +
                ", before=" + before +
                '}';

         */
    }
}
