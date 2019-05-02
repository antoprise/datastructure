/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.quiz;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Antoprise
 */
public class CheckBalanceSymbol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputs = new Scanner(System.in);
        System.out.println("Input : ");
        String input1 = input.next();
        if(isBalanceSymbolInExpression(input1)){
           System.out.println("Output : true - เป็นวงเล็บที่มีความสมดุล"); 
        }else{
            System.out.println("Output : false - ไม่เป็นวงเล็บที่มีความสมดุล"); 
        }
        
        System.out.println("-------------------------");
        System.out.println("Input : ");
        String input2 = inputs.next();
        if(isBalanceSymbolInExpression(input2)){
           System.out.println("Output : true - เป็นวงเล็บที่มีความสมดุล"); 
        }else{
            System.out.println("Output : false - ไม่เป็นวงเล็บที่มีความสมดุล"); 
        }
        System.out.println("Output : "+isBalanceSymbolInExpression(input2));
        
    }

    public static boolean isBalanceSymbolInExpression(String exprssion) {
        Stack<Character> stk = new Stack<Character>();
        if (exprssion == null || exprssion.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < exprssion.length(); i++) {

                if (exprssion.charAt(i) == '(' || exprssion.charAt(i) == '{' || exprssion.charAt(i) == '[') {
                    stk.push(exprssion.charAt(i));
                } else if (exprssion.charAt(i) == ')') {
                    if (!stk.isEmpty() && stk.peek() == '(') {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else if (exprssion.charAt(i) == ']') {
                    if (!stk.isEmpty() && stk.peek() == '[') {
                        stk.pop();
                        
                    } else {
                        return false;
                    }
                } else if (exprssion.charAt(i) == '}') {
                    if (!stk.isEmpty() && stk.peek() == '{') {
                        stk.pop();
                        
                    } else {
                        return false;
                    }
                }
            }

            // if stack is empty finally , it means symbol is balance in expression
            if (stk.isEmpty()) {
                return  true;
            } else {
                return false;
            }
        }
       
    }
}
