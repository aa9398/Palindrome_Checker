import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str, int start, int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalindrome(str, start + 1, end -1);
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        String Normalized = scanner.nextLine();

        Normalized = Normalized.toLowerCase();
        Normalized = Normalized.toLowerCase().replaceAll("\\s+", "");;

        boolean result = isPalindrome(Normalized, 0, Normalized.length() - 1);
        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}
