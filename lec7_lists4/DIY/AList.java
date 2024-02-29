package lec7_lists4.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 *  After writing your methods, you can run the AListTest file.
 */

/* Invariants:
addLast: The next item we want to add will go into position size
getLast: The item we want to return is in position size - 1
size: The number of items in the list should be size.
 */
public class AList<Blorp> {
    /** Creates an empty list. */
    private int size;
    private Blorp[] items;
    public AList() {
        size = 0;
        items = (Blorp[]) new Object[100];
    }

    private void resize(int capacity) {
        Blorp[] a = (Blorp[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, this.size);
        items = a;
    }
    /** Inserts X into the back of the list. */
    public void addLast(Blorp x) {
        if (size == items.length) {
            resize(size * 2);
        }
        this.items[size] = x;
        this.size += 1;
    }

    /** Returns the item from the back of the list. */
    public Blorp getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Blorp get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Blorp removeLast() {
        Blorp returnItem = getLast();
        items[size - 1] = null;
        size -= 1;
        return returnItem;
    }
} 