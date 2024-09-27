public class E3_Car {

    public class Car {
        String make;
        String model;
        int year;
        String color;
    
        public Car() {
            make = "Toyota";
            model = "Prius";
            year = 2020;
            color = "pink";
        }
    
        public Car(String make, String model, int year, String color) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
        }
        public void printDetails(){
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Color: " + color);
        }

    }
}
