package Week11.Amimal;

public class dog extends Animal{
    public dog() {}
    public dog(String name, int age,String species) {
        super(name, age, species);
    }
    public void displayInfo() {
        System.out.println("age"+age);
        System.out.println("species"+species);
        displayAge();
        displaySpecies();
    }
}
