package org.example.morsecodegui;

public class Services {
    static Mapper mapperOBJ = new Mapper();

    static String makeMorseCodefromString(String input) {

        String wordmade = "";
        for (int i = 0; i < input.length(); i++) {
            char morseChar = input.charAt(i);

            if (morseChar != ' ') {
                wordmade += mapperOBJ.getMorseSymbol(morseChar);
                wordmade += " ";
            }
            if (morseChar == ' ') {
                wordmade += "/ ";
            }
        }
        return wordmade;
    }

    static String makeStringfromMorseCode(String inputMorse) {

        String setofString2 = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputMorse.length(); i++) {
            char c2 = inputMorse.charAt(i);

            if (c2 == '-' || c2 == '.') {
                setofString2 += String.valueOf(c2);

            } else if (c2 == ' ') {
                if (setofString2.isEmpty()) {
                    continue;
                }
                sb.append(mapperOBJ.getMorseAlphabet(setofString2));
                setofString2 = "";
            } else if (c2 == '/') {
                sb.append(" ");
            } else {
                System.out.println("else part agani");
            }
        }
        if (!setofString2.isEmpty()) {
            sb.append(mapperOBJ.getMorseAlphabet(setofString2));
        }
        return sb.toString();
    }

    static void main() {
        System.out.println(makeStringfromMorseCode(".- -... / -.-. -.. / ."));
        System.out.println();
        System.out.println(makeMorseCodefromString("hi hi hi"));
    }
}