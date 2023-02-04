package org.example;

public class CylinderVolume {
    public  static void main(String[]args) {
        //еременные инициализируются константами
        double radius=4; // радиус цилиндра
        double height=5; // высота цилинтра
        // переменная volume инициализируется динамически
        // вычисленным значением выражения
        double volume = 3.1416*radius*radius*height;
        System.out.println("Обьем цилиндра равен" + volume);
        //main (String[]) method
        //CylinderVolume class
    }
}
