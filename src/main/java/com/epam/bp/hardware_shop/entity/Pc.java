package com.epam.bp.hardware_shop.entity;

public class Pc extends Ware {
    private Ware cpu;
    private Ware videoCard;
    private Ware hdd;
    private Ware ram;
    private Ware motherboard;
    private Ware monitor;
    private boolean mouseAndKeyboardIncluded;
    private boolean speakersIncluded;
    private PreinstalledOs preinstalledOs;

    public Ware getCpu() {
        return cpu;
    }

    public Pc setCpu(Ware cpu) {
        this.cpu = cpu;
        return this;
    }

    public Ware getVideoCard() {
        return videoCard;
    }

    public Pc setVideoCard(Ware videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public Ware getHdd() {
        return hdd;
    }

    public Pc setHdd(Ware hdd) {
        this.hdd = hdd;
        return this;
    }

    public Ware getRam() {
        return ram;
    }

    public Pc setRam(Ware ram) {
        this.ram = ram;
        return this;
    }

    public Ware getMotherboard() {
        return motherboard;
    }

    public Pc setMotherboard(Ware motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public Ware getMonitor() {
        return monitor;
    }

    public Pc setMonitor(Ware monitor) {
        this.monitor = monitor;
        return this;
    }

    public boolean isMouseAndKeyboardIncluded() {
        return mouseAndKeyboardIncluded;
    }

    public Pc setMouseAndKeyboardIncluded(boolean mouseAndKeyboardIncluded) {
        this.mouseAndKeyboardIncluded = mouseAndKeyboardIncluded;
        return this;
    }

    public boolean isSpeakersIncluded() {
        return speakersIncluded;
    }

    public Pc setSpeakersIncluded(boolean speakersIncluded) {
        this.speakersIncluded = speakersIncluded;
        return this;
    }

    public PreinstalledOs getPreinstalledOs() {
        return preinstalledOs;
    }

    public Pc setPreinstalledOs(PreinstalledOs preinstalledOs) {
        this.preinstalledOs = preinstalledOs;
        return this;
    }

    @Override
    public String toString() {
        return "Pc {" +
                this.getCpu() +
                ", " + getVideoCard() +
                ", " + getHdd() +
                ", " + getRam() +
                ", " + getMotherboard() +
                ", " + getMonitor() +
                ", mouseAndKeyboardIncluded=" + isMouseAndKeyboardIncluded() +
                ", speakersIncluded=" + isSpeakersIncluded() +
                ", preinstalledOs=" + getPreinstalledOs() +
                ", vendor=" + getVendor() +
                ", model=" + getModel() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }

    public enum PreinstalledOs {
        DOS, LINUX, MACOSX, MSWINDOWS7, MSWINDOWS8, NONE
    }
}
