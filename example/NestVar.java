package org.example;

public class NestVar {
    public static void main(String[]args){
        int count=1;
        System.out.println("count="+ count);
        {
            //ошибка: переменная count уже объявлена.
            //Закомментрируйте следующую строку
            count=2;
            System.out.println("Первый независивый блок: count ="+ count);
            int n=3;
            System.out.println("Первый независимый блок");

        }
    }
}
