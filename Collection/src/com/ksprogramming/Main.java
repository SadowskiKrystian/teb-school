package com.ksprogramming;

import java.rmi.MarshalledObject;
import java.util.*;

public class Main {
    public static void main(String[] args) {
 // Exercise 1
        Scanner scanner = new Scanner(System.in);
        String nameCity;
        List<String> lists = new ArrayList<>();
        do {
            System.out.println("Podaj nazwę miasta. Podajac znak '-' zakanczasz program");
            nameCity = scanner.nextLine();
            if (nameCity.equals("-")){
                System.out.println("Podano błedny znak !!!!!!!!!");
                break;
            }
            lists.add(nameCity);
        }while (!nameCity.equals("-"));

        for (String list : lists) {
            System.out.println(list);
        }
        //Exercise 2

        Map<String, String> maps = new HashMap<>();
        String country;
        String capitalCity;

        do {
            System.out.println("Podaj nazwe kraju");
            country = scanner.nextLine();
            if (country.equals("/")){
                break;
            }
            System.out.println("Podaj nazwe stolicy");
            capitalCity = scanner.nextLine();
            if (capitalCity.equals("/")){
                break;
            }
            maps.put(country, capitalCity);
        }while (!country.equals("/") || !capitalCity.equals("/"));
        System.out.println("Wprowadz nazwe kraju. Wynikiem bedzie wyswietlenie stolicy");
        String name = scanner.nextLine();

        for (Map.Entry<String, String> map : maps.entrySet()) {
            if (map.getKey().equals(name)){
                System.out.println("Nazwa kraju:" + map.getKey() + "\nNazwa stolicy: " + map.getValue());
            }
        }
    }
}