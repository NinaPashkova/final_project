package com.it.letters;

import java.util.Objects;

public class Letter {
    public String email;
    public String theme;
    public String text;
    public String date;

    @Override
    public String toString() {
        return "Letter{" +
                "email='" + email + '\'' +
                ", theme='" + theme + '\'' +
                ", text='" + text + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return email.equals(letter.email) &&
                theme.equals(letter.theme) &&
                text.equals(letter.text) &&
                date.equals(letter.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, theme, text, date);
    }

    public Letter(String email, String theme, String text, String date) {
        this.email = email;
        this.theme = theme;
        this.text = text;
        this.date = date;
    }


}
