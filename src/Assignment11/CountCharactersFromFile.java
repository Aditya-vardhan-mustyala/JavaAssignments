package Assignment11;


import java.io.*;
import java.util.HashMap;

public class CountCharactersFromFile
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileRead=new FileReader(args[0]);
        int i;
        HashMap<Character,Integer> freq=new HashMap<Character,Integer>();
        FileWriter fileWrite=new FileWriter("result.txt");
        while ((i=fileRead.read())!= -1)
        {
            char ch=(char)i;
            if(freq.containsKey(ch))
                freq.put(ch,freq.get(ch)+1);
            else
                freq.put(ch,1);
        }

        for(Character ch: freq.keySet())
        {
            fileWrite.write(ch+":"+freq.get(ch)+"\n");
        }
        fileRead.close();
        fileWrite.close();
    }
}
