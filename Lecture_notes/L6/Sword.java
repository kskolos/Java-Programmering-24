package Lecture_notes.L6;

public class Sword implements Weapon{
    public int attackPower = 15;

    @Override
    public void Attack() {
        System.out.println("You attack with your sword!");
    }

    @Override
    public void Drop() {
        System.out.println("You drop your sword.");
    }

}
