public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person p = new Person("Alice", 25);
        p.displayInfo();
    }
}

// Class with a constructor
class Person {
    String name;
    int age;

    // Constructor
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
