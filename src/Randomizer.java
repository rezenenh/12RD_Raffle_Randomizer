
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Randomizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names for the list (type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }
        System.out.println("Randomized lists:");
        for (int i = 0; i < 12; i++) {
            Collections.shuffle(names); // Shuffle the list
            System.out.println("Randomization " + (i + 1) + ": " + names);
        }
        scanner.close();
    }
}
