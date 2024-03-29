package com.zad2.zad2;

/**
 * Class which is formated to JSON.
 */

public class Content {
    public final String string;
    public final long numberCounter;
    public final long lowerCaseCounter;
    public final long upperCaseCounter;
    public final long specialCharCounter;

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

    private long countNumbers(String string){
        return string.chars().filter(Character::isDigit).count();
    }

    /**
     * Method counting lower case letters in string.
     * @param string
     * @return lowerCaseCount
     */

    private long countLowerCase(String string){
        return string.chars().filter(Character::isLowerCase).count();
    }

    /**
     * Method counting upper case letters in string.
     * @param string
     * @return upperCaseCount
     */

    private long countUpperCase(String string){
        return string.chars().filter(Character::isUpperCase).count();
    }

    /**
     * Method counting special case characters in string.
     * @param string
     * @return
     */

    private long countSpecialChar(String string){
        return string.length() - countLowerCase(string) - countNumbers(string) - countUpperCase(string);
    }
}
