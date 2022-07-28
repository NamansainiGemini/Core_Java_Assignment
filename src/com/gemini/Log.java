package com.gemini;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log
{
    public Logger log;
    FileHandler fh;
    public Log(String Filepath) throws SecurityException, IOException
    {
        File logfile = new File(Filepath);
        if(!logfile.exists())
        {
            logfile.createNewFile();
        }
        fh = new FileHandler(Filepath,true);
        log = Logger.getLogger("Check");
        log.addHandler(fh);

        // To format the logs and to display the log messages
        SimpleFormatter sf = new SimpleFormatter();

        fh.setFormatter(sf);
    }
}
