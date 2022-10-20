package com.numerics;

public class zamianaBazy {
    String odp = "";
    int zliczanie, pom = 1,potega = 1, licz;
    public String zamien(int baz, String liczba, int nabaz){
        for(int i = liczba.length() -1; i >= 0; i--){
            zliczanie += Character.getNumericValue(liczba.charAt(i)) * pom;
            pom *= baz;
        }

        pom = 1;
        while(true){
            if(pom * nabaz > zliczanie)
                break;
            pom *= nabaz;
            potega ++;
        }

        while(potega > 0){
            if(zliczanie >= pom){
                zliczanie -= pom;
                licz ++;
            }
            else {
                odp += Integer.toString(licz);
                pom /= nabaz;
                licz = 0;
                potega --;
            }
        }


        return odp;
    }
}
