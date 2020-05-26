import java.util.Scanner;

public class Utilities {

    public static String[] readCollectionFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your collection using such format [1,2,3,...,n]");
        String[] collection = new String[0];
        do {
            String readLine = scanner.nextLine();
            if (readLine.equals("q"))
                break;
            if (readLine.contains("[") && readLine.contains("]")) {
                readLine = readLine.replace("[", "");
                readLine = readLine.replace("]", "");
                collection = readLine.split(",");
                break;
            } else
                System.out.println("Wrong input data format or type q for QUIT");
        } while (true);
        return collection;
    }

    public static boolean checkIfPalindrome(String[] collection) {
        for (int i = 0; i < (collection.length / 2); i++) {
            if (!collection[i].equals(collection[collection.length - i - 1])) {
                return false;
            }
        }
        return true;
    }
}
