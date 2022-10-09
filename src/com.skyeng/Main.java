package com.skyeng;

public class Main {
    public static void main (String[] args){
        System.out.println("Cycle_2");

        taskOneByOne();
        taskOneByTwo();
        taskOneByThree();
        taskTwoByOne();
        taskTwoByTwo();
        taskTwoByThree();
        taskTwoByFour();
        taskThreeByOne();
        taskThreeByTwo();

        System.out.println("HomeWork_Complete");
    }

    //task_3-2
    private static void taskThreeByTwo() {
        System.out.println("task_3-2");
        int factor = 1;
        for (; factor <= 10; factor++) {
            int sum = factor*2;
                System.out.println("2*"+factor+"="+sum);
        }
        System.out.println();
    }

    //task_3-1
    private static void taskThreeByOne() {
        System.out.println("task_3-1");
        int year = 0;
        for (; year <= 2122; year = year + 79) {
            if (year > 1822 && year < 2122) {
                System.out.println(year);
            }
        }
        System.out.println();
    }

    //task_2-4
    private static void taskTwoByFour() {
        System.out.println("task_2-2");
        int friday = 5;
        for (; friday < 31; friday++) {
            if (friday%7 == 0){
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", friday);
            }
        }
        System.out.println();
    }

    //task_2-3
    private static void taskTwoByThree() {
        System.out.println("task_2-3");
        int depositVolume = 15_000;
        int depositTotal = 0;
        int i = 1;
        for (; i < 108; i++) {
            depositTotal = depositTotal + (depositTotal/100)*7;
            depositTotal = depositTotal + depositVolume;
            if (i%6==0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, depositTotal);
            }
        }
        System.out.println();
    }

    //task_2-2
    private static void taskTwoByTwo() {
        System.out.println("task_2-2");
        int depositVolume = 15_000;
        int depositTotal = 0;
        int i = 1;
        for (; depositTotal < 12_000_000; i++) {
            depositTotal = depositTotal + (depositTotal/100)*7;
            depositTotal = depositTotal + depositVolume;
            if (i%6==0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, depositTotal);
            }
        }
        System.out.println();
    }

    //task_2-1
    private static void taskTwoByOne() {
        System.out.println("task_2-1");
        int depositVolume = 15_000;
        int depositTotal = 0;
        int i = 1;
        for (; depositTotal < 12_000_000; i++) {
            depositTotal = depositTotal + (depositTotal/100)*7;
            depositTotal = depositTotal + depositVolume;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, depositTotal);
        }
        System.out.println();
    }

    //task_1-3
    private static void taskOneByThree() {
        System.out.println("task_1-3");
        double population = 12_000_000;
        double birthRate = (17/1000d)*population;
        double deathRate = (8/1000d)*population;
        for (int i = 1; i <= 10; i++) {
            population = population + (birthRate - deathRate);
            System.out.printf("Год %d, численность населения составляет %.0f\n", i, population);
        }
        System.out.println();
    }

    //task_1-2
    private static void taskOneByTwo() {
        System.out.println("task_1-2");
        int i=1;
        while (i<=10) {
            if (i==10) {
                System.out.print(i);
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (; i>=0; i--) {
            if (i==1) {
                System.out.print(i);
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    //task_1-1
    private static void taskOneByOne() {
        System.out.println("task_1-1");
        int depositVolume = 15_000;
        int depositTotal = 0;
        int i = 0;
        for (; depositTotal < 2_459_000; i++) {
            depositTotal = depositTotal + depositTotal/100;
            depositTotal = depositTotal + depositVolume;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, depositTotal);
        }
        System.out.println();
    }
}
