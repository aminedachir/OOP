import java.util.Scanner;
public class conditions{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int amount = scn.nextInt();
        if (amount <= 12000){
            System.out.println("yes");
        }
    }
}