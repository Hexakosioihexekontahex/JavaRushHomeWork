package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.TreeSet;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }


    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {

        int distanceParameter = (int) (distance - o.getDistance());
        int qualityParameter = (int) (quality - o.getQuality());
        return 10000 * name.compareTo(o.getName()) + 100 * distanceParameter + qualityParameter;
    }

    public static void main(String[] args) {

        TreeSet<Beach> beachSet = new TreeSet<Beach>();

        beachSet.add(new Beach("beach1", 562.5f, 8));
        beachSet.add(new Beach("beach2", 562.5f, 9));
        beachSet.add(new Beach("beach3", 562.5f, 7));
        beachSet.add(new Beach("beach4", 562.5f, 7));
        beachSet.add(new Beach("beach5", 562.5f, 8));
        beachSet.add(new Beach("beach6", 562.5f, 6));

    }
}