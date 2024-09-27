

public class E3_Class {
    String name;
    int age;
    double grade;

    public E3_Class(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    
    public static void main(String[] args) {
        E3_Class class1 = new E3_Class("Jane", 5, 5);

        class1.printDetails();


    }
}
