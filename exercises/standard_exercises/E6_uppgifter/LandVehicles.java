package exercises.standard_exercises.E6_uppgifter;

public class LandVehicles extends Vehicles{

    int kms = 0;
    boolean isDriving = false;



    void Drive(){
       this.isDriving = true;
        kms++;
        System.out.println();
       }

    }
    
}
