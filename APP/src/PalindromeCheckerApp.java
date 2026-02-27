import java.util.Scanner;
import java.util.LinkedList;


public class PalindromeCheckerApp {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        System.out.print("input : ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch != ' '){
                list.add(ch);
            }
        }
        boolean isPalendrome = true;

        int left = 0;
        int right = list.size() - 1;

        while(left < right){
            if(list.get(left) != list.get(right)){
                isPalendrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is Palindrome? : " + isPalendrome);

    }
}
