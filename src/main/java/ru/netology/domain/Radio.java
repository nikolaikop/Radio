package ru.netology.domain;

public class Radio {
    private int currentStation = 2;
    private int numOfStations = 10;
    private int maxStation;
    private int minStation = 0;
    private short currentVolume = 2;
    private short maxVolume = 100;
    private short minVolume = 0;

    public Radio() {
    }

    public Radio(short currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
        else if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }
        else this.currentVolume = currentVolume;
    }

    public Radio(int numOfStations) {
        setNumOfStations(numOfStations);
    }

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

    public void setMaxStation (short maxStation){
        this.maxStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMinStation (short minStation){
        this.minStation = minStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void volumeUp() {
        this.currentVolume = currentVolume;
        //if (currentVolume != maxVolume) {
            currentVolume = (short) (currentVolume + 1);
        //}
        return;
    }

    public void volumeDown() {
        this.currentVolume = currentVolume;
        //if (currentVolume != minVolume) {
        currentVolume = (short) (currentVolume - 1);
    //}
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxVolume (short maxVolume){
        this.maxVolume = maxVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMinVolume (short minVolume){
        this.minVolume = minVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

}