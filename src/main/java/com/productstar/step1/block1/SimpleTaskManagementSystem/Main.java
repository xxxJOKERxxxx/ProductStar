package com.productstar.step1.block1.SimpleTaskManagementSystem; // пакет

import java.util.Collections; // для метода sort()
import java.util.Date;        // для создания дат
import java.util.List;        // для работы со списком

public class Main {
    public static void main(String[] args) {

        // 1. Создаём менеджер задач
        TaskManager manager = new TaskManager();

        // 2. Создаём проекты
        Project webProject = new Project("Сайт компании");
        Project mobileProject = new Project("Мобильное приложение");

        // 3. Создаём даты для дедлайнов
        Date now = new Date(); // текущая дата
        // Дата через 7 дней: getTime() возвращает миллисекунды, прибавляем 7*24*60*60*1000
        Date weekLater = new Date(now.getTime() + 7L * 24 * 60 * 60 * 1000);

        // 4. Создаём задачи для первого проекта
        Task task1 = new Task("Дизайн главной страницы", "Нарисовать макет", weekLater);
        Task task2 = new Task("Написать серверную часть", "Java + Spring", weekLater);
        Task task3 = new Task("Настроить базу данных", "PostgreSQL", now);

        // Добавляем задачи в проект
        webProject.addTask(task1);
        webProject.addTask(task2);
        webProject.addTask(task3);

        // 5. Создаём задачи для второго проекта
        Task task4 = new Task("Регистрация пользователя", "Экран логина", weekLater);
        Task task5 = new Task("Пуш-уведомления", "Интеграция с Firebase", weekLater);
        mobileProject.addTask(task4);
        mobileProject.addTask(task5);

        // 6. Добавляем проекты в менеджер
        manager.addProject(webProject);
        manager.addProject(mobileProject);

        // 7. Показываем все проекты и задачи
        manager.displayAllProjects();

        // 8. Тестируем методы интерфейса Manageable на первом проекте
        System.out.println("\n--- Демонстрация Manageable ---");
        webProject.assign();
        webProject.start();
        webProject.complete();

        // 9. Статистика по первому проекту
        System.out.println();
        Project.ProjectStats.showStats(webProject);

        // 10. Статистика по второму проекту
        Project.ProjectStats.showStats(mobileProject);

        // 11. Сортировка задач первого проекта по названию
        System.out.println("\n--- Сортировка задач по названию ---");
        List<Task> tasks = webProject.getTasks(); // получаем список задач
        Collections.sort(tasks, new Project.TaskComparator("title"));
        for (Task t : tasks) {
            System.out.println(t.getTitle() + " - " + t.getStatus());
        }

        // 12. Сортировка по дате дедлайна
        System.out.println("\n--- Сортировка задач по дедлайну ---");
        Collections.sort(tasks, new Project.TaskComparator("dueDate"));
        for (Task t : tasks) {
            System.out.println(t.getTitle() + " - " + t.getDueDate());
        }
    }
}