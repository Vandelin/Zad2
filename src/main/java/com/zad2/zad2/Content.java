package com.zad2.zad2;

/**
 * Class which is formated to JSON.
 */

public class Content {
    private final String string;
    private final long numberCounter;
    private final long lowerCaseCounter;
    private final long upperCaseCounter;
    private final long specialCharCounter;

    /**
     * Constructor gets string parameters.
     * @param string
     */

    public Content(String string) {
        this.string = string;
        numberCounter = countNumbers(string);
        lowerCaseCounter = countLowerCase(string);
        upperCaseCounter = countUpperCase(string);
        specialCharCounter = countSpecialChar(string);
    }

    /**
     * Method counting numbers in some string.
     * @return numbersCount
     */

    private int countNumbers(String string){
        return string.chars().filter(Character::isDigit).sum();
    }

    /**
     * Method counting lower case letters in string.
     * @param string
     * @return lowerCaseCount
     */

    private int countLowerCase(String string){
        return string.chars().filter(Character::isLowerCase).sum();
    }

    /**
     * Method counting upper case letters in string.
     * @param string
     * @return upperCaseCount
     */

    private int countUpperCase(String string){
        return string.chars().filter(Character::isUpperCase).sum();
    }

    /**
     * Method counting special case characters in string.
     * @param string
     * @return
     */

    private int countSpecialChar(String string){
        return string.length() - countLowerCase(string) - countNumbers(string) - countUpperCase(string);
    }
}
