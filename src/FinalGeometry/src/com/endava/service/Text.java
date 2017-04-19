package FinalGeometry.src.com.endava.service;

public enum Text {
    BASE("With what we will play? : \n"
            + "1. Square \n"
            + "2. Rhombus \n"
            + "3. Rectangle \n"
            + "4. Triangle \n"
            + "5. EquilateralTriangle \n"
            + "6. IsoscelesTriangle \n"
            + "7. Circle \n"
            + "8. Ellipse \n"
            + "9. ResizableCircle \n"
            + "10. Exit"),

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
