package com.productstar.step1.block1.SimpleTaskManagementSystem; // пакет

import java.util.Date; // импортируем класс Date для работы с датами (из стандартной библиотеки Java)

// Класс Task - отдельная задача
public class Task {

    // Приватные поля: доступны только внутри этого класса
    private String title;       // название задачи (например, "Создание проекта")
    private String description; // описание задачи (например, "умный дом")
    private Date dueDate;       // срок выполнения (дедлайн) - тип Date
    private TaskStatus status;  // статус задачи (из перечисления TaskStatus)

    // Конструктор 1: принимает название, описание и дату. Статус автоматически TODO.
    public Task(String title, String description, Date dueDate) {
        this.title = title;           // сохраняем переданное название
        this.description = description; // сохраняем описание
        this.dueDate = dueDate;       // сохраняем дату
        this.status = TaskStatus.TODO; // начальный статус - "TODO" (нужно сделать)
    }

    // Конструктор 2: принимает все поля, включая статус (полезно, если задача уже в процессе)
    public Task(String title, String description, Date dueDate, TaskStatus status) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    // Геттеры - методы для получения значений полей.
    // Ключевое слово final запрещает переопределение этих методов в подклассах (по заданию).
    public final String getTitle() {
        return title;
    }

    public final String getDescription() {
        return description;
    }

    public final Date getDueDate() {
        return dueDate;
    }

    public final TaskStatus getStatus() {
        return status;
    }

    // Сеттеры - методы для изменения полей. Они не final (переопределять разрешено).
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    // Переопределяем метод toString() для удобного вывода задачи в консоль.
    // Этот метод автоматически вызывается при печати объекта.
    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", status=" + status +
                '}';
    }
}
