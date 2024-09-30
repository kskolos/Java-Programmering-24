package exercises.practicing_exercises;

public class E3_CarClass {

        private String make;
        private String model;
        private int year;
        private String color;

        public E3_CarClass(){
            make = "default make";
            model = "default model";
            year = 1900;
            color = "default color";
        }

        public E3_CarClass(String make, String model, int year, String color) {
            this.make = make;
            this.color = color;
            this.model = model;
            this.year = year;
        }

        public void printCarDetails(){
            System.out.println("This car is a: " + make + ", " + model);
            System.out.println("Designed in: " + year);
            System.out.println("Presented in the color: " + color);
        }

        public static void main(String[] args) {
            E3_CarClass myCar = new E3_CarClass();
            myCar.printCarDetails();

            E3_CarClass yourCar = new E3_CarClass("Toyota", "Prius", 2024, "Green");
            yourCar.printCarDetails();

        }
    }


