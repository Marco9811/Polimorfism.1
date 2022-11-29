package it.develope;

public class Tester {
    public static void main(String[] args) {
        Animal animal = new Animal("Fido");
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Sandra");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
