public class Example {
    public static void main (String [] args) {
        Student amine = new Student("Amine","dachir",20,38478307);
        amine.display();
    }
}


class Student {
    String first_name;
    String last_name;
    int age;
    long matricule;

    public Student (String f, String l, int a, int m){
        this.first_name = f;
        this.last_name = l;
        this.age = a;
        this.matricule = m;
    }
    public void display(){
        System.out.println("Student : " + first_name + last_name + age + matricule);
    }
}