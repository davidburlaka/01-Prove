package com.company;

import java.util.Scanner;

import static com.company.NSALoginController.hashUserPassword;
import static com.company.NSALoginController.verifyPassword;

public class Test {

    public static void main(String[] args) {
        System.out.println("Password: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        User user = new User(line);

        try {
            hashUserPassword(user);
        } catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
        
        System.out.println("Salt: " + user.getSalt()+ "\n");
        System.out.println("Hashed Password: "+ user.getHashedPassword()+ "\n");

        System.out.println("Enter password again: ");
        scanner = new Scanner(System.in);
        line = scanner.nextLine();
        user.setPassword(line);
        try {
            if(verifyPassword(user))
                System.out.println("Password is correct\n");
            else
                System.out.println("Password is incorrect\n");
        } catch (Exception e) {
            System.out.println("Password is incorrect\n");
        }
    }
}
