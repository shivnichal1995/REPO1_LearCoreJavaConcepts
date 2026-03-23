package JavaPrograms.NumberPrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=number;i++){
            sum = sum+i;
        }
        System.out.println("Sum of n natural numbers-> "+sum);
    }
}
