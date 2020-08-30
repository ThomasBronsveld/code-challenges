package main.java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] numbers = {"M", "CM","D", "CD","C", "XC","L", "XL", "X", "IX","V", "IV", "I"};
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        StringBuilder romanRepresentation = new StringBuilder();

        System.out.print("Enter value: ");
        int value = scanner.nextInt();

        if(value > 3999 || value < 1) throw new IllegalArgumentException("Only values between 0 and 3999");

        while(value > 0) {
            if(value - values[i] >= 0) {
                romanRepresentation.append(numbers[i] + " ");
                value -= values[i];
            } else {
                i++;
            }
        }

        System.out.println(romanRepresentation);
    }


}
