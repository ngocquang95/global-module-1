package ss13_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    static void main() {
        ArrayList<Integer> integers = new ArrayList<>();

        // add(Object o): Adds element o to the end of the list.
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(10);

        System.out.println(integers.indexOf(10)); // 0
        System.out.println(integers.lastIndexOf(10)); // 7



//        //add(int index, Object element): Adds an element at the specified index
//        integers.add(1, 99); // [10, 99, 20, 30]
//
//        //set(int index, Object element): Replaces the element at the specified index
//        integers.set(1, 100); // [10, 100, 20, 30]
//
//        //get(int index): Returns the element at the specified index
//        System.out.println(integers.get(1)); // 100
//
//        //indexOf(Object o):  Returns the index of the first occurrence of element o
//        int x = 99;
//        int index = integers.indexOf(x);
//        if (index == -1) {
//            System.out.printf("%d is not found!", x);
//        } else {
//            System.out.printf("%d is at index %d", x, index);
//        }
//
//        System.out.println(); // [10, 100, 20, 30]

        //lastIndexOf(Object o): Returns the index of the last occurrence of element o


        //remove(int index): Removes the element at the specified index
        integers.remove(1); // [10, 20, 30]

        //remove(Object o): Removes the first occurrence of element o
        integers.remove(Integer.valueOf(10));


        //removeAll(Collection c): Removes all elements contained in collection c
        integers.removeAll(List.of(10)); // Collection with one element 10
        System.out.println(integers);
    }
}
