public class Walrus {
    int age;
    double weight; 
    String name;

    Walrus(int age, double weight, String name){
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    Walrus(){
        this(22, 4.4, "default");
    }

    
    public static void main(String[] args) {

        Walrus janie = new Walrus(5, 55.6, "Janie J");
        Walrus misty = new Walrus(30, 3.3, "Misty Moo");
        System.out.println("Congrats! Your new Walrus(s) name(s) are/is " + janie.name + " and " + misty.name);


    }
}