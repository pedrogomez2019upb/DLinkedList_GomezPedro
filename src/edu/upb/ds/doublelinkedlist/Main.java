package edu.upb.ds.doublelinkedlist;

public class Main {

    public static void main(String[] args) {
        List list1=new List();
        for(int i=0;i<10;i++){
            list1.add(i);
        }

        for(ListNode node=list1.head;node !=null;node=node.next)
        {
            System.out.println(node.toString());
        }
        System.out.println("\n###################");

        System.out.println("\n"+list1.getHead());
        System.out.println("\n###################");
    }
}
