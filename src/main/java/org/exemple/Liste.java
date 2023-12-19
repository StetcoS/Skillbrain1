package org.exemple;

import java.util.ArrayList;

public class Liste {
    public static void main(String[] args) {

        String[]array = new String[10];
        array[1]="Ana are mere";
        ArrayList<String> list = new ArrayList<>();
        list.add("Ana are mere");
        list.add("Ana are prune");
        list.add("Ana are pere");
        list.add("Ana are banane");
        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
