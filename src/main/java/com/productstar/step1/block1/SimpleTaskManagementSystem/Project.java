package com.productstar.step1.block1.SimpleTaskManagementSystem; // пакет

import java.util.ArrayList; // импортируем ArrayList - динамический массив
import java.util.Comparator; // импортируем Comparator для сравнения объектов
import java.util.List;       // импортируем интерфейс List

// Класс Project - проект, содержащий список задач. Реализует интерфейс Manageable.
public class Project implements Manageable {

    private String name;          // название проекта
    private List<Task> tasks;     // список задач (динамический, может расти)

    // Конструктор: принимает название проекта и создаёт пустой список задач
    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<>(); // инициализация пустого списка
    }

    // Геттер для имени проекта
    public String getName() {
        return name;
    }

    // Геттер для списка задач (нужен для сортировки и получения статистики)
    public List<Task> getTasks() {
        return tasks;
    }

    // Метод добавления задачи в проект
    public void addTask(Task task) {
        tasks.add(task); // добавляем в конец списка
        System.out.println("Задача '" + task.getTitle() + "' добавлена в проект " + name);
    }

    // Метод для отображения всех задач проекта
    public void displayTasks() {
        System.out.println("\nПроект: " + name);
        if (tasks.isEmpty()) { // если список пуст
            System.out.println("Нет задач.");
        } else {
            for (Task t : tasks) { // проходим по всем задачам
                System.out.println(t); // вызывается toString() задачи
            }
        }
    }

    // Реализация метода assign() из интерфейса Manageable
    @Override
    public void assign() {
        System.out.println("Проект '" + name + "' назначен команде.");
    }

    // Реализация метода start() - переводит все задачи проекта в статус IN_PROGRESS
    @Override
    public void start() {
        for (Task t : tasks) {
            t.setStatus(TaskStatus.IN_PROGRESS);
        }
        System.out.println("Проект '" + name + "' начат. Все задачи в статусе IN_PROGRESS.");
    }

    // Реализация метода complete() - переводит все задачи в статус DONE
    @Override
    public void complete() {
        for (Task t : tasks) {
            t.setStatus(TaskStatus.DONE);
        }
        System.out.println("Проект '" + name + "' завершён. Все задачи выполнены.");
    }

    // ---- Вложенный статический класс TaskComparator для сортировки задач ----
    // Он реализует интерфейс Comparator<Task>, чтобы можно было сортировать список задач.
    public static class TaskComparator implements Comparator<Task> {
        private final String criteria; // критерий сортировки: "title", "dueDate", "status"

        // Конструктор: принимает строку с именем критерия
        public TaskComparator(String criteria) {
            this.criteria = criteria;
        }

        // Метод compare: сравнивает две задачи t1 и t2.
        // Возвращает:
        // - отрицательное число, если t1 < t2
        // - 0, если равны
        // - положительное число, если t1 > t2
        @Override
        public int compare(Task t1, Task t2) {
            if (criteria.equals("title")) {
                // compareTo у строк сравнивает лексикографически
                return t1.getTitle().compareTo(t2.getTitle());
            } else if (criteria.equals("dueDate")) {
                // у Date уже есть compareTo
                return t1.getDueDate().compareTo(t2.getDueDate());
            } else if (criteria.equals("status")) {
                // ordinal() возвращает порядковый номер enum (0,1,2)
                return t1.getStatus().ordinal() - t2.getStatus().ordinal();
            } else {
                // Если критерий неизвестен, считаем объекты равными (менять порядок не нужно)
                return 0;
            }
        }
    }

    // ---- Статический вложенный класс ProjectStats для статистики по проекту ----
    // Поскольку он статический, методы принимают объект Project, по которому нужна статистика.
    public static class ProjectStats {

        // Возвращает общее количество задач в проекте
        public static int getTotalTasks(Project project) {
            return project.tasks.size();
        }

        // Возвращает количество завершённых задач (статус DONE)
        public static int getCompletedTasks(Project project) {
            int count = 0;
            for (Task t : project.tasks) {
                if (t.getStatus() == TaskStatus.DONE) {
                    count++;
                }
            }
            return count;
        }

        // Возвращает количество задач в процессе (статус IN_PROGRESS)
        public static int getInProgressTasks(Project project) {
            int count = 0;
            for (Task t : project.tasks) {
                if (t.getStatus() == TaskStatus.IN_PROGRESS) {
                    count++;
                }
            }
            return count;
        }

        // Выводит всю статистику по проекту
        public static void showStats(Project project) {
            System.out.println("--- Статистика проекта '" + project.name + "' ---");
            System.out.println("Всего задач: " + getTotalTasks(project));
            System.out.println("В процессе: " + getInProgressTasks(project));
            System.out.println("Выполнено: " + getCompletedTasks(project));
        }
    }
}
