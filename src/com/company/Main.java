package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Method
        System.out.println(method(21, 10));
        System.out.println(method(10, 27));
        System.out.println(method(46, -9));
        System.out.println(method(10, -5));
        System.out.println(method(25, 19));

        //HW for quick wits
        int randAge = generateRandomAge();
        Scanner thirdTemp = new Scanner(System.in);
        System.out.printf("Введите температуру воздуха:");
        int tempAirForRand = thirdTemp.nextInt();
        System.out.println(method(randAge, tempAirForRand));


    }

    //Method
    public static String method(int agePerson, int tempAir) {

        if (agePerson > 20 && agePerson < 45 && tempAir > -20 && tempAir < 30) {
            return "Можно гулять";
        } else if (agePerson < 20 && tempAir > 0 && tempAir < 28) {
            return "Можно гулять";
        } else if (agePerson > 45 && tempAir > -10 && tempAir < 25) {
            return "Можно гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    //HW for quick wits
    public static int generateRandomAge() {
        int randAge = (int) (Math.random() * 60);
        System.out.println("Мне " + randAge + " лет. \n Можно ли гулять?");
        return randAge;
    }
}

