package Assignment1;

import java.io.*;
import java.util.*;
import java.util.regex.*;
public class  SearchDirectory
{
    public static void main(String[] args)
    {
        String homepath=System.getProperty("user.home");        //getting home directory of user

        File directory=new File(homepath);          //creating file object for the directory path
        File[] allfiles=directory.listFiles();          //used to get all files is in home directory
        while(true)
        {
            System.out.println("Enter pattern or quit to exit");
            Scanner sc=new Scanner(System.in); //taking input from the user
            String pattern=sc.next();       //input pattern to search
            if(pattern.equals("quit"))
                break;
            for(int index=0;index<allfiles.length;index++)  //iterating through all the files in the directory
            {

                String filename=allfiles[index].getName();   //getting the name of the file
                if(Pattern.matches(pattern,filename))   //check if file name matches with the pattern
                {
                    System.out.println(allfiles[index].getAbsolutePath());   //output absolutepath of the file
                }
            }


        }

    }
}