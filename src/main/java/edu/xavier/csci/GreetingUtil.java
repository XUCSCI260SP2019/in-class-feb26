package edu.xavier.csci;

public class GreetingUtil {

    public String getGreeting(String name) {

        if("".equals(name)) {
            return "Hello";
        } else {
            return "Hello " + name;
        }
    }
}
