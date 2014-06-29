package com.epam.bp.hardware_shop.entity;

public class VideoCard extends Ware {
    private int ramSizeMb;
    private int ramFrequencyMHz;
    private int cpuFrequencyMHz;
    private int busWidthBit;
    private VideoCardChipset videoCardChipset;

    public int getRamSizeMb() {
        return ramSizeMb;
    }

    public VideoCard setRamSizeMb(int ramSizeMb) {
        this.ramSizeMb = ramSizeMb;
        return this;
    }

    public int getRamFrequencyMHz() {
        return ramFrequencyMHz;
    }

    public VideoCard setRamFrequencyMHz(int ramFrequencyMHz) {
        this.ramFrequencyMHz = ramFrequencyMHz;
        return this;
    }

    public int getCpuFrequencyMHz() {
        return cpuFrequencyMHz;
    }

    public VideoCard setCpuFrequencyMHz(int cpuFrequencyMHz) {
        this.cpuFrequencyMHz = cpuFrequencyMHz;
        return this;
    }

    public int getBusWidthBit() {
        return busWidthBit;
    }

    public VideoCard setBusWidthBit(int busWidthBit) {
        this.busWidthBit = busWidthBit;
        return this;
    }

    public VideoCardChipset getVideoCardChipset() {
        return videoCardChipset;
    }

    public VideoCard setVideoCardChipset(VideoCardChipset videoCardChipset) {
        this.videoCardChipset = videoCardChipset;
        return this;
    }

    @Override
    public String toString() {
        return "VideoCard {" +
                "ramSizeMb=" + getRamSizeMb() +
                ", ramFrequencyMHz=" + getRamFrequencyMHz() +
                ", cpuFrequencyMHz=" + getCpuFrequencyMHz() +
                ", busWidthBit=" + getBusWidthBit() +
                ", videoCardChipset=" + getVideoCardChipset() +
                ", vendor=" + getVendor() +
                ", model=" + getModel() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }

    public enum VideoCardChipset {
        RADEON, GEFORCE
    }

}
