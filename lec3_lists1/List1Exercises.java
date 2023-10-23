package lec3_lists1;

public class List1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrListIterative(IntList L, int x) {
        /* Your code here. */
        IntList Q = new IntList(L.get(L.size() - 1) + x, null);
        for (int i = L.size() - 2; i >= 0; i--) {
            Q = new IntList(L.get(i) + x, Q);
        }
        return Q;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed to change.
     * This time with recursion! */
    public static IntList incrList(IntList L, int x) {
        // Base case
        if (L == null) {
            return null;
        }
        IntList incrementedList = new IntList(L.first + x, null);
        incrementedList.rest = incrList(L.rest, x);
        return incrementedList;
    }

    public static IntList dincrList(IntList L, int x) {
        if (L == null) {
            return null;
        }
        L.first += x;
        dincrList(L.rest, x);

        return L;
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrListIterative(IntList L, int x) {
        /* Your code here. */
        IntList Q = L;
        for (int i = 0; i < Q.size(); i++) {
            L.first += x;
            L = L.rest;
        }
        L = Q;
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
         System.out.println(L.get(1));
         System.out.println(incrList(L, 3));
         System.out.println(dincrList(L, 3));
    }
}