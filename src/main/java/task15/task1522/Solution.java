package task15.task1522;

import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static
    {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (Planet.EARTH.equals(s)) {
            thePlanet = Earth.getInstance();
        } else if (Planet.MOON.equals(s)) {
            thePlanet = Moon.getInstance();
        } else if (Planet.SUN.equals(s)) {
            thePlanet = Sun.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
