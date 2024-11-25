package Week10;

import Week11.Amimal.Animal;
import Week11.Amimal.dog;

public class ScopeAndAccessModifiers {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", 5, "Pantheraleo");
        animal.species="Panthera tigris";
        animal.displaySpecies();
//        animal.age=3;
//        animal.displayAge();
        dog dog = new dog("Buddy", 3, "canis lupus familiaris");
        dog.displayInfo();
    }
}
