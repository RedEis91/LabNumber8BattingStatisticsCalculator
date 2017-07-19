import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi!");
        System.out.println();
        String contin;
        do {
            System.out.println("Continue?");
            System.out.println();
            contin = scan.nextLine();
            System.out.println();
        }
        while (contin.contains("Y") || contin.contains("y"));
        System.out.println("Thanks!");
    }

}
