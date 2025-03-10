import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        int a,b,s;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        s = a+b;
        System.out.println("the sum : " + s);
        scanner.close();
    }
}