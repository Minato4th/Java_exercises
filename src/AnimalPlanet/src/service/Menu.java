package AnimalPlanet.src.service;

import AnimalPlanet.src.entities.Chappi;
import AnimalPlanet.src.entities.Chupacabra;
import AnimalPlanet.src.entities.Eagle;
import AnimalPlanet.src.entities.Whisks;
import AnimalPlanet.src.util.AnimalManipulator;
import AnimalPlanet.src.util.Validator;


public class Menu {
    private AnimalManipulator animalManipulator;
    private Whisks whisks;
    private Chappi chappi;
    private Eagle eagle;
    private Chupacabra chupacabra;
    private Validator validator;

    public Menu() {
        this.animalManipulator = new AnimalManipulator();
        this.whisks = new Whisks();
        this.chappi = new Chappi();
        this.eagle  = new Eagle();
        this.chupacabra = new Chupacabra();
        this.validator = new Validator();
        mainMenu();
    }

    private void mainMenu() {

        for (int i = 0; i < 3; i++) {

            Text.BASE.getText();
            int choice = validator.convertToNumber();
            if (choice == Numbers.ONE.getNumber()){
                animalManipulator.callAll(whisks);

            }else if (choice == Numbers.TWO.getNumber()){
                animalManipulator.callAll(chappi);
                i--;
            }else if (choice == Numbers.THREE.getNumber()){
                animalManipulator.callAll(eagle);
                i--;
            }else if (choice == Numbers.FOUR.getNumber()){
                animalManipulator.callAll(chupacabra);
                i--;
            }else if (choice == Numbers.FIVE.getNumber()){
                Text.BYE.getText();
                i = 5;
            }else {
                Text.INCORRECT.getText();
            }
        }
    }
}
