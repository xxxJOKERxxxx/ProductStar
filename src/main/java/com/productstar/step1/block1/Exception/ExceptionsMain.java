package com.productstar.step1.block1.Exception;

import java.io.FileNotFoundException;
import java.net.SocketException;

public class ExceptionsMain {

    public static String name;

    public static void main(String[] args) throws AccessDeniedException {
        throw new AccessDeniedException("Пользователь A1 не имеет доступа к аккаунту 123");
    }

}
