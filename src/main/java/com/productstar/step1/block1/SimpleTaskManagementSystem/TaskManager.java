package com.productstar.step1.block1.SimpleTaskManagementSystem; // пакет

import java.util.ArrayList; // импортируем ArrayList
import java.util.List;       // импортируем List

// Класс TaskManager управляет несколькими проектами
public class TaskManager {

    private List<Project> projects; // список проектов

    // Конструктор: создаёт пустой список проектов
    public TaskManager() {
        this.projects = new ArrayList<>();
    }

    // Добавить проект в менеджер
    public void addProject(Project project) {
        projects.add(project);
        System.out.println("Проект '" + project.getName() + "' добавлен в TaskManager.");
    }

    // Показать все проекты и их задачи
    public void displayAllProjects() {
        if (projects.isEmpty()) {
            System.out.println("Нет проектов.");
            return;
        }
        System.out.println("\n=== Список проектов ===");
        for (Project p : projects) {
            p.displayTasks(); // каждый проект сам выводит свои задачи
        }
    }

    // Метод для получения списка проектов (если понадобится)
    public List<Project> getProjects() {
        return projects;
    }
}
