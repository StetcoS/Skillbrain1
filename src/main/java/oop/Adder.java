package oop;

public class Adder {
    public int add ( int a, int b){ // over loading
        return a + b;
    }
    public String add(String a, String b){
        int value1 = Integer.parseInt(a); // transformare in numar intreg
        int value2 = Integer.parseInt(b);
        int rez = value1 + value2;

        // return String.valueOf(rez); // transformare in String
        return rez + ""; //transformare in String
    }
    public double add(String a, double b) {
        double value1 = Double.parseDouble(a);
        return value1 + b;
    }
}
