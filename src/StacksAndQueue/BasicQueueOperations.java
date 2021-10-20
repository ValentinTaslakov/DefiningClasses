package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] num = scan.nextLine().split("\\s+");

        int elementInStack = Integer.parseInt(num[0]);
        int popFromStack = Integer.parseInt(num[1]);
        int checkInStack = Integer.parseInt(num[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < elementInStack; i++) {

            queue.offer(scan.nextInt());
        }
        for (int i = 0; i < popFromStack; i++) {
            queue.poll();
        }
        if (queue.contains(checkInStack)) {
            System.out.println(true);
        } else if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            int min = Integer.MAX_VALUE;
            for (int number : queue) {
                if (number < min) {
                    min = number;
                }
            }
            System.out.println(min);
        }
    }
}

