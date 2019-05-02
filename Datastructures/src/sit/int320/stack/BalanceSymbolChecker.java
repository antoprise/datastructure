/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import java.util.StringTokenizer;

/**
 *
 * @author INT303
 */
public class BalanceSymbolChecker {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(checkBalance("Card.java"));
    }

    private static String checkBalance(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner sc = new Scanner(f);
        LinkedList<String> stack = new LinkedList();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, "{}()<>[]", true);
            while (stk.hasMoreTokens()) {
                String token = stk.nextToken();
                if (isSymbol(token)) {
                    if (isOpenSymbol(token)) {
                        //System.out.println("push("+token+")");
                        stack.push(token);
                    } else {
                        String top = stack.peek();
                        if (top == null) {
                            return "Missing open symbol";
                        } else if (getValue(top) != getValue(token)) {
                            return "unbalance symbol";
                        }
                        stack.pop();
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            return "Missing close symbol";
        }
        return "Balance size = " + stack.size();
        
    }

    private static int getValue(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
                return 1;

            case "{":
            case "}":
                return 2;

            case "(":
            case ")":
                return 4;

            case "<":
            case ">":
                return 8;
        }
        return -1;
    }

    private static boolean isSymbol(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
            case "{":
            case "}":
            case "(":
            case ")":
            case "<":
            case ">":
                return true;
        }
        return false;
    }

    private static boolean isOpenSymbol(String symbol) {
        switch (symbol) {
            case "[":
            case "{":
            case "(":
            case "<":
                return true;
        }
        return false;
    }

}
