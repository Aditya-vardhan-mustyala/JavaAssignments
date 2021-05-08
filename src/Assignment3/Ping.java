package Assignment3;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.text.BreakIterator;
import java.util.logging.*;
import java.util.*;

public class Ping
{
    static Logger log = Logger.getLogger("Ping.class");

    String getHostName()
    {
        log.info("enter host name");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    String extractTime(String line)
    {
        int start=line.indexOf("time=");
        int end=line.indexOf(".",start+1);
        return line.substring(start+5,end);
    }

    String getMedian(ArrayList<Integer> times)
    {
        Collections.sort(times);
        return String.valueOf(times.get(2));
    }
    public static void main(String[] args) throws Exception
    {

        Ping obj=new Ping();
        String host=obj.getHostName();

        ProcessBuilder build = new ProcessBuilder("ping",host,"-c","5");
        Process process = build.start();
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));


        input.readLine();
        ArrayList<Integer> times =new ArrayList<Integer>();
        for(int i=0;i<5;i++)
        {
            String time= obj.extractTime(input.readLine());
            times.add(Integer.parseInt(time));
        }

        log.info("median of ping time is "+obj.getMedian(times)+" ms");
    }
}