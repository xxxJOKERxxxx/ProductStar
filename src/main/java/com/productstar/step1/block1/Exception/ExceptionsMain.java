package com.productstar.step1.block1.Exception;

import java.io.FileNotFoundException;

public class ExceptionsMain {

    public static String name;

    public static void main(String[] args) {

        try {
            doSomethingDangerous();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doSomethingDangerous() throws FileNotFoundException{
        readfile("");
    }

    public static void readfile(String path) throws FileNotFoundException {
        if (path == null) {
            throw new FileNotFoundException();
        }
    }
}
