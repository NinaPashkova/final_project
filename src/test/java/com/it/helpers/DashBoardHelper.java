package com.it.helpers;

import com.it.letters.Letter;
import com.it.pages.DashBoardPage;

public class DashBoardHelper extends DashBoardPage {
    public Letter getLetter (){
        openInboxLetters();
        openLastLetter();
        return new Letter(getLbEmailFrom().getText(), getLbTheme().getText(),
                getLbText().getText(), getLbDate().getAttribute("title"));
    }

}
