package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        List<Integer> list = new ArrayList<>();
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        list.forEach(System.out::println);

//        Runnable r1 = () -> System.out.println("My Runnable");

        String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.print(x);

//        HashSet shortSet = new HashSet();
//        for (short i = 0; i < 100; i++) {
//            shortSet.add(i);
//            shortSet.remove(i - 1);
//        }
//        System.out.println(shortSet);
//        System.out.println(shortSet.size());

//        String s1 = "abc";
//        String s2 = "abc";
//        System.out.println("s1 == s2 is:" + s1 == s2); // because of "+" it will be false!

//        String s = "dlfmvifn";
//        if (s.matches(".*[aeoiu].*")) {
//            System.out.println("ffff");
//        }
//        System.out.println(factorial(5));

//        System.out.println(checkPalindromeString("alona anola"));

//        System.out.println(isPrime(49));
//        System.out.println(fibonacci(6));
//        printFibonacciSequence(8);

//        int seqLength = 10;
//        System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");
//        for (int i = 0; i < seqLength; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }

//        String str = " fgghbvr    bgt bnhtr    vfrg ";
////        str = str.strip();
//        System.out.println(str);
//        String s2 = str.substring(1,5);
//        System.out.println(s2);
//
//        StringBuilder stringBuilder = new StringBuilder(str);
//        str = String.valueOf(stringBuilder.deleteCharAt(3));
//
//        String array [] = str.trim().replaceAll("\\s{2,}"," ").split(" ");
//        char charArray [] = str.replaceAll(" ","").toCharArray();
//        System.out.println("Number of letters: " + charArray.length);
//
//        for (String a: array){
//            System.out.println(a);
//        }
//        System.out.println("Number of words: " + array.length);
    }
    public static int factorial(int n) {   // ?????
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    static boolean checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length -1 -i)) {
                result = false;
                break;
            }
        }

        return result;
    }
    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }
    public static void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
        public static boolean isPrime(int n) {
            if (n == 0 || n == 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
