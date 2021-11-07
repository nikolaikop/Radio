package ru.netology.domain;

public class Radio {
    private int setCurrentStation = 2;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume = 2;
    private int maxVolume = 10;
    private int minVolume = 0;

    public void setCurrentStation(int setCurrentStation) {
        if ((setCurrentStation <= maxStation) && (setCurrentStation >= minStation)) {

            this.setCurrentStation = setCurrentStation;
        }
        return;
    }

    public void increaseStation() {
        if (setCurrentStation == maxStation) {
            setCurrentStation = minStation;
        } else {
            setCurrentStation = setCurrentStation + 1;
        }
        return;
    }

    public void decreaseStation() {
        if (setCurrentStation == minStation) {
            setCurrentStation = maxStation;
        } else {
            setCurrentStation = setCurrentStation - 1;
        }
        return;
    }

    public int getCurrentStation() {
        return setCurrentStation;
    }

    public void setCurrentVolume (int currentVolume){
        this.currentVolume = currentVolume;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

}