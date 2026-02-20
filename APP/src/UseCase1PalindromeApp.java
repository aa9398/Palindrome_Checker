import java.util.Scanner;
public class UseCase1PalindromeApp {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String check = "False";
        System.out.print("Input Text: ");
        String a = input.nextLine();
        String b = "";
        System.out.print("Is it a Palindrome : ");
        for(int i = a.length() -1; i >= 0; i--){
            b = b + a.charAt(i);
        }
        for(int i = 0; i < a.length() - 1; i++){
                if(a.charAt(i) != b.charAt(i)){
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
