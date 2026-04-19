package org.example.morsecodegui;

import java.lang.Character;
import java.lang.String;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class Mapper {

    BiMap<String, String> MorseAlphas = HashBiMap.create();

    String getMorseAlphabet(String symbols) {
        return MorseAlphas.inverse().get(symbols);
    }

    String getMorseSymbol(Character letter) {
        letter = Character.toUpperCase(letter);
        String sLetter = String.valueOf(letter);
        return MorseAlphas.get(sLetter);
    }

    String getMorseSymbol(String letters) {
        String StringText = letters.toUpperCase();
        String MorseText;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < StringText.length(); i++) {
            char charString = StringText.charAt(i);

//            System.out.println(charString);
            temp.append(getMorseSymbol(charString));
            temp.append(" ");
            if(charString == '\0'){

            }
        }
        return temp.toString();

    }

    Mapper() {
        // Character to MorseCode, use get()
        // MorseCode to Character, use inverse().get()

        // Letters
        MorseAlphas.put("A", ".-");
        MorseAlphas.put("B", "-...");
        MorseAlphas.put("C", "-.-.");
        MorseAlphas.put("D", "-..");
        MorseAlphas.put("E", ".");
        MorseAlphas.put("F", "..-.");
        MorseAlphas.put("G", "--.");
        MorseAlphas.put("H", "....");
        MorseAlphas.put("I", "..");
        MorseAlphas.put("J", ".---");
        MorseAlphas.put("K", "-.-");
        MorseAlphas.put("L", ".-..");
        MorseAlphas.put("M", "--");
        MorseAlphas.put("N", "-.");
        MorseAlphas.put("O", "---");
        MorseAlphas.put("P", ".--.");
        MorseAlphas.put("Q", "--.-");
        MorseAlphas.put("R", ".-.");
        MorseAlphas.put("S", "...");
        MorseAlphas.put("T", "-");
        MorseAlphas.put("U", "..-");
        MorseAlphas.put("V", "...-");
        MorseAlphas.put("W", ".--");
        MorseAlphas.put("X", "-..-");
        MorseAlphas.put("Y", "-.--");
        MorseAlphas.put("Z", "--..");

        // Numbers
        MorseAlphas.put("0", "-----");
        MorseAlphas.put("1", ".----");
        MorseAlphas.put("2", "..---");
        MorseAlphas.put("3", "...--");
        MorseAlphas.put("4", "....-");
        MorseAlphas.put("5", ".....");
        MorseAlphas.put("6", "-....");
        MorseAlphas.put("7", "--...");
        MorseAlphas.put("8", "---..");
        MorseAlphas.put("9", "----.");

        // Special characters
        MorseAlphas.put(".", ".-.-.-");
        MorseAlphas.put(",", "--..--");
        MorseAlphas.put("?", "..--..");
        MorseAlphas.put("!", "-.-.--");
        MorseAlphas.put(":", "---...");
        MorseAlphas.put(";", "-.-.-.");
        MorseAlphas.put("'", ".----.");
        // MorseAlphas.put("\"", ".-..-.");
        MorseAlphas.put("/", "-..-.");
        MorseAlphas.put("(", "-.--.");
        MorseAlphas.put(")", "-.--.-");
        MorseAlphas.put("&", ".-...");
        MorseAlphas.put("@", ".--.-.");
        MorseAlphas.put("=", "-...-");
        MorseAlphas.put("+", ".-.-.");
        MorseAlphas.put("-", "-....-");
        MorseAlphas.put("_", "..--.-");
        MorseAlphas.put("$", "...-..-");
    }
}
