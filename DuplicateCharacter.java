// Q4: Write a Java Program to find the duplicate characters in a string.

import java.io.*;
import java.util.*;

class DuplicateCharacter
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scan.nextLine();
        findDuplicateChar(str);
        scan.close();
    }

    public static void findDuplicateChar(String str)
    {
        char[] ch = str.toCharArray();
        
        HashSet<Character> duplicateChar = new HashSet<>();

        for(int i=0; i<ch.length; i++)
        {
            for(int j=i+1; j<ch.length; j++)
            {
                if(ch[i] == ch[j])
                {
                    duplicateChar.add(ch[j]);
                }
            }
        }
        System.out.println(duplicateChar);
    }
}