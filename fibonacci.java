public class fibonacci{
    public static void main(String[] args){
        int next,index=0,b=1;
        int n=10;
        for(int i=1;i<=n;i++){
            System.out.print(" " +index);
            next = index+b;
            index = b;
            b = next;
        }
        System.out.println(" ");
    }
}