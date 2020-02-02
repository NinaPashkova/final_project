package com.it.letters;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class LetterFactory {
    private static ResourceBundle resourceLetter = ResourceBundle.getBundle("letter");
    private static String date = LetterFactory.getDate();



    public static Letter sendLetter() {
        return new Letter(resourceLetter.getString("email"),
                resourceLetter.getString("theme"),
                resourceLetter.getString("text"), date);
    }



    public static String getDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d.MM.YYYY, HH:mm");
        String date = simpleDateFormat.format(new Date());
        return date;
    }
}
