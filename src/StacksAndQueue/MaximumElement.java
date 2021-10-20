package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int N = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < N; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            int command = Integer.parseInt(tokens[0]);
            switch (command){
                case 1 :
                    int num = Integer.parseInt(tokens[1]);
                    stack.push(num);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
