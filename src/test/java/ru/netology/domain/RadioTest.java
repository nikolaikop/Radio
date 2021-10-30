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
        radio.increaseStation(4);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void increaseIfStationIsAlready9 (){
        Radio radio = new Radio();
        radio.increaseStation(9);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void decreaseStation (){
        Radio radio = new Radio();
        radio.decreaseStation(2);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void decreaseIfStationIsAlready0 (){
        Radio radio = new Radio();
        radio.decreaseStation(0);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void increaseVolume (){
        Radio radio = new Radio();
        radio.volumeUp(5);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void increaseIfVolumeIsAlready10 (){
        Radio radio = new Radio();
        radio.volumeUp(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void decreaseVolume (){
        Radio radio = new Radio();
        radio.volumeDown(1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @Test
    public void decreaseIfVolumeIsAlready0 (){
        Radio radio = new Radio();
        radio.volumeDown(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals( expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }
}