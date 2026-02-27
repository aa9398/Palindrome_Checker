import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase1PalindromeApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Stack <Character> stack = new Stack<>();
        System.out.print("input : ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch != ' '){
                queue.add(ch);
                stack.push(ch);
            }
        }
        boolean isPalendrome = true;

        for (int i = 0; i < input.length(); i++){
            char temp1 = stack.pop();
            char temp2 = queue.remove();
            if(temp2 != temp1){
                isPalendrome = false;
            }
        }
        System.out.println("Is Palindrome? : " + isPalendrome);

        }

    }

