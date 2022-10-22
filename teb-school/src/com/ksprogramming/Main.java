package com.ksprogramming;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        boolean exitApp = true;
        do {
            System.out.println("Aplikacja zliczajaca wypłate z godzin i bonusow oraz stawki godzinowej:\n1 - Podaj dane do obliczenia stawki\n2 - Wyjdz z aplikacji");
            System.out.println("------------------------------------------------------------------------------------------");
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu) {
                case 1:
                    scanner.nextLine();
                    System.out.println(getInformation());
                    break;
                case 2:
                    System.out.println("Zakanczanie aplikacji.");
                    exitApp = false;
                    break;
                default:
                    System.out.println("Nie ma takiego wyboru w menu!!!!!!");
            }
            System.out.println("------------------------------------------------------------------------------------------");
        }while (exitApp == true) ;
    }

    public static Person getInformation(){

        System.out.println("Podaj ilosć godzin:");
        BigDecimal houre = scanner.nextBigDecimal();
        if (houre == BigDecimal.valueOf(0)){
            System.out.println("Jak chcesz liczyc kase jak nic nie pracowales :)\nPodaj poprawna ilosc godzin:" );
            houre = scanner.nextBigDecimal();
        }
        System.out.println("Podaj stawke godzinowa:");
        BigDecimal wages = scanner.nextBigDecimal();
        if (wages == BigDecimal.valueOf(0)){
            System.out.println("Podaj poprawną stawkę godzinową:");
            wages = scanner.nextBigDecimal();
        }
        scanner.nextLine();
        System.out.println("Podaj rodzaj umowy:");
        String kindContract = scanner.nextLine();
        System.out.println("Podaj dodatkowe bonusy z firmy:");
        BigDecimal bonusMoney = scanner.nextBigDecimal();
        System.out.println("Podaj ilosc dni miesiaca:");
        int dayInMonth = scanner.nextInt();
        System.out.println("Podaj ilość wziętych dni urlopu");
        int takenHolidays = scanner.nextInt();
        System.out.println("Pod ilość dni na chorobowym w trakcie dni pracy:");
        int sickDayDuringJobDay = scanner.nextInt();
        System.out.println("Podaj ilość dni na chorobowym w dniach wolnych od pracy:");
        int sickDayWithoutJobDay = scanner.nextInt();
        Person person = new Person(houre, wages, kindContract, bonusMoney, dayInMonth, takenHolidays, sickDayDuringJobDay, sickDayWithoutJobDay);
        return person;
    }

}