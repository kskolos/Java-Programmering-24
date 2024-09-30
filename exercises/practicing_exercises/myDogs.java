package exercises.practicing_exercises;

public class myDogs {

    public static void presentDogs(){
        Dog daisy = new Dog("Labrador Retreiver", 3, "Dudley Yellow", "Daisy");
        getInfo(daisy);

        Dog molly = new Dog("Labrador Retreiver", 13, "Golden", "Molly");
        getInfo(molly);
    }

  
    
   public static void getInfo(Dog dog){
        System.out.println();
        System.out.println("My dog's name is " + dog.getName() + ". ");
        System.out.println("They are a " + dog.getColor() + " " + dog.getBreed() + ". ");
        System.out.println("They are " + dog.getAge() + " years old.");
        System.out.println();
    }

    public static void main(String[] args) {
        presentDogs();

    }
    }
