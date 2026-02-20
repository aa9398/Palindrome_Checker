import java.util.Scanner;
public class UseCase1PalindromeApp {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String check = "False";
        System.out.print("Input Text: ");
        String a = input.nextLine();
        char[] chars = a.toCharArray();
        System.out.print("Is it a Palindrome : ");
        for(int i = 0; i < chars.length / 2; i++){
                if(chars[i] != chars[chars.length - 1 - i]){
                    check = "False";
                    break;
                }
                else {
                    check = "True";
                }
        }
        if(check.equals("True")){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
