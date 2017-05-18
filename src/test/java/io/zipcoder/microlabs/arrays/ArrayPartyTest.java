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


    @Test
    public void compressTest() {
        //Given
        int[] nums = {1, 1, 3, 3, 3, 2, 2, 2, 1, 1, 1, 1, 4, 4, 4, 4};
        String expected = "1\n3\n2\n1\n4";
        ArrayParty arrayParty = new ArrayParty();
        //When
        String actual = arrayParty.compress(nums);
        //Then
        Assert.assertEquals(expected, actual);


    }


    @Test
    public void packTest() {
        //Given
        char[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd',
                'e', 'e', 'e', 'e'};
        String expected = "aaaa, b, cc, aa, d, eeee";
        ArrayParty arrayParty = new ArrayParty();

        //When
        String actual = arrayParty.pack(letters);
        //Then
        Assert.assertEquals(expected, actual);
    }


}
