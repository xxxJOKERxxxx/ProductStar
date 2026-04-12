package com.productstar.step1.block1.lesson3;

public class Main {
    public static void main(String[] args) {
        int n = 144;
        boolean wasFound = false;
        int[]array = new int[]{1,20,30,-5,-8,2,-7,123,-90};
        for(int i=0;i<array.length;i++){
            int numberFromArray = array[i];
            if(numberFromArray==n){
                System.out.println("найдено!");
                wasFound = true;
                break;
            }
        }
        if(!wasFound){
            System.out.println("Не найдено!");
        }


    }
}
