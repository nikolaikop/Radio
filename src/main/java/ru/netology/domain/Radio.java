package ru.netology.domain;

public class Radio {
    private int currentStation = 2;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume = 2;
    private int maxVolume = 10;
    private int minVolume = 0;

    public void setCurrentStation(int setCurrentStation) {
        if ((setCurrentStation <= maxStation) && (setCurrentStation >= minStation)) {

            currentStation = setCurrentStation;
        } else {
            this.currentStation = currentStation;
        }
        return;
    }

    public void increaseStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
        return;
    }

    public void decreaseStation() {
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

    public void setCurrentVolume (int currentVolume){
        this.currentVolume = currentVolume;
    }

    public void volumeUp(/*int setVolume*/) {
        this.currentVolume = currentVolume;
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void volumeDown(/*int setVolume*/) {
        this.currentVolume = currentVolume;
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}