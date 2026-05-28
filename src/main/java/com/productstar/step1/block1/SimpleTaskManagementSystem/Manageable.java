package com.productstar.step1.block1.SimpleTaskManagementSystem;  // пакет

// Интерфейс Manageable (управляемый)
public interface Manageable {

    // Метод "назначить" (например, назначить задачу исполнителю)
    void assign();

    // Метод "начать" (начать выполнение)
    void start();

    // Метод "завершить" (отметить как выполненное)
    void complete();
}
