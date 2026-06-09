package com.productstar.step1.block1.Exception.HomeworkExceptions;

public class Main {
    public static String accountName = "MyAcc";
    public static int amount = 10000;

    public static int deduct(String accountToProcess, int amtToCacheOut) throws InsufficientAmountException {
      if  (!accountToProcess.equals(accountName)) {
          throw  new AccessDeniedException(" Доступ запрещен!");
      } else if (amount < amtToCacheOut) {
            throw new InsufficientAmountException("Недостаточно средств!");
        }else {
          amount = amount - amtToCacheOut;
          return amount;
      }
    }

    public static void main(String[] args) {

        System.out.println("Начальный балланс: " + amount);

        try {
            int newBalance = deduct("MyAcc", 900);
            System.out.println("После снятия 900, остаток: " + newBalance);
        } catch (InsufficientAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println("Ошибка доступа: " + e.getMessage());
        }
        try {
            int newBalance = deduct("MyAcc", 20000);
                System.out.println("После снятия 20000 остаток: " + newBalance);
        } catch (InsufficientAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println("Ошибка доступа: " + e.getMessage());
        }
        try {
            int newBalance = deduct("FakeAcc", 100);
            System.out.println("После снятия с чужого аккаунта, остаток: " + newBalance);
        } catch (InsufficientAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println("Ошибка доступа: " + e.getMessage());
        }
    }

}
