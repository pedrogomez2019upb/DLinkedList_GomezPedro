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
        return null;
    }

    @Override
    public void add(Object object) {

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
        return false;
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

    }

    @Override
    public void removeTail(int position) {

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
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        return new Object[0];
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
