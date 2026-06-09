package com.productstar.step1.block1.Exception.HomeworkExceptions;

public class InsufficientAmountException extends Exception {
    // конструктор
    public InsufficientAmountException(String message) {
        super(message);  // передаём сообщение родителю
    }
}
