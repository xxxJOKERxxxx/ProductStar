package com.productstar.step1.block1.DevelopmentSmartHomeManagementSystem;

public class SmartHome {

    private SmartDevice[] devices;
    private int deviceCount;

    public SmartHome() {
        devices = new SmartDevice[100];
        deviceCount = 0;
    }

    public void addDevice(SmartDevice device) {
        if (deviceCount < devices.length) {
            devices[deviceCount] = device;
            deviceCount++;

            HomeStats.incrementActiveDevices();
            if (device.isOn) {
                HomeStats.incrementActiveDevices();
            }
            System.out.println("Устройство добавлено.");
        } else {
            System.out.println("Массив переполнен, нельзя добавить.");
        }
    }

    public void turnOnAllDevices() {
        for (int i = 0; i < deviceCount; i++) {
            SmartDevice device = devices[i];
            if (!device.isOn) {
                device.turnOn();
                HomeStats.incrementActiveDevices();
            }
        }
    }

    public void turnOffAllDevice() {
        for (int i = 0; i < deviceCount; i++) {
            SmartDevice device = devices[i];
            if (device.isOn) {
                device.turnOff();
                HomeStats.decrementActiveDevices();
            }
        }
    }

    public  void removeDevice(int index) {
        if (index >=0 && index < deviceCount) {
            SmartDevice removed = devices[index];
            if (removed.isOn) {
                HomeStats.decrementActiveDevices();
            }
            for (int i = index; i < deviceCount -1; i++) {
                devices[i] = devices[i + 1];
            }
            devices[deviceCount - 1] = null;
            deviceCount--;
            HomeStats.decrementActiveDevices();

            System.out.println("Устройство '" + removed.getName() + "' удалено.");
        } else {
            System.out.println("Неверный индекс. Удаление невозможно.");
        }
    }
    public void showAllStatuses() {
        System.out.println("\n=== Состояное умного дома ===");
        for (int i = 0; i < deviceCount; i++) {
            System.out.println(devices[i].getStatus());
        }
        System.out.println("===============================");
    }

    public static class HomeStats {
        private static int totalDevices = 0;
        private static int activeDevices = 0;


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
            System.out.println("Всего устройств (добавленых за всё время): " + totalDevices);
            System.out.println("Сейчас активно (включено): " + activeDevices);
        }
    }

}

