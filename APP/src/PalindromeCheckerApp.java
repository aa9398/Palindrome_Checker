import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("input : ");
        String input = scanner.nextLine();

        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        boolean isPalendrome = true;

        for (int i = 0; i < input.length(); i++){
            char temp = stack.pop();
            if(input.charAt(i) != temp){
                isPalendrome = false;
            }
        }
        System.out.println("Is Palindrome? : " + isPalendrome);

    }

}
