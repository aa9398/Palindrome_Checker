import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;


public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();
        System.out.print("input : ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch != ' '){
                deque.addFirst(ch);
            }
        }
        boolean isPalendrome = true;

        for (int i = 0; i < input.length()/2; i++){
            char temp1 = deque.removeFirst();
            char temp2 = deque.removeLast();
            if(temp2 != temp1){
                isPalendrome = false;
            }
        }
        System.out.println("Is Palindrome? : " + isPalendrome);

    }
}
