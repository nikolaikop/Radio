package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation = 2;
    private int setNumOfStations = 10;
    private int maxStation;
    private int minStation = 0;
    private int currentVolume = 2;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setCurrentStation(int setCurrentStation) {
        maxStation = setNumOfStations - 1;
        if ((setCurrentStation <= maxStation) && (setCurrentStation >= minStation)) {
            this.currentStation = setCurrentStation;
        }
        return;
    }

    public void increaseStation() {
        maxStation = setNumOfStations - 1;
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
        return;
    }

    public void decreaseStation() {
        maxStation = setNumOfStations - 1;
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
        return;
    }

    public void volumeUp() {
        this.currentVolume = currentVolume;
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void volumeDown() {
        this.currentVolume = currentVolume;
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        }
        return;
    }
}