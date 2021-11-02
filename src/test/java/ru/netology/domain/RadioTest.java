package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void setNewStation (){
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void ifNewStationIsOutOfRangeAbove (){
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void ifNewStationIsOutOfRangeUnder (){
        Radio radio = new Radio();
        radio.setCurrentStation(-3);
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void ifNewStationIsACurrentStation (){
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void increaseStation (){
        Radio radio = new Radio();
        radio.increaseStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void increaseIfStationIsAlready9 (){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void decreaseStation (){
        Radio radio = new Radio();
        radio.decreaseStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void decreaseIfStationIsAlready0 (){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void increaseVolume (){
        Radio radio = new Radio();
        radio.volumeUp();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void increaseIfVolumeIsAlready10 (){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void decreaseVolume (){
        Radio radio = new Radio();
        radio.volumeDown();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void decreaseIfVolumeIsAlready0 (){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }
}