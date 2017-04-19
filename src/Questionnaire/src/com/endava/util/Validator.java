package Questionnaire.src.com.endava.util;

import Questionnaire.src.com.endava.service.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private BufferedReader reader;
    private String string;
    private Pattern date;
    private Matcher matcher;

    public Validator(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.date = Pattern.compile("(^\\d{2})([.])(\\d{2})([.])(\\d{4}$)");
    }

    private boolean isEmpty(){
        return string.length() == 0;
    }

    public String isString(){

        for (int i = 0; i < 3; i++) {
            try {
                this.string = reader.readLine();
            } catch (IOException e) {
                System.out.println(Text.INCSTR);
            }

            if (!isEmpty()){
                i = 5;
            } else {
                System.out.println(Text.EMPTY);
            }
        }

        return string;
    }

    public int isDigit(){

        for (int j = 0; j < 3; j++) {
            boolean right = true;
            String numS = isString();
            for (int i = 0; i < numS.length(); i++) {
                if (!Character.isDigit(numS.charAt(i))){
                    System.out.println(Text.INCNUM);
                    right = false;
                    break;
                }
            }

            if (right) {
                j = 5;
                this.string = numS;
            }
        }

        return Integer.parseInt(this.string);
    }

    public String isDateFormat(){

        for (int i = 0; i < 4; i++) {
            string = isString();

            if (correct(string)){
                i = 5;
            } else {
                System.out.println(Text.INCDATE);
                System.out.println(Text.DATA);
            }
        }

        return string;
    }

    private boolean correct(String number){
        if ((matcher = date.matcher(number)).matches()){
            return Integer.parseInt(number.substring(0, 2)) < 32 && Integer.parseInt(number.substring(0, 2)) >= 1 &&
                    Integer.parseInt(number.substring(3, 5)) < 13 && Integer.parseInt(number.substring(3, 5)) >= 1;
        } else return false;
    }

    public int currentAge(){
        Date dateNow = new Date();
        String dateSTR = dateNow.toString();

        if (dateNow.getDate() <= Integer.parseInt(string.substring(0, 2))){
            if ((dateNow.getMonth() + 1) <= Integer.parseInt(string.substring(3, 5))){
                return Integer.parseInt(dateSTR.substring(25, 29)) - Integer.parseInt(string.substring(6, 10)) + 1;
            }
            else {
                return Integer.parseInt(dateSTR.substring(25, 29)) - Integer.parseInt(string.substring(6, 10));
            }
        } else {
            return Integer.parseInt(dateSTR.substring(25, 29)) - Integer.parseInt(string.substring(6, 10));
        }
    }

}
