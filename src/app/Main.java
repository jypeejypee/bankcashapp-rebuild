package app;

import util.InputHelper;

public class Main {
    public static void main(String[] args) {
        String name = InputHelper.readString("Your name: ");
        System.out.println("Hello, " + name + "!");
    }
}