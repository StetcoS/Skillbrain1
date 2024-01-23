package org.exemple;

import javax.swing.*;

public class MainOOP {
    public static void main(String[] args) {
        Lasagna lasagna1 = new Lasagna();
        System.out.println(lasagna1.totalTimeMinutes());
        System.out.println(lasagna1.totalTimeMinutes(JLayer:3,minutes:20));
    }
}
