package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }



        // write your code here
            //        //#1
//        //i. get num
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        //ii. loop num from 1 to num
//        for (int i = 1; i <= num; i++){
//            System.out.println(i * i * i);
//        }
//
            // #2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        //ii. loop num from 1 to num
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i + " x " + num + " = " + i * num);
//        }
//        //#3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int total = 0;
//        for(int i = 1; i <= num; i+=2 ){
//            total +=i;
//            System.out.println(i);
//        }
//        System.out.println("The sum of these numbers equals " + total);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int total = 0;
//        for(int i = 2; i <= num; i+=2 ){
//            total +=i;
//            System.out.println(i);
//        }
//        System.out.println("The sum of these numbers equals " + total);

            //    #5 There is no 5, skips to 6
// #6

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//

        // the outer loop is bound to the num
        // the inner loop is bound to the outer loop
        // i goes to num; j goes to i
        // i can go to any chosen num; j is always contingent on j

//        for (int i = 1; i <= num; i++){
//            for(int j = 1; j <= i; j++){
//                // j + space
//                // every time counting from 1 to i; as i changes, j counts more
//                System.out.print(j);
//            }   // next line
//            System.out.println("");
//        }


// #7


        // outer loop, change lines
        // inner loop, not counting from 1 - i, but repeating i ... i amount of times


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        for(int i = 1; i <= num; i++){
//            for(int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//                System.out.println("");
//        }

// #8

// inner loop: print numbers to upward bound number, with incremented amount -->



// #9 NOT FINISHED

// #10 NOT FINISHED

// #11 NOT FINISHED

   }
}
