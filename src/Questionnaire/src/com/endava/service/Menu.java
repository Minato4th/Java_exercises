package Questionnaire.src.com.endava.service;

import Questionnaire.src.com.endava.entities.People;
import Questionnaire.src.com.endava.util.Validator;

public class Menu {
    private People people;
    private Validator validator;

    public Menu() {
        this.people = new People();
        this.validator = new Validator();
        mainMenu();
    }

    public void mainMenu(){

        System.out.println(Text.HELOO);
        people.setName(validator.isString());

        System.out.println(Text.DATA);
        people.setBirth(validator.isDateFormat());
        people.setAge(validator.currentAge());

        System.out.println(Text.ADDRES);
        people.setAddress(validator.isString());

        System.out.println(Text.NUMBER);
        people.setCellphone(validator.isDigit());

        System.out.println(Text.HOB);
        people.setHobbies(validator.isString());

        System.out.println(Text.ADDITION);
        people.setAdditional(validator.isString());

        System.out.println("Name : " + people.getName());
        System.out.println("Age : " + people.getAge());
        System.out.println("Date of Birth : " + people.getBirth());
        System.out.println("Address : " + people.getAddress());
        System.out.println("Cell Phone Number : " + people.getCellphone());
        System.out.println("Hobbies : " + people.getHobbies());
        System.out.println("Additional : " + people.getAdditional());
    }

}
