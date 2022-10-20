package com.numerics;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while(true){
            String liczba1, liczba2;
            int baz1, baz2,baz3;
            System.out.println("Wybierz co chcesz zrobic:");
            System.out.println("1. Zamien baze liczby");
            System.out.println("2. Dodaj liczby");
            System.out.println("3. Odejmij liczby");
            System.out.println("4. Wyjdz z aplikacji");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(input.charAt(0) == '1'){

                zamianaBazy zam = new zamianaBazy();

                System.out.println("Podaj baze liczby:");
                baz1 = scanner.nextInt();

                System.out.println("Podaj liczbe:");
                liczba1 = scanner.next();

                System.out.println("Podaj baze na ktora chcesz zmienic:");
                baz2 = scanner.nextInt();

                System.out.println(zam.zamien(baz1,liczba1,baz2)); 

            } else if(input.charAt(0) == '2'){

                dodawanie dod = new dodawanie();

                System.out.println("Podaj baze pierwszej liczby:");
                baz1 = scanner.nextInt();

                System.out.println("Podaj pierwsza liczbe:");
                liczba1 = scanner.next();

                System.out.println("Podaj baze drugiej liczby:");
                baz2 = scanner.nextInt();

                System.out.println("Podaj druga liczbe:");
                liczba2 = scanner.next();

                System.out.println("Podaj baze wyniku:");
                baz3 = scanner.nextInt();

                System.out.println(dod.dodaj(baz1, liczba1, baz2, liczba2, baz3)); 

            } else if(input.charAt(0) == '3'){

                odejmowanie ode = new odejmowanie();

                System.out.println("Podaj baze pierwszej liczby:");
                baz1 = scanner.nextInt();

                System.out.println("Podaj pierwsza liczbe:");
                liczba1 = scanner.next();

                System.out.println("Podaj baze drugiej liczby:");
                baz2 = scanner.nextInt();

                System.out.println("Podaj druga liczbe:");
                liczba2 = scanner.next();

                System.out.println("Podaj baze wyniku:");
                baz3 = scanner.nextInt();

                System.out.println(ode.odejmij(baz1, liczba1, baz2, liczba2, baz3)); 

            } else if(input.charAt(0) == '4'){
                return;
            }
        }
    }
}

