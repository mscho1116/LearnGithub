import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("hello world");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a phrase");
        String s = scanner.nextLine();

        if(s.equals("Matthew")){
            System.out.println("My name");
        }
        else{
            System.out.println("Not my name");
        }
        scanner.close();
    }
}