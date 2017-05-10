package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastButOneTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nTomatoes";

        //: When
        String actual = arrayParty.lastButOne(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }


    @Test
    public void reverseTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage" +
                "Tails";

        //: When
        String actual = arrayParty.reverse(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void isPalindromeTest() {
        //: Given
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();

        //: When
        boolean palindromeTrue = arrayParty.isPalindrome(palindromic);
        boolean palindromeFalse = arrayParty.isPalindrome(breakfast);

        //: Then
        Assert.assertTrue(palindromeTrue);
        Assert.assertFalse(palindromeFalse);
    }


    //TODO Define the method isPalindromeTest

    //TODO Define the method compressTest

    //TODO Define the method packTest


}
