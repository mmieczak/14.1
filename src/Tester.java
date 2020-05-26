public class Tester {
    public static void main(String[] args) {

        String[] testedArray = Utilities.readCollectionFromUser();
        boolean checkifPalindrome = Utilities.checkIfPalindrome(testedArray);

        System.out.println("Palindrome: " + checkifPalindrome);
    }
}
