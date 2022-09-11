package com.company;

public class CWH_14_StringMethods {
    public static void main(String[] args) {
//        String methods operate on Java Strings. They can be used to count the length of the string, convert to lowercase, etc.
        String name = "Jayan";
        String str = "    Jayan is a good boy    ";

//        length method counts the length of a string
        int len = name.length();
        System.out.println(len);

//        toLowerCase method converts string to lower case
        String lstring = name.toLowerCase();
        System.out.println(lstring);

//        toUpperCase will convert string to upper case
        String ustring = name.toUpperCase();
        System.out.println(ustring);

//        trim method returns a new string after removing all leading ans trailing spaces from the original string.
        String trimmedString = str.trim();
        System.out.println(trimmedString);

//        susbstring method will give remaining string after startindex character. Indexing will start from 0 and index can be given in parameter of substring method
//        You can also provide a stopindex in the second parameter of the method seperated by a comma
        String subStringed_name = name.substring(1,4);
        System.out.println(subStringed_name);

//        Replace method will return new string after replacing all occurences of character in first parameter with character in second parameter
        String replacedString = name.replace('y','a');
        System.out.println(replacedString);
//        You can also replace multiple characters instead of only one using double quotes instead of single quotes
        System.out.println(name.replace("yan", "nda"));


//        startsWith method returns a boolean value after checking if the string starts with characters given in the parameter of the method
        System.out.println(name.startsWith("Jay"));
        System.out.println(name.startsWith("Aya"));

//        endsWith method returns a boolean value after checking if the string ends with characters given in the parameter of the method
        System.out.println(name.endsWith("an"));
        System.out.println(name.endsWith("Alm"));


//        charAt will return new string with single character at given string
        System.out.println(name.charAt(2));

//        indexOf will return the index of given string. Second parameter of method will provide a fromIndex which will tell the program where to start looking from
        String modifiedName = "Jayananan";
        System.out.println(modifiedName.indexOf("y"));
        System.out.println(modifiedName.indexOf("an", 4));

//        lastIndexOf will return last index of the given characters in the string before given index. Characters will be given in parameter 1 and index will be given in parameter 2.
        System.out.println(modifiedName.lastIndexOf("an", 4));

//         equals method will return boolean value if given characters are equal to String
        System.out.println(name.equals("Jayan"));

//        equalsIgnoreCase will return boolean value if both strings are equal ignoring case.
        System.out.println(name.equalsIgnoreCase("jayan"));




//        ESCAPE SEQUENCE CHARACTERS
//        Escape sequence characters are sequence of characters after backslash (\) so that invalid characters can be used as strings such as:
        /*
        * 1. \n ---> new line
        * 2. \" ---> double quotes
        * 3. \t ---> tab
        * 4. \\ ---> add a backslash
        * and many more
        */


    }
}
