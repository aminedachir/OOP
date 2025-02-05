import java.util.Scanner;

public class Fahrenheit{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int Celsius = scn.nextInt();
        int Farenheit = Celsius * (9/5) +32;
        System.out.println("The temperature in Fahrenheit_ is : " + Farenheit); 
        scn.close();
    }
}