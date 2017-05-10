package io.zipcoder.microlabs.arrays;


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
        for (String breakfast : inputArray) {

            filledString = breakfast;

        }
        return header + filledString;
    }

    //TODO Define the method reverse

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack


}
