package oop;

public class Helper {
    public static String alternateString(String message) {
        return alternateString(message, " ");
    }

    public static String alternateString(String message, String delimiter) {
        if (message == null || delimiter == null) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        for (int index = 0; index < message.length(); index++) {
            result.append(message.charAt(index));
            if (index != message.length() - 1) {
                result.append(delimiter);
            }
        }

        return result.toString();
    }
}
