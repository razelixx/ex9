package com.company;

import java.util.Scanner;

public class Main {

//    Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
//    где каждый элемент массива умножается на 2. Размер массива задается пользователем.

    public static void main(String[] args) {

        int newArray[] = new int[3];
        Scanner scanArray = new Scanner(System.in);

        for (int i = 0; i< newArray.length; i++){
            newArray[i] = scanArray.nextInt();
        }
        for (int i = 0; i< newArray.length; i++){
            System.out.println(newArray[i]*2);
        }

    }
}
