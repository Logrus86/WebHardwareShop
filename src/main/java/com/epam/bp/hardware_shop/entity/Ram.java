package com.epam.bp.hardware_shop.entity;

public class Ram extends Ware {
    private int capacityMb;
    private int maxFrequencyMHz;
    private RamType ramtype;

    public int getCapacityMb() {
        return capacityMb;
    }

    public Ram setCapacityMb(int capacityMb) {
        this.capacityMb = capacityMb;
        return this;
    }

    public int getMaxFrequencyMHz() {
        return maxFrequencyMHz;
    }

    public Ram setMaxFrequencyMHz(int maxFrequencyMHz) {
        this.maxFrequencyMHz = maxFrequencyMHz;
        return this;
    }

    public RamType getRamtype() {
        return ramtype;
    }

    public Ram setRamtype(RamType ramtype) {
        this.ramtype = ramtype;
        return this;
    }

    @Override
    public String toString() {
        return "Ram {" +
                "capacityMb=" + getCapacityMb() +
                ", maxFrequencyMHz=" + getMaxFrequencyMHz() +
                ", ramtype=" + getRamtype() +
                ", vendor=" + getVendor() +
                ", model=" + getModel() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }

    public enum RamType {
        DDR2, DDR3
    }
}
