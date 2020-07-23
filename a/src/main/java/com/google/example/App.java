package com.google.example;

import com.google.common.net.HttpHeaders;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // HttpHeaders.EARLY_DATA available in Guava 27 and later but not earlier
        System.out.println( "Hello " + HttpHeaders.EARLY_DATA );
    }
}
