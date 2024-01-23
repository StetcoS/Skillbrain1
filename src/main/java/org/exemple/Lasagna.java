package org.exemple;

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOver(int actualMinutes) {
        if (actualMinutes >= 40) {
            return 0;
        }
        return 40 - actualMinutes;
    }
public int preparationTimeInMinutes(int layers){
        return layers * 2;
}
public int totalTimeMinutes(int layers,int minutes){
        int preparationMinutes = preparationTimeInMinutes(layers);
        int remainingMinutes =remainingMinutesInOver(minutes);
        return preparationMinutes
}
}
