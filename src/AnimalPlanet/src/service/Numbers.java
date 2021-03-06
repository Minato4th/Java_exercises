package AnimalPlanet.src.service;

public enum Numbers {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHTH(8), NINE(9);

    private int number;

    Numbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
