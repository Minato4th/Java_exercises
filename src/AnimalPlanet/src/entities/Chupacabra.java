package AnimalPlanet.src.entities;

public class Chupacabra extends AlienAnimal {

    @Override
    public void danger() {
        System.out.println("Danger - Nope");
    }

    @Override
    public void canHeel() {
        System.out.println("Can Heel - Yeas");
    }

    @Override
    public void nyasha() {
        System.out.println("Nyasha  - mmmm.. its pink and small");
    }

    @Override
    public boolean itIsAlive() {
        System.out.print("It Is Alive ");
        return true;
    }

    @Override
    public void itEats() {
        System.out.println("It Eats - Not shore, hope it don't like eat People");
    }

    @Override
    public void itMoves() {
        System.out.println("It Moves - It's like it is teleporting");
    }
}
