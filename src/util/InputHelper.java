package util;
import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner  (System.in);

    public static String readString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}