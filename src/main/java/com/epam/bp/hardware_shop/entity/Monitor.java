package com.epam.bp.hardware_shop.entity;

public class Monitor extends Ware {
    private int displaySizeInches;
    private DisplayResolution displayResolution;
    private boolean vgaOut;
    private boolean dviOut;
    private boolean hdmiOut;
    private boolean speakersBuiltin;

    public int getDisplaySizeInches() {
        return displaySizeInches;
    }

    public Monitor setDisplaySizeInches(int displaySizeInches) {
        this.displaySizeInches = displaySizeInches;
        return this;
    }

    public DisplayResolution getDisplayResolution() {
        return displayResolution;
    }

    public Monitor setDisplayResolution(DisplayResolution displayResolution) {
        this.displayResolution = displayResolution;
        return this;
    }

    public boolean isVgaOut() {
        return vgaOut;
    }

    public Monitor setVgaOut(boolean vgaOut) {
        this.vgaOut = vgaOut;
        return this;
    }

    public boolean isDviOut() {
        return dviOut;
    }

    public Monitor setDviOut(boolean dviOut) {
        this.dviOut = dviOut;
        return this;
    }

    public boolean isHdmiOut() {
        return hdmiOut;
    }

    public Monitor setHdmiOut(boolean hdmiOut) {
        this.hdmiOut = hdmiOut;
        return this;
    }

    public boolean isSpeakersBuiltin() {
        return speakersBuiltin;
    }

    public Ware setSpeakersBuiltin(boolean speakersBuiltin) {
        this.speakersBuiltin = speakersBuiltin;
        return this;
    }

    @Override
    public String toString() {
        return "Monitor {" +
                "displaySizeInches=" + getDisplaySizeInches() +
                ", displayResolution=" + getDisplayResolution() +
                ", vgaOut=" + isVgaOut() +
                ", dviOut=" + isDviOut() +
                ", hdmiOut=" + isHdmiOut() +
                ", speakersBuiltin=" + isSpeakersBuiltin() +
                ", vendor=" + getVendor() +
                ", model=" + getModel() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }

    public enum DisplayResolution {
        H1920V1080, H1366V768, H1600V900, H1920V1200, H2560V1080, H2560V1440
    }
}
