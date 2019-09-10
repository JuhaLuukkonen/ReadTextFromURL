package com.javacodegeeks.snippets.core;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
 
public class ReadTextFromURL {
     
    public static void main(String[] args) {
         
        try {
             
            URL url = new URL("https://www.gutenberg.org/files/48380/48380-h/48380-h.htm");
             
            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
             
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        //    request.setAttribute(line, javaObject);

            in.close();
             
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
         
    } 
 
}