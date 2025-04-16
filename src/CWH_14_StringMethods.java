package com.mycompony.src;


public class CWH_14_StringMethods {
    public static void main(String[] args) {
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
        //ALL THE METHODS LISTED BELOW ARE ONLY and ONLY FOR STRINGS and not for INT, FLOAT,  SHORT or anymore other types of data types
        // first method is [ stringVariable.length() ]  this method is used to measure the length of the string
        System.out.println("no. 1 ");

        String s = "sachin sharma";

        int i = "sachin sharma".length();   //method 1
        //System.out.println(i);
        // OR
        int i2 = s.length();
        System.out.println(i2);   //method 2
        //OR
        System.out.println("sachin sharma".length());  //method 3
        //OR
        System.out.println(s.length());  // method 4
        //NOTE: the four separate types of methods that we have used above and divided them in four different types will be applicable in all the following
        //types of String Methods, Actually these all four types of methods give us the same output, they are just separate ways to take output
        // we can use any one of them of our choice...


        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 2");
        //The Second method is [ stringVariable.trim() ] this method is used to remove unwanted white space from the String
        String s2 = "        sachin sharma      ";
        System.out.println(s2);
        //here we are printing normally without the trim method, so the output will include the white space too


        String trimmedString = s2.trim();  // this will remove the white space from the beginning and from the ending of the string
        System.out.println(trimmedString);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 3 ");
//The Third method is [ stringVariable.toLowerCase() ] - this method is used to convert the string from Upper Case to Lower Case
        String originalUpperCase = "SACHIN SHARMA";
        String lowerCaseString = originalUpperCase.toLowerCase();
        System.out.println(lowerCaseString);

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 4 ");
//The Fourth Method is [ stringVariable.toUpperCase() ] - this method is used to convert the string from Lower Case to Upper Case
        String originalLowerCase = "sachin sharma";
        String upperCaseString = originalLowerCase.toUpperCase();

        System.out.println(upperCaseString);
        System.out.println(originalLowerCase.toUpperCase());

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 5");
//The Fifth Method is [ stringVariable.substring(startIndex) ] - this method is used to get the substring starting from a specific index
        String sentenceForStartOnly = "Sachin Sharma ";
        String subStringFromStart = sentenceForStartOnly.substring(3);
        System.out.println(subStringFromStart);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 6 ");
//The Sixth Method is [ stringVariable.substring(startIndex, endIndex) ] - this method is used to get a substring between specific start and end indexes

        String sentenceForStartEnd = "sachin sharma jai shree ram ";
        String subStringRange = sentenceForStartEnd.substring(14, 28);
        System.out.println(subStringRange);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 7");
//The Seventh method is [ stringVariable.replace(target, replacement) ] - this method is used to replace a specific word or character with another
        String replaceOriginal = "sachin sharma ";
        String replacedString = "Sachin sharma".replace("sharma", "musician");
        System.out.println(replacedString);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 8 ");
// The Eighth Method is [ stringVariable.startsWith("prefix") ] - this method checks if the string starts with the given prefix
        String checkStart = "Sachin";
        Boolean doesStart = checkStart.startsWith("Sachin");
        System.out.println(doesStart);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 9");
//The Ninth Method is [ stringVariable.endsWith("suffix") ] - this method checks if the string ends with the given suffix
        String checkEnd = "Sachin ";
        boolean doesEnd = checkEnd.endsWith("n");
        System.out.println(doesEnd);

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 10");
// The Tenth Method is [ stringVariable.charAt(index) ] - this method returns the character at a specific index
        String charCheck = "sachin sharma ";
        char charAtIndex = checkEnd.charAt(1);
        System.out.println(charAtIndex);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 11");
// The Eleventh Method is [ stringVariable.indexOf("charOrString") ] - this method returns the index of the first occurrence of the specified character or string
        String indexExample = "sachin sharma ";
        int firstIndex = indexExample.lastIndexOf("s");
        System.out.println(firstIndex);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 12");
// TheTwelfth Method is [ stringVariable.indexOf("char", fromIndex) ] - this method returns the index of a character starting search from a given index
        String indexWithOffset = "sachin sharma";
        int offsetIndex = indexWithOffset.indexOf("s", 3);
        System.out.println(offsetIndex);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 13");
// TheThirteenth Method is [ stringVariable.lastIndexOf("char") ] - this method returns the last index of the specified character
        String lastIndexExample = "sachin sharma";
        int lastIndex = lastIndexExample.lastIndexOf("a");
        System.out.println(lastIndex);

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 14");
// The Fourteenth Method is [ stringVariable.indexOf("char", fromIndex) ] again - used to find character from a specific index if it appears multiple times
        String anotherIndexExample = "sashin shasma";
        int indexWithStart = anotherIndexExample.indexOf("s", 3);
        System.out.println(indexWithStart);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 15");
// The Fifteenth Method is [ stringVariable.equals("value") ] - this method checks if two strings are exactly equal (case-sensitive)
        String matchExact = "sachin sharma";
        boolean isEqual = matchExact.equals("sachin sharma");
        System.out.println(isEqual);

// this method is Case Sensitive

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("no. 16");
// The Sixteenth Method is [ stringVariable.equalsIgnoreCase("value") ] - this method checks if two strings are equal ignoring the case
        String ignoreCaseMatch = "sachin sharma";
        boolean isEqualIgnoreCase = ignoreCaseMatch.equalsIgnoreCase("SaChIn ShArma");
        System.out.println(isEqualIgnoreCase);
// this method is not the Case Sensitive method, it only focuses on the alphabets instead of also focusing on Cases


        System.out.println("no. 17");// The Seventeenth method is [ stringVariable.compareTo( )] this method is used to compare two strings lexicographically. It is similar to the equals() method but the thing that is special in it is that it stops as soon as a difference is found and returns a positive, negative, or zero value based on the comparison. Lexicographical means comparing strings based on the dictionary order of their characters.

        String s17_1 = "Sachin Sharma";
        String s17_2 = "Sachin sharma";
        int result = s17_1.compareTo(s17_2);
        System.out.println(result);

// When the result is 0, it means both strings are **equal** (i.e., they are lexicographically identical).
// When the result is negative, it means the first string is **lexicographically smaller** than the second string.
// When the result is positive, it means the first string is **lexicographically greater** than the second string.
// The comparison stops as soon as the first difference is found.


        //                 </ Here Our all 17 methods of Strings have now been Finished />


        //   The escape sequence characters

        System.out.println("sachin sharma \nis a good boy ");


    }
}

// ROUGH WORK 2 CLASS ME EK ERROR AA RHA H JISME DOUBT AA RHA H  USS DOUBT K0 CLEAR KARNA H STRING VALUE KO PRINT KARNE ME . USSE ZRAA CLEAR KAR LO ZALDI SE