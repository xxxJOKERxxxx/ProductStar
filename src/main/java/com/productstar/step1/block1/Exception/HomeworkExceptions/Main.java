package com.productstar.step1.block1.Exception.HomeworkExceptions;

public class Main {
    // Статическая переменная - принадлежит классу, а не объекту. Хранит имя владельца счёта.
    // static нужно, чтобы из статического метода main можно было к ней обратиться напрямую.
    public static String accountName = "MyAcc";

    // Статическая переменная - текущий баланс счёта. Ненулевая сумма (по заданию).
    // static по той же причине: доступ из main без создания объекта.
    public static int amount = 10000;

    // Метод для снятия денег.
    // static - чтобы вызывать из main без создания объекта Main.
    // int - возвращает новый баланс.
    // throws - объявляем checked исключение (требование компилятора, т.к. InsufficientAmountException - наследник Exception)
    public static int deduct(String accountToProcess, int amtToCacheOut) throws InsufficientAmountException {

        // 1. Проверка имени аккаунта
        if (!accountToProcess.equals(accountName)) {
            // Если имя не совпадает - бросаем unchecked исключение (RuntimeException)
            throw new AccessDeniedException(" Доступ запрещен!");
        }
        // 2. Проверка достаточности средств (выполняется только если имя верное)
        else if (amount < amtToCacheOut) {
            // Если денег меньше, чем запросили - бросаем checked исключение
            throw new InsufficientAmountException("Недостаточно средств!");
        }
        // 3. Успешное снятие (если обе проверки пройдены)
        else {
            amount = amount - amtToCacheOut; // вычитаем сумму из баланса
            return amount;                   // возвращаем новый остаток
        }
    }

    // Главный метод - точка входа в программу. Вызывается JVM при запуске.
    // public static void main(String[] args) - стандартная сигнатура.
    public static void main(String[] args) {

        // Выводим начальный баланс
        System.out.println("Начальный балланс: " + amount);

        // 1-й вызов: успешное снятие 900
        try {
            int newBalance = deduct("MyAcc", 900);
            System.out.println("После снятия 900, остаток: " + newBalance);
        } catch (InsufficientAmountException e) {   // Ловим checked исключение
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {         // Ловим unchecked исключение (но обязаны поймать, чтобы программа не упала)
            System.out.println("Ошибка доступа: " + e.getMessage());
        }

        // 2-й вызов: снимаем больше, чем есть (баланс сейчас 9100, пытаемся снять 20000)
        try {
            int newBalance = deduct("MyAcc", 20000);
            System.out.println("После снятия 20000 остаток: " + newBalance);
        } catch (InsufficientAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println("Ошибка доступа: " + e.getMessage());
        }

        // 3-й вызов: снимаем с чужого аккаунта (имя "FakeAcc" не совпадает с "MyAcc")
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
