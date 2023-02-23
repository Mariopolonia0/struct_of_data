package EjercicioJava.EjercicioHackerRank;


import java.util.*;

//If it is odd, print Rare
//If it is even and is in the inclusive range of 2 to 5, print Not Rare
//If it is even and in the inclusive range 6 to 20, print Rare
//If even and greater than 20, print Not Weird
//ejercicio de https://www.hackerrank.com/

public class Solution {

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

//    public static void main(String[] args) {
//
//        System.out.printf("Enter integer number:");
//        int numero = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        if(numero % 2 != 0){
//            System.out.printf("Weird");
//        }else{
//            if(numero >= 2 && numero <= 5){
//                System.out.printf("Not Weird");
//            } else if(numero >= 6 && numero <= 20){
//                System.out.printf("Weird");
//            } else if(numero > 20){
//                System.out.printf("Not Weird");
//            }
//        }
//        scanner.close();
//    }
}
