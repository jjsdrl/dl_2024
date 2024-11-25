package Week11.Amimal;

public class Animal {
    private String name;
    protected int age;
    public String species;
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    public Animal() {};
    private void displayName(){
        System.out.println("Name: " + name);
    }
    protected void displayAge(){
        System.out.println("Age: " + age);
    }
    public void displaySpecies(){
        System.out.println("Species: " + species);
    }
}
