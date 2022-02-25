package com.company;

import java.util.Scanner;

import ibadts.Collection;

public class Main {

    public static void main(String[] args) {
        homework3();
    }

    public static void homework1() {
        Collection<String> names = new Collection<>();
        names.add(new String[]{"John", "Marie"});
        for (int i = 0; i <= 2; i++) {
            names.resetNext();
            while (names.hasNext()) {
                System.out.println(names.getNext());
            }
        }
    }

    public static void homework2() {
        Scanner scanner = new Scanner(System.in);
        Collection<Integer> numbers = new Collection<>();
        boolean flag = true;
        int t = 0;
        while (flag) {
            int number = scanner.nextInt();
            if (number <= 0) {
                flag = false;
            } else {
                numbers.addItem(number);
                t = number;
            }
        }
        while (numbers.hasNext()) {
            int number = numbers.getNext();
            if (number > t) {
                System.out.println(number);
            }
        }
    }

    public static void homework3() {
        Scanner scanner = new Scanner(System.in);
        Collection<Integer> numbers = new Collection<>();
        int count = 0;
        int sum = 0;
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n < 0) {
                break;
            } else {
                numbers.addItem(n);
                sum += n;
                count += 1;
            }

        }
        double mean = sum / count;
        while (numbers.hasNext()) {
            int n = numbers.getNext();
            if (Math.abs(n - mean) / mean > 0.5) {
                System.out.printf("%d ", n);
            }
        }
    }

}
