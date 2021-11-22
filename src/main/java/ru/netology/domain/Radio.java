package ru.netology.domain;

public class Radio {
    private int currentStation = 2;
    private int numOfStations = 10;
    private int maxStation;
    private int minStation = 0;
    private int currentVolume = 2;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setCurrentStation(int currentStation) {
        maxStation = numOfStations - 1;
        if ((currentStation <= maxStation) && (currentStation >= minStation)) {
            this.currentStation = currentStation;
        }
        return;
    }

    public void increaseStation() {
        maxStation = numOfStations - 1;
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
        return;
    }

    public void decreaseStation() {
        maxStation = numOfStations - 1;
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

    public void setNumOfStations (){
    }

    public void setNumOfStations (int numOfStations){
        this.numOfStations = numOfStations;
    }

    public int getNumOfStations() {
        return numOfStations;
    }

    public void setMaxStation (int maxStation){
        this.maxStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMinStation (int minStation){
        this.minStation = minStation;
    }

    public int getMinStation() {
        return minStation;
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

    public void setMaxVolume (int maxVolume){
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMinVolume (int minVolume){
        this.minVolume = minVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

}