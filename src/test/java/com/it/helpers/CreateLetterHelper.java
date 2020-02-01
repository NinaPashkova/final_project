package com.it.helpers;

import com.it.letters.Letter;
import com.it.pages.CreateLetterPage;

public class CreateLetterHelper extends CreateLetterPage {
    public void newLetter(Letter letter) {
        sendLetter(letter.email, letter.theme, letter.text);
    }
}
