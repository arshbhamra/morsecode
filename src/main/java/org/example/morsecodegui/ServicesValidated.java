package org.example.morsecodegui;

public class ServicesValidated {
    private static final Mapper mapperOBJ = new Mapper();

    static String makeMorseCodefromString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                out.append("/ ");
                continue;
            }

            String morse = mapperOBJ.getMorseSymbol(ch);
            if (morse == null) {
                throw new IllegalArgumentException("Unknown character at index " + i + ": '" + ch + "'");
            }
            out.append(morse).append(' ');
        }
        return out.toString();
    }

    static String makeStringfromMorseCode(String inputMorse) {
        if (inputMorse == null || inputMorse.isBlank()) {
            return "";
        }

        // Tokens are separated by spaces. Use "/" as a word separator.
        StringBuilder out = new StringBuilder();
        String[] tokens = inputMorse.trim().split("\\s+");
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("/")) {
                out.append(' ');
                continue;
            }

            if (!token.matches("[.-]+")) {
                throw new IllegalArgumentException("Invalid morse token at position " + i + ": '" + token + "'");
            }

            String letter = mapperOBJ.getMorseAlphabet(token);
            if (letter == null) {
                throw new IllegalArgumentException("Unknown morse sequence at position " + i + ": '" + token + "'");
            }
            out.append(letter);
        }
        return out.toString();
    }
}

