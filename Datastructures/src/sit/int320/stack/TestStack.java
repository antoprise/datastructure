/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.stack;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author INT303
 */
public class TestStack {
    public static void main(String[] args) {
        List list = new LinkedList();
        LinkedList stack = new LinkedList();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("size = "+stack.size());
        
    }
}
