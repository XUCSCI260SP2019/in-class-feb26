/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.xavier.csci;

public class App {
    public String getGreeting(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {


        System.out.println(new App().getGreeting(args[0]));
    }
}
