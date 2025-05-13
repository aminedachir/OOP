import java.util.Scanner;

public class getter_setter {

    public String name;
    public int age;
    
    public int getAge() {
        return age;
        
    }
    public void setAge(int age) {
        this.age = age;
        
    }

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String name = read.nextLine();
       int age = read.nextInt();
       getter_setter student = new getter_setter();
       student.name = name;
       
       if (age < 0){
           System.out.println("Invalid age");
           student.setAge(0);
       }
       else {
           student.setAge(age);
       }
       
       
       System.out.println("Name: " + student.name);
       System.out.println("Age: " + student.getAge());
   }
}


