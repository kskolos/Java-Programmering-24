package exercises.practicing_exercises;

public class Dog {
    private String breed;
    private int age;
    private String color;
    private String name;


    public Dog(){
        breed = "unknown breed";
        age = 0;
        color = "unknown color";
        name = "no name";
    }
    
    public Dog(String breed, int age, String color, String name){
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    }

    
