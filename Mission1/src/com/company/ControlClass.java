package com.company;

import java.util.Locale;

public class ControlClass {
    String text;

    public boolean controlText(String text) throws Exception {
        if (isTextEmpty(text) == false) {
            this.text = text;
            text = removeSpaceInText(text);
            return textResult(text);
        } else {
            throw new Exception("Text can not be null");
        }
    }

    String removeSpaceInText(String text) {
        text = text.replaceAll("\\s+", "");
        return text;
    }

    boolean textResult(String text) {
        text = text.toLowerCase(new Locale("tr"));
         for (int i = 0; i < text.length() / 2; i++) {
            String firstHalfCharValue = text.charAt(i) + "";
            String secondtHalfCharValue = text.charAt(text.length() - 1 - i) + "";
            if (!firstHalfCharValue.equals(secondtHalfCharValue)) {
                return false;
            }
        }
        return true;

    }

    public void setText(String text) {

    }

    boolean isTextEmpty(String text) {
        if (text.length() <= 0)
            return true;
        return false;

    }
}
