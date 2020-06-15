package com.company;
import java.util.Scanner;
public class String_Practice {
    public static Scanner Keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Type any phrase: ");
        String phrase = Keyboard.nextLine();
        int phraseLength = phrase.length();
        int indexOf = phrase.indexOf(" ");

        String firstWord = phrase.substring(0, indexOf+1);
        System.out.println(firstWord);
        char character = ' ';
        int charCount = 0;

        for (int index = 0; index < firstWord.length(); index++) {
            character = firstWord.charAt(index);
            if (character != ' ') {
                charCount++;
                String temp = phrase.substring(index + 1);
                indexOf = temp.indexOf(character);
                while (indexOf >= 0) {
                    charCount++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(character);
                }
                firstWord = firstWord.replace(character, ' ');
                System.out.println(character + " " + charCount);
                charCount = 0;

            }
        }

    }

}

