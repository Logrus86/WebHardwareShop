package com.epam.bp.hardware_shop.entity;

public class Hdd extends Ware {
    private int capacityGb;
    private int rotatingSpeedRpm;
    private FormFactor formfactorHdd;

    public int getCapacityGb() {
        return capacityGb;
    }

    public Hdd setCapacityGb(int capacityGb) {
        this.capacityGb = capacityGb;
        return this;
    }

    public int getRotatingSpeedRpm() {
        return rotatingSpeedRpm;
    }

    public Hdd setRotatingSpeedRpm(int rotatingSpeedRpm) {
        this.rotatingSpeedRpm = rotatingSpeedRpm;
        return this;
    }

    public FormFactor getFormfactorHdd() {
        return formfactorHdd;
    }

    public Hdd setFormfactorHdd(FormFactor formfactorHdd) {
        this.formfactorHdd = formfactorHdd;
        return this;
    }

    @Override
    public String toString() {
        return "Hdd {" +
                "capacityGb=" + getCapacityGb() +
                ", rotatingSpeedRpm=" + getRotatingSpeedRpm() +
                ", formfactorHdd=" + getFormfactorHdd() +
                ", vendor=" + getVendor() +
                ", model=" + getModel() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }

    public enum FormFactor {
        INCHES2DOT5, INCHES3DOT5
    }
}
