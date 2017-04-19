package AnimalPlanet.src.service;

public enum Text {
    BASE("Please chose animal \n"
            + "1. Cat \n"
            + "2. Dog \n"
            + "3. Bird \n"
            + "4. Alien Animal \n"
            + "5. Exit \n"),

    BYE("Good Bye!"),
    INCORRECT("Incorrect command, try again!"),
    EMPTY_STRING("Empty String, please insert data again"),
    ERROR_STRING("Error String format, try again"),
    WRONG_NUMBER("Wrong number format, please try again");

    private String text;

    Text(String text) {
        this.text = text;
    }

    public void getText() {
        System.out.println(text);
    }
}
