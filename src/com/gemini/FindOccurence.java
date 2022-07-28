package com.gemini;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.LogManager;

public class FindOccurence {

    public static void main(String[] args) {
        try{
            LogManager.getLogManager().reset(); // This is done to avoid the displaying of log information in the console
            // Here, the object of Log class is being created
            Log my_log = new Log("log.txt");

            my_log.log.setLevel(Level.INFO);
            // Here, the object of properties class is being created
            Properties pro = new Properties();

            my_log.log.info("Properties object created");   // Displaying log information that properties object created
            pro.load(new FileInputStream("config.properties"));

            // The Filepath from the config.properties file is stored in a String
            String Filepath = pro.getProperty("Filepath");

            // The required word which needs to be searched in the file is also stored in a string from the .properties file
            String word = pro.getProperty("word");

            // Here, new object of File is being created and the String in which Filepath is stored is passed as argument
            File file = new File(Filepath);

            my_log.log.info("File object created");  // Displaying log information that File object is created
            Scanner sc = new Scanner(file);  // New Scanner object created and the object of File is passed

            // HashMap is created here
            Map<String,Integer> hashMap = new HashMap<>();
            my_log.log.info("HashMap created");  // Displaying log information that Hashmap is successfully created

            // While loop to traverse the given words in file
            while(sc.hasNextLine())
            {
                my_log.log.info("Scanning words from the file");  // Displaying log information

                // Storing the words in String array and splitting the words of String
                String[] str = sc.nextLine().split(" ");
                for(String find : str)
                {
                    // To check whether the Hashmap contains the required key or not
                    Integer in = hashMap.get(find);
                    if (in == null)
                    {
                        // Storing the word in Hashmap as key and its occurence as a value
                        hashMap.put(find,1);
                    }
                    else
                    {
                        //If word is already available then Incrementing its count
                        hashMap.put(find,in+1);
                    }
                    my_log.log.info("File is successfully traversed");
                }

            }
            if(word==null)
            {
                // When no word is given then Simply printing the occurrence of all words
                System.out.println(hashMap);
                my_log.log.info("No word is given to be searched");
            }
            else if(hashMap.containsKey(word))
            {
                // If given word is found in the file then printing the word with its occurrence
                System.out.println(word+"-"+hashMap.get(word));
                my_log.log.info("Hashmap contains the required word");
            }
            else
            {
                // If the given word has no occurrence then displaying that word with frequency 0
                System.out.println(word+"-"+"0");
                my_log.log.info("Given word has no occurence ");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
