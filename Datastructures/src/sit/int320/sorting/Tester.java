/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author INT303
 */
public class Tester {

    public static void main(String[] args) {
        Integer[] x = new Integer[200_000];
        Integer[] y = new Integer[200_000];
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = i;//r.nextInt(1000000);
        }
        System.arraycopy(x, 0, y, 0, x.length);
        //System.out.println("Original order:");
        //printArray(x);
       // Sorter.selectionSort(x);
       //Arrays.sort(x);
       long before = System.currentTimeMillis();
       //Arrays.parallelSort(x);
       long duration = System.currentTimeMillis() - before ;
       
       before = System.currentTimeMillis();
       Sorter.insertion(y);
       long duration2 = System.currentTimeMillis() - before ;
        System.out.println("Parallel sort : "+duration+" Millisec");
        System.out.println("Insrtion sort : "+duration2+" Millisec");
      /*  Sorter.insertion(x, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/
        //System.out.println("After Sorted:");
        //printArray(x);
    }

    private static void printArray(Object[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%d%s", x[i], (i + 1) % 10 == 0 ? "\n" : "\t");
        }
        System.out.println("");
    }
}
