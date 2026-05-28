package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

public class SmartHome {

    // Массив для хранения устройств (тип SmartDevice – полиморфизм)
    private SmartDevice[] devices;
    // Счётчик реально добавленных устройств (не путать с длиной массива)
    private int deviceCount;

    // Конструктор: создаём массив на 100 ячеек, пока ничего не добавлено
    public SmartHome() {
        devices = new SmartDevice[100];
        deviceCount = 0;
    }

    // Добавить устройство в дом
    public void addDevice(SmartDevice device) {
        // Проверяем, есть ли свободное место в массиве
        if (deviceCount < devices.length) {
            // Кладём устройство в первую свободную ячейку
            devices[deviceCount] = device;
            // Увеличиваем счётчик добавленных устройств
            deviceCount++;

            // увеличиваем общее количество устройств (totalDevices)
            HomeStats.incrementTotalDevices();

            // Если устройство уже включено (например, если где-то его включили до добавления)
            if (device.isOn) {
                HomeStats.incrementActiveDevices();
            }
            // Сообщаем, что устройство добавлено
            System.out.println("Устройство '" + device.getName() + "' добавлено.");
        } else {
            System.out.println("Массив переполнен, нельзя добавить.");
        }
    }

    // Включить все устройства
    public void turnOnAllDevices() {
        // Проходим по всем добавленным устройствам (от 0 до deviceCount-1)
        for (int i = 0; i < deviceCount; i++) {
            SmartDevice device = devices[i];
            // Если устройство выключено
            if (!device.isOn) {
                device.turnOn();                       // включаем
                HomeStats.incrementActiveDevices();    // увеличиваем счётчик активных
            }
        }
    }

    // Выключить все устройства
    public void turnOffAllDevices() {
        for (int i = 0; i < deviceCount; i++) {
            SmartDevice device = devices[i];
            if (device.isOn) {
                device.turnOff();
                HomeStats.decrementActiveDevices();    // уменьшаем активные
            }
        }
    }

    // Удалить устройство по индексу
    public void removeDevice(int index) {
        // Проверяем, что индекс в пределах добавленных устройств
        if (index >= 0 && index < deviceCount) {
            // Запоминаем удаляемое устройство
            SmartDevice removed = devices[index];

            // Если удаляемое устройство было включено, уменьшаем счётчик активных
            if (removed.isOn) {
                HomeStats.decrementActiveDevices();
            }

            // Сдвигаем все элементы влево, начиная с index+1
            for (int i = index; i < deviceCount - 1; i++) {
                devices[i] = devices[i + 1];
            }

            // Очищаем последнюю ячейку (она теперь дублируется)
            devices[deviceCount - 1] = null;
            // Уменьшаем счётчик устройств
            deviceCount--;

            HomeStats.decrementTotalDevices();

            System.out.println("Устройство '" + removed.getName() + "' удалено.");
        } else {
            System.out.println("Неверный индекс. Удаление невозможно.");
        }
    }

    // Показать состояние всех устройств
    public void showAllStatuses() {
        System.out.println("\n=== Состояние умного дома ===");
        for (int i = 0; i < deviceCount; i++) {
            System.out.println(devices[i].getStatus());
        }
        System.out.println("===============================");
    }

    // Вложенный статический класс для статистики
    public static class HomeStats {
        // Статические поля – общие для всех вызовов
        private static int totalDevices = 0;   // сколько всего устройств добавлено за всё время
        private static int activeDevices = 0;  // сколько сейчас включено

        public static void incrementTotalDevices() {
            totalDevices++;
            System.out.println("[Статистика] Всего устройств: " + totalDevices);
        }

        public static void decrementTotalDevices() {
            totalDevices--;
            System.out.println("[Статистика] Всего устройств: " + totalDevices);
        }

        public static void incrementActiveDevices() {
            activeDevices++;
            System.out.println("[Статистика] Активных устройств: " + activeDevices);
        }

        public static void decrementActiveDevices() {
            activeDevices--;
            System.out.println("[Статистика] Активных устройств: " + activeDevices);
        }

        public static void showStats() {
            System.out.println("--- Статистика ---");
            System.out.println("Всего устройств (добавленных за всё время): " + totalDevices);
            System.out.println("Сейчас активно (включено): " + activeDevices);
        }
    }
}

