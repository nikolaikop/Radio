package ru.netology.domain;

public class Radio {
    private int currentStation = 2;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume = 1;
    private int maxVolume = 10;
    private int minVolume = 0;

    public void setCurrentStation(int newCurrentStation) {
        this.currentStation = currentStation;
        if ((newCurrentStation <= maxStation) && (newCurrentStation >= minStation)) {

            currentStation = newCurrentStation;
        } else {
            currentStation = currentStation;
        }
        return;
    }

    public void increaseStation(int setCurrentStation) {
        this.currentStation = setCurrentStation;
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
        return;
    }

    public void decreaseStation(int setCurrentStation) {
        this.currentStation = setCurrentStation;
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
        return;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void volumeUp(int setVolume) {
        this.currentVolume = setVolume;
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void volumeDown(int setVolume) {
        this.currentVolume = setVolume;
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}