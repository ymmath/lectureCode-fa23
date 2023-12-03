package lec4_lists2.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 */
public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size;

    public SLList() {
        size = 0;
        first = null;
    }

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        size += 1;
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        if (first == null) {
            this.addFirst(x);
            return;
        }
        size += 1;
        IntNode p = first;


        /* Move p until the end of the list */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
        System.out.println(L.size());
        L.addLast(20);
        System.out.println(L.size());
    }
}