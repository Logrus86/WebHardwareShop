package com.epam.bp.hardware_shop.entity;

public class Notebook extends Ware {
    private int displaySizeInches;
    private Ware cpu;
    private Ware videoCard;
    private Ware hdd;
    private Ware ram;
    private Monitor.DisplayResolution displayResolution;

    public Ware getCpu() {
        return cpu;
    }

    public Notebook setCpu(Ware cpu) {
        this.cpu = cpu;
        return this;
    }

    public Monitor.DisplayResolution getDisplayResolution() {
        return displayResolution;
    }

    public Notebook setDisplayResolution(Monitor.DisplayResolution displayResolution) {
        this.displayResolution = displayResolution;
        return this;
    }

    public Ware getVideoCard() {
        return videoCard;
    }

    public Notebook setVideoCard(Ware videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public Ware getHdd() {
        return hdd;
    }

    public Notebook setHdd(Ware hdd) {
        this.hdd = hdd;
        return this;
    }

    public Ware getRam() {
        return ram;
    }

    public Notebook setRam(Ware ram) {
        this.ram = ram;
        return this;
    }

    public int getDisplaySizeInches() {
        return displaySizeInches;
    }

    public Notebook setDisplaySizeInches(int displaySizeInches) {
        this.displaySizeInches = displaySizeInches;
        return this;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "displaySizeInches=" + getDisplaySizeInches() +
                ", displayResolution=" + getDisplayResolution() +
                ", " + getCpu() +
                ", " + getVideoCard() +
                ", " + getHdd() +
                ", " + getRam() +
                ", " + getVendor() +
                ", model=" + getModel() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }
}
