package ch01.ex12;

import java.util.Scanner;

public class NameAge {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();  
        System.out.println("이름: " + name);

        System.out.print("나이: ");
        int age = sc.nextInt();  
        System.out.println("나이: " + age);

        

    }
}

