package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        ArrayDeque<Character> closedBrackets = new ArrayDeque<>();
        String parentheses = scan.nextLine();
        boolean isBalanced = true;
        for (int i = 0; i < parentheses.length(); i++) {
            char symbol = parentheses.charAt(i);

            if (parentheses.length()%2!=0){
                isBalanced = false;
                break;
            }else if (symbol=='('||symbol=='['||symbol=='{'){
                openBrackets.offer(symbol);
            }else if (symbol==')'||symbol==']'||symbol=='}'){
                closedBrackets.push(symbol);
            }else {
                isBalanced = false;
                break;
            }
        }
        for (int i = 0; i < openBrackets.size(); i++) {
            String parenthesis = String.valueOf(new StringBuilder()
                    .append(openBrackets.poll())
                    .append(closedBrackets.pop()));

            if (openBrackets.size() != closedBrackets.size()){
                isBalanced = false;
                break;
            }
            if (!(parenthesis.equals("()") || parenthesis.equals("[]")
                    || parenthesis.equals("{}"))){
                isBalanced=false;
                break;
            }
        }
        if (isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
