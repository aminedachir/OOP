import java.util.Scanner;
import java.util.Arrays;

public class exo4{
    public static void main(String[] args){
        int[] T={2,3,4,5,6,7,8,9,10,11,12};
        int[] T_ = new int[11]; 
        int count=0;
        for(int i=0;i<70000;i++){
            int s = (int) (Math.random() * 6) + 1;
            int z = (int) (Math.random() * 6) + 1;
            int sum = s+z;
            for(int j=0;j<10;j++){
                if(sum == T[j]){
                    T_[j]++;
                }
            }
        }
        int max = T_[0]; 
        int index = 0; 
        for (int i = 1; i < 11; i++) { 
            if (T_[i] > max) {
                max = T_[i];
                index = i;
            }
        }
        System.out.println("The most sum is " + T[index] + " it replay " + max);
    }
}