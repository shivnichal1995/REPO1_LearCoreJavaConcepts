package CoreJavaConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class WaysToAcceptInput {
    public static void main(String[] args) throws IOException {
        // 1) using scanner class
        Scanner scanner = new Scanner(System.in);
        int numByScanner = scanner.nextInt();
        System.out.println("num: "+numByScanner);

        // 2) BufferedReader class
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter your name ");
        String name = bufferedReader.readLine();

        System.out.println("enter your age ");
        int age = Integer.parseInt(bufferedReader.readLine());

        System.out.println("name: "+name+" and age: "+age);
    }
}
