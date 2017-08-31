package com.epam.lab.log;

import org.apache.log4j.Logger;

public class Log
{
    private static Logger LOG = Logger.getLogger(Log.class);


    public static void logInfo(String message){
        LOG.info(message);
    }
}
