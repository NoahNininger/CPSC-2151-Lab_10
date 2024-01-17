/* Noah Nininger ( I worked alone :/ ) */
package cpsc2150.listDec;

import java.util.Random;
import java.util.List;

public interface IShuffleList<T> extends List<T> {

    /**
     * Shuffles the elements of the list by swapping two elements a specified number of times.
     *
     * @param swaps the number of times to swap two elements
     *
     * @pre 0 < list AND list cannot be null
     * @post two randomly chosen elements are swapped AND size stays the same AND
     *       elements that weren't swapped are in their original positions
     */
    default void shuffle(int swaps) {
        for (int i = 0; i < swaps; i++) {
            Random num = new Random();
            int tempI = num.nextInt(size());
            int tempJ = num.nextInt(size());
            swap (tempI, tempJ);
        }
    }

    /**
     * Swaps the elements at two specified positions in the list.
     *
     * @param i the index of the first element to be swapped
     * @param j the index of the second element to be swapped
     *
     * @pre list cannot be null
     * @post two parameters are swapped
     */
    default void swap(int i, int j) {
        T temp = get(i);
        set(i, get(j));
        set(j, temp);
    }

}
