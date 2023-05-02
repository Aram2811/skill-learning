import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.println("Hello From " + name);
    }
}