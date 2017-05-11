package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;

public class ArrayParty {

    public String printArray(String[] inputArray) {

        String header = "*** Output ***";
        String filledString = "";
        for (String breakfast : inputArray) {
            filledString += "\n" + breakfast;
            // System.out.println(breakfast);
        }
        return header + filledString;
    }

    public String lastElement(String[] inputArray) {
        String header = "*** Output ***\n";
        String filledString = "";
        for (String breakfast : inputArray) {
            filledString = breakfast;
        }
        return header + filledString;
    }

    public String lastButOne(String[] inputArray) {
        String header = "*** Output ***\n";
        String filledString = "";
        for (int i = 0; i < inputArray.length; i++) {
            filledString = inputArray[inputArray.length - 2];
        }
        return header + filledString;
    }

    public String reverse(String[] inputArray) {
        String header = "*** Output ***";
        String filledString = "";
        for (int i = inputArray.length; i > 0; i--) {
            filledString += "\n" + inputArray[i - 1];
        }
        filledString += "Tails";
        return header + filledString;
    }

    public boolean isPalindrome(String[] testArray) {
        for (int i = 0, j = testArray.length; i < testArray.length && j > 0; i++, j--) {
            if (!testArray[i].equals(testArray[j - 1])) {
                return false;
            }
        }
        return true;
    }

    public String compress(int[] nums) {
        String fillerString = "";
        ArrayList<String> newStrings = new ArrayList<>();
        for (int intConvertToString : nums) {
            newStrings.add(Integer.toString(intConvertToString));
        }

        for (int i = 0; i < newStrings.size() - 1; i++) {
            for (int j = i; j < newStrings.size(); j++) {
                if (i != newStrings.size()) {
                    if (newStrings.get(i).equals(newStrings.get(i + 1))) {
                        newStrings.remove(i + 1);
                    }
                }
            }
            if (i == newStrings.size() - 2) {
                fillerString += newStrings.get(i);
            } else {
                fillerString += newStrings.get(i) + "\n";
            }
            System.out.println(newStrings.get(i));
        }
        return fillerString;
    }

    public String pack(char[] letters) {
        String result = "";
        String charCombination;
        ArrayList<String> newStrings = new ArrayList<>();
        for (char charConvertToString : letters) {
            newStrings.add(Character.toString(charConvertToString));
        }

       result+= newStrings.get(0);

        for (int i = 1; i < newStrings.size() ; i++) {

            charCombination = newStrings.get(i);
            if (!charCombination.equals(newStrings.get(i - 1))) {
                result +=", ";
            }
            result += charCombination;
        }

        return result;
    }


}