
package com.FlorinP1994.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean valid;

        do {
            valid = true;

            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            boolean hasSpace = false;
            boolean hasDigit = false;

            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);

                if (c == ' ') {
                    hasSpace = true;
                    break;
                }

                if (c >= '0' && c <= '9') {
                    hasDigit = true;
                }
            }

            if (hasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                valid = false;
            } else if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                valid = false;
            } else if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                valid = false;
            }

        } while (!valid);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}
