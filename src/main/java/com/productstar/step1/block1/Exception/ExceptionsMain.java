package com.productstar.step1.block1.Exception;

import java.io.FileNotFoundException;

public class ExceptionsMain {

    public static String name;

    public static void main(String[] args) {
        try {
            readfile(null);
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        }
    }
    public static void readfile(String path) throws FileNotFoundException {
        if (path == null) {
            throw new FileNotFoundException();
        }
    }
}
