/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTString;

import java.util.ArrayList;
import java.util.List;

public class Output {

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(8);
        arr.add(32);
        arr.add(21);
        arr.add(31);
        int min = arr.get(0);
        int max = arr.get(0);
        int n = arr.size();
        int index1 = 0;
        int index2 = 0;
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
                index1 = i;
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                index2 = i;
            }
        }
        //arr.set(index1, arr.get(index2));
        System.out.println(arr);
    }
}
