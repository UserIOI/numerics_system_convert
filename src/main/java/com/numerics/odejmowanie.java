package com.numerics;

public class odejmowanie {
    String wynik, licz1, licz2;
    String str = "";
    int li1, li2;
    zamianaBazy zamiana = new zamianaBazy();
    zamianaBazy zamiana2 = new zamianaBazy();
    zamianaBazy zamiana3 = new zamianaBazy();
    public String odejmij(int baz1, String liczba1, int baz2, String liczba2, int baz3){
        li1 = Integer.parseInt(zamiana.zamien(baz1, liczba1, 10));

        li2 = Integer.parseInt(zamiana2.zamien(baz2, liczba2, 10));
        if(li1 < li2){
            System.out.println("Wynik jest liczba ujemna");
            return str;
        }
        
        wynik = zamiana3.zamien(10, Integer.toString(li1 - li2), baz3);
        return wynik;
    }
}
