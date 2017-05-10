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
        String filledArray = "";
        String holdString = "";
        ArrayList<String> newStrings = new ArrayList<>();
        String[] testArray;
        for (int intConvertToString : nums) {
            newStrings.add(Integer.toString(intConvertToString));
        }

       // testArray = newStrings.

        for (int i = 0; i < newStrings.size(); i++) {
            holdString = newStrings.get(i);
            for (int j = i; j < i + 1; j++) {
                if (holdString == newStrings.get(j+1.)) {

                }else{
                    filledArray = holdString;
                }
            }
              System.out.println(filledArray);
        }

        return "";
    }
    //TODO Define the method compress

    //TODO Define the method pack


}
