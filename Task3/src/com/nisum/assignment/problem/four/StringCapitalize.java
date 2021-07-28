package com.nisum.assignment.problem.four;

public class StringCapitalize {
    static StringBuilder allCapitalize(String string) {

        StringBuilder stringBuilder = new StringBuilder("");

        for (int s : string.chars().toArray()) {
            if (s >= 97 && s <= 122) {
                s -= 32;
                stringBuilder.append((char) s);
            } else {
                stringBuilder.append((char) s);
            }
        }
        return stringBuilder;

    }

    static StringBuilder startLetter(String string) {
        StringBuilder stringBuilder = new StringBuilder("");
        String[] strings = string.split(" ");
        for (String s : strings) {
            {
                for (int i = 0; i < s.length(); i++) {
                    int a = s.charAt(i);
                    if (a >= 97 && a <= 122 && i == 0) {
                        a -= 32;
                        stringBuilder.append((char) a);
                    } else {
                        stringBuilder.append((char) a);
                    }
                }
                stringBuilder.append(" ");
            }

        }
        return stringBuilder;
    }
}
