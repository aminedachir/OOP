public class test{
    public static void main(String[] args){
        int n=0;
        int k=1;
        do {
            if(n%2 == 0){System.out.println(n+"is even");n+=3;continue;}
            if(n%3 == 0){System.out.println(n+"is multiple of 3");n+=5;}
            if(n%5 == 0){System.out.println(n+"is multiple of 5\n");break;}
            n+=1;
        }while(k==1);
        System.out.println("the final value of n is :"+n);
    }
}