package ru.netology.domain;

public class Radio {
    private int setCurrentStation = 2;
    private int setNumOfStations = 10;
    private int maxStation;
    private int minStation = 0;
    private int currentVolume = 2;
    private int maxVolume = 100;
    private int minVolume = 0;


    public void setNumOfStations (int setNumOfStations){
        this.setNumOfStations = setNumOfStations;
    }

    public void setCurrentStation(int setCurrentStation) {
        maxStation = setNumOfStations - 1;
        if ((setCurrentStation <= maxStation) && (setCurrentStation >= minStation)) {
            this.setCurrentStation = setCurrentStation;
        }
        return;
    }

    public void increaseStation() {
        maxStation = setNumOfStations - 1;
        if (setCurrentStation == maxStation) {
            setCurrentStation = minStation;
        } else {
            setCurrentStation = setCurrentStation + 1;
        }
        return;
    }

    public void decreaseStation() {
        maxStation = setNumOfStations - 1;
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