package trial.group;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Please enter your number: ");
            String input = sc.nextLine();
            names[i] = input;
        }
        for (String n : names) {
            System.out.println(n);
        }
    }
}




