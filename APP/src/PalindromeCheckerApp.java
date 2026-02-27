import java.util.Scanner;
import java.util.Stack;

    class PalindromeChecker{
    public boolean isPalindrome(String input){
        if (input == null){
            return false;
        }
        input = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }

        for(int i = 0; i< input.length(); i++){
            if(input.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        String input = scanner.nextLine();

        input = input.toLowerCase();
        input = input.toLowerCase().replaceAll("\\s+", "");

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome(input);
        System.out.println("Is Palindrome? :" + result );

        scanner.close();
    }
}
