import java.util.Scanner;

public class methodes {
    static void hello(String name){
        System.out.println("Hello " + name);
    }
    public static void main (String [] args) {
        Scanner down = new Scanner(System.in);
        String name = down.nextLine();
        hello(name);
    }
}