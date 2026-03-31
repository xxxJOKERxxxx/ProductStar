package com.productstar.step1.block1.lesson3;

public class WeatherWeekBefore {
    public static void main(String[] args) {
        int[] weatherWeekBefore = new int[]{-20,-15,-17,-10,-5,0};
      int i =0;
      while (i < weatherWeekBefore.length) {
          int temperature = weatherWeekBefore[i];
          System.out.println("[холодно "+ temperature + " одеть куртку и шапку!");
          i++;
      }

    }
}
