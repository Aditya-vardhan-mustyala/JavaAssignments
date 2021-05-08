package Assignment2;
/* space complexity: constant space as it uses boolean array of fixed length(26) and a variable count
   time complexity : O(n) as it traverses the whole input atmost once
 */
import java.util.*;
import java.io.*;
public class AllAlphabets

{
    public static void main(String[] args)
    {
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        checkalpha(input);
    }

    public static void checkalpha(String input)
    {
        boolean[] lettersOfAlphabets=new boolean[26];


        int count=26;
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++)
        {
            if(Character.isAlphabetic(input.charAt(i)))
            {
                int index = (int) input.charAt(i) - 97;
                if (!lettersOfAlphabets[index]) {
                    lettersOfAlphabets[index] = true;
                    count--;

                }
                if (count == 0) {
                    System.out.println("input contains all alphabets");
                    System.exit(0);
                }
            }
        }

        System.out.println("input doesnot contain all alphabets");
    }
}