/**
 *  Java program to use streams of class System: out, err, and in.
 */

package com.mysystem;

import java.io.IOException;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        System.out.println("Hello print"); // Output: Hello print

        System.err.println("Hello exception"); // Output: Hello exception

        try {

            char ch = (char) System.in.read();
            System.out.println("ch's value is: " + ch); // Output: ch's value is: + written char from the user.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}