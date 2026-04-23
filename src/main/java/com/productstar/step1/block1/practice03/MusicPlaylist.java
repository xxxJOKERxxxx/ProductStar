package com.productstar.step1.block1.practice03;

import java.util.Random;  // импортируем Random для генерации случайных чисел

// Класс для управления плейлистом (динамический массив песен)
public class MusicPlaylist {

    // Внутренний массив для хранения песен (будет расти при необходимости)
    private String[] songs;

    // Количество песен в плейлисте (не путать с длиной массива songs)
    private int size;

    // Конструктор - вызывается при создании плейлиста
    public MusicPlaylist() {
        songs = new String[2];  // начальная ёмкость 2 песни
        size = 0;               // пока песен нет
    }

    // ========== МЕТОД 1: ДОБАВЛЕНИЕ ПЕСНИ В КОНЕЦ ==========
    public void addSong(String title) {
        // Если массив заполнен (все ячейки заняты)
        if (size == songs.length) {
            // Создаём новый массив в 2 раза больше
            String[] newSongs = new String[songs.length * 2];

            // Копируем старые песни в новый массив
            for (int i = 0; i < songs.length; i++) {
                newSongs[i] = songs[i];
            }

            // Заменяем старый массив новым
            songs = newSongs;
            System.out.println("  [расширение массива до " + songs.length + " ячеек]");
        }

        // Кладём новую песню в первую свободную ячейку
        songs[size] = title;
        // Увеличиваем счётчик песен
        size++;

        System.out.println("  добавлена песня: " + title);
    }

    // ========== МЕТОД 2: УДАЛЕНИЕ ПЕСНИ ПО ИНДЕКСУ ==========
    public void removeSong(int index) {
        // Проверяем, что индекс существует
        if (index < 0 || index >= size) {
            System.out.println("  ошибка: индекс " + index + " не существует");
            return;
        }

        // Запоминаем название удаляемой песни
        String removed = songs[index];

        // Сдвигаем все песни влево (начиная с index)
        for (int i = index; i < size - 1; i++) {
            songs[i] = songs[i + 1];
        }

        // Последнюю ячейку очищаем (для красоты)
        songs[size - 1] = null;

        // Уменьшаем счётчик песен
        size--;

        System.out.println("  удалена песня: " + removed + " (индекс " + index + ")");
    }

    // ========== МЕТОД 3: ПЕРЕМЕЩЕНИЕ ПЕСНИ ==========
    public void moveSong(int from, int to) {
        // Проверяем, что оба индекса существуют
        if (from < 0 || from >= size || to < 0 || to >= size) {
            System.out.println("  ошибка: индексы " + from + " -> " + to + " не существуют");
            return;
        }

        // Если перемещать некуда
        if (from == to) {
            System.out.println("  перемещение не требуется (индексы совпадают)");
            return;
        }

        // Запоминаем песню, которую перемещаем
        String movingSong = songs[from];

        // Временный массив для хранения песен при сдвиге
        String[] temp = new String[size];

        // Копируем все песни во временный массив
        for (int i = 0; i < size; i++) {
            temp[i] = songs[i];
        }

        // Сдвигаем элементы между from и to
        if (from < to) {
            // Перемещаем вперёд: сдвигаем элементы влево
            for (int i = from; i < to; i++) {
                songs[i] = temp[i + 1];
            }
        } else {
            // Перемещаем назад: сдвигаем элементы вправо
            for (int i = from; i > to; i--) {
                songs[i] = temp[i - 1];
            }
        }

        // Вставляем перемещаемую песню на новое место
        songs[to] = movingSong;

        System.out.println("  перемещена песня с индекса " + from + " на индекс " + to);
    }

    // ========== МЕТОД 4: ПЕРЕМЕШИВАНИЕ ПЕСЕН ==========
    public void shuffle() {
        Random rand = new Random();  // генератор случайных чисел

        // Алгоритм Фишера-Йетса (перемешивание массива)
        for (int i = size - 1; i > 0; i--) {
            // Выбираем случайный индекс от 0 до i
            int j = rand.nextInt(i + 1);

            // Меняем местами песни на позициях i и j
            String temp = songs[i];
            songs[i] = songs[j];
            songs[j] = temp;
        }

        System.out.println("  плейлист перемешан!");
    }

    // ========== ВСПОМОГАТЕЛЬНЫЙ МЕТОД: ВЫВОД ПЛЕЙЛИСТА ==========
    public void printPlaylist() {
        System.out.print("  [");
        for (int i = 0; i < size; i++) {
            System.out.print(songs[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // ========== ГЛАВНЫЙ МЕТОД ДЛЯ ПРОВЕРКИ ==========
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

        System.out.println("=== ДОБАВЛЯЕМ ПЕСНИ ===");
        playlist.addSong("Bohemian Rhapsody");
        playlist.addSong("Imagine");
        playlist.addSong("Stairway to Heaven");
        playlist.addSong("Hotel California");
        playlist.printPlaylist();

        System.out.println("\n=== УДАЛЯЕМ ПЕСНЮ (индекс 1) ===");
        playlist.removeSong(1);
        playlist.printPlaylist();

        System.out.println("\n=== ПЕРЕМЕЩАЕМ ПЕСНЮ (индекс 2 → индекс 0) ===");
        playlist.moveSong(2, 0);
        playlist.printPlaylist();

        System.out.println("\n=== ПЕРЕМЕШИВАЕМ ПЛЕЙЛИСТ ===");
        playlist.shuffle();
        playlist.printPlaylist();
    }
}
