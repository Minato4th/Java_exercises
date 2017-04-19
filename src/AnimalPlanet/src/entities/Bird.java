package AnimalPlanet.src.entities;

public abstract class Bird implements Animal{
    private String fly;
    @Override
    public void itMoves() {
        this.fly = "Flying and Moving";
    }

    public abstract void flying();
    public abstract void liveOn();
    public abstract void getName();
}
