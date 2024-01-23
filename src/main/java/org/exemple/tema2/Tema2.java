package org.exemple.tema2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tema2 {
    public static void cerinta1() {
        Scanner citire1 = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numar = citire1.nextInt();
        citire1.close();
        int numarRandom = (int) (Math.random() * 101);
        System.out.println("Numarul introdus: " + numar);
        System.out.println("Numarul generat aleatoriu: " + numarRandom);

        if (numar < numarRandom) {
            System.out.println("Numarul introdus" + numar + "este mai mic decat " + numarRandom);
        } else {
            System.out.println("Numarul este mai mare.");
        }

    }

    public static void cerinta2() {
        Scanner citire2 = new Scanner(System.in);
        System.out.println("Introduceti un caracter ('a','s','i','p','m'):");
        char caracter = citire2.next().charAt(0);
        System.out.println("Introduceti primul numar:");
        int numar1 = citire2.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int numar2 = citire2.nextInt();

        int rezultat;
        switch (caracter) {
            case 'a':
                rezultat = numar1 + numar2;
                System.out.println("Rezultatul adunarii:" + rezultat);
                break;
            case 's':
                rezultat = numar1 - numar2;
                System.out.println("Diferenta celor doua numare este: " + rezultat);
                break;
            case 'i':
                rezultat = numar1 * numar2;
                System.out.println("Inmultirea celor doua numere este: " + rezultat);
                break;
            case 'p':
                rezultat = numar1 / numar2;
                System.out.println("Impartirea celor doua numere este: " + rezultat);
                break;
            case 'm':
                rezultat = numar1 % numar2;
                System.out.println("Modulul celor doua numere este: " + rezultat);
                break;
            default:
                System.out.println("Caracterul introdus nu este valid.");
        }
    }

    public static void cerinta3() {
        int[][] numbers = {{1, 23, 7, 2, 8}, {21, 43, 56, 78, 22}, {11, 55, 33, 66, 77}};

        System.out.println("Primul element: " + (numbers[0][0]) + " si ultimul element de pe prima coloana" + (numbers[0][4]));
        System.out.println("Primul element: " + (numbers[1][0]) + " si ultimul element de pe a doua coloana" + (numbers[1][4]));
        System.out.println("Primul element: " + (numbers[2][0]) + " si ultimul element de pe a treia coloana" + (numbers[2][4]));


    }

    public static void cerinta4() {
        char[] arrayCaractere = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        for (int i = 0; i < arrayCaractere.length; i += 2) {
            System.out.println("Numarul de pe pozitia " + i + " este " + arrayCaractere[i]);
        }

    }

    public static void cerinta5() {
        double[] arrayDouble = {3.5, 4.5, 2.7, 9.4};
        for (int i = 0; i < arrayDouble.length; i++) {
            if (arrayDouble[i] == 4.5) {
                System.out.println("Afiseaza pe ecran elementul " + arrayDouble[i] + " este egal cu 4.5");
            }
            if (arrayDouble[i] > 5) {
                System.out.println("Elementul peste 5 " + arrayDouble[i]);
            }
        }
    }

    public static void cerinta6() {
        int[] element = {1, 2, 3, 4, 5, 6, 7, 13, 10};
        for (int i = 0; i < element.length; i++) {
            if (i == 2) {
                continue;
            } else if (i == 7) {
                break;
            } else {
                System.out.println("Index valid:" + i);
            }
        }
    }

    public static void cerinta7() {
        ArrayList<Integer> listaInt = new ArrayList<Integer>();
        listaInt.add(14);
        listaInt.add(30);
        listaInt.add(55);
        listaInt.add(22);
        listaInt.add(13);
        int suma = 0;
        for (Integer i : listaInt) {
            suma += i;
        }
        System.out.println("Suma tuturor elementelor: " + suma);
    }

    public static void cerinta8() {
        int[] numar1 = {1, 3, 5};
        boolean arrayGol = numar1.length == 0;
        System.out.println("Array-ul este gol: " + arrayGol);
        ArrayList<Integer> numar2 = new ArrayList<Integer>();
        boolean listaGoala = numar2.isEmpty();
        System.out.println("Lista este goala: " + listaGoala);
    }

    public static void cerinta9() {
        Integer[] liste2 = {211, 13, 2, 28, 47, 12, 239};
        Arrays.sort(liste2);
        System.out.println("Sortare crescatoare" + Arrays.toString(liste2));


        Arrays.sort(liste2, Collections.reverseOrder());
        System.out.println("Sortare descrescatoare: " + Arrays.toString(liste2));
    }

}