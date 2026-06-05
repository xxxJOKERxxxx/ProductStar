package com.productstar.step1.block1.Exception;

import java.io.FileNotFoundException;
import java.net.SocketException;

public class ExceptionsMain {

    public static String name;

    public static void main(String[] args) {

        try {
            doSomethingDangerous();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static void doSomethingDangerous() throws FileNotFoundException, SocketException {
        readfile("");
    }

    public static void readfile(String path) throws FileNotFoundException, SocketException {
        if (path == null) {
            throw new FileNotFoundException();
        }
        throw new SocketException();
    }
}
