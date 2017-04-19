package AnimalPlanet.src.util;

import AnimalPlanet.src.entities.*;

public class AnimalManipulator {

    public void callAll(Animal animal){
        animals(animal);
        if (animal instanceof Cat)cat((Cat) animal);
        if (animal instanceof Dog)dog((Dog) animal);
        if (animal instanceof Bird)bird((Bird) animal);
        if (animal instanceof AlienAnimal)alien((AlienAnimal) animal);
    }

    private void animals(Animal animal){
        System.out.println(animal.itIsAlive());
        animal.itEats();
        animal.itMoves();
    }

    private void cat(Cat cat){
        System.out.println(cat.itCanMew());
        System.out.println(cat.itCantSweem());
        System.out.println(cat.itLikeFish());
    }

    private void dog(Dog dog){
        System.out.println(dog.itCanGaw());
        System.out.println(dog.itCantSweem());
        System.out.println(dog.itLikeBone());
    }

    private void bird(Bird bird){
        bird.flying();
        bird.liveOn();
        bird.getName();
    }

    private void alien(AlienAnimal alienAnimal){
        alienAnimal.canHeel();
        alienAnimal.danger();
        alienAnimal.nyasha();
    }
}
