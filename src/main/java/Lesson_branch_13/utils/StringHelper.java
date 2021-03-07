package Lesson_branch_13.utils;

import Lesson_branch_13.exceptions.EmptyStringException;

public class StringHelper {

    public static String checkString(String word, char[] symbols) throws NullPointerException, EmptyStringException {
        String anotherWord;
        if (symbols == null) {
            throw new NullPointerException();
        } else {
            anotherWord = new String(symbols);
        }

        if (!word.isEmpty() && !anotherWord.isEmpty()) {
            word = word.toUpperCase();
            anotherWord = anotherWord.toLowerCase();
            word = word.trim();
            anotherWord = anotherWord.trim();
            String unitedString = word.concat(" ").concat(anotherWord);
            int stringLength = unitedString.length();
            if (stringLength % 2 == 0) {
                return unitedString.substring(stringLength / 2 - 1, stringLength / 2 + 1);
            } else {
                return unitedString.substring(stringLength / 2, stringLength / 2 + 1);
            }
        } else {
            throw new EmptyStringException();
        }
    }
}
