package AnimalPlanet.src.entities;

public class Chappi implements Dog {
    @Override
    public boolean itCanGaw() {
        System.out.print("It can Gav ");
        return true;
    }

    @Override
    public boolean itCantSweem() {
        System.out.print("It Cant Sweem ");
        return true;
    }

    @Override
    public boolean itLikeBone() {
        System.out.print("It Like Bone ");
        return true;
    }

    @Override
    public boolean itIsAlive() {
        System.out.print("It Is Alive ");
        return true;
    }

    @Override
    public void itEats() {
        System.out.println("Name is Chappi");
    }

    @Override
    public void itMoves() {
        System.out.println("It Move and even Swing =)");
    }
}
