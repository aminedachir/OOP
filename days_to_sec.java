import java.util.Scanner;
public class days_to_sec{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int days = s.nextInt();
        int sec = ((days*24)*60)*60;
        System.out.println(sec);
    }
}