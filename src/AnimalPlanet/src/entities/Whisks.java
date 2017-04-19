package AnimalPlanet.src.entities;

public class Whisks implements Cat {
    @Override
    public boolean itCanMew() {
        System.out.print("It CanMew - ");
        return true;
    }

    @Override
    public boolean itCantSweem() {
        System.out.print("It Can Sweem -");
        return false;
    }

    @Override
    public boolean itLikeFish() {
        System.out.print("It Like Fish -");
        return true;
    }

    @Override
    public boolean itIsAlive() {
        System.out.print("It Is Alive -");
        return true;
    }

    @Override
    public void itEats() {
        System.out.println("It Eats - Whisks more than Fish");
    }

    @Override
    public void itMoves() {
        System.out.println("It Moves - 4 legs, and very fast");
    }
}
