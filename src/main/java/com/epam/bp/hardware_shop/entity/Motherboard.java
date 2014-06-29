package com.epam.bp.hardware_shop.entity;

public class Motherboard extends Ware {
    private Cpu.Socket socket;
    private boolean vgaOnboard;
    private boolean raidOnboard;
    private FormFactor formFactor;
    private int sataCount;
    private int usbCount;
    private int ddrCount;
    private int maxRamSizeGb;

    public Cpu.Socket getSocket() {
        return socket;
    }

    public Motherboard setSocket(Cpu.Socket socket) {
        this.socket = socket;
        return this;
    }

    public boolean isVgaOnboard() {
        return vgaOnboard;
    }

    public Motherboard setVgaOnboard(boolean vgaOnboard) {
        this.vgaOnboard = vgaOnboard;
        return this;
    }

    public boolean isRaidOnboard() {
        return raidOnboard;
    }

    public Motherboard setRaidOnboard(boolean raidOnboard) {
        this.raidOnboard = raidOnboard;
        return this;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public Motherboard setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    public int getSataCount() {
        return sataCount;
    }

    public Motherboard setSataCount(int sataCount) {
        this.sataCount = sataCount;
        return this;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public Motherboard setUsbCount(int usbCount) {
        this.usbCount = usbCount;
        return this;
    }

    public int getDdrCount() {
        return ddrCount;
    }

    public Motherboard setDdrCount(int ddrCount) {
        this.ddrCount = ddrCount;
        return this;
    }

    public int getMaxRamSizeGb() {
        return maxRamSizeGb;
    }

    public Motherboard setMaxRamSizeGb(int maxRamSizeGb) {
        this.maxRamSizeGb = maxRamSizeGb;
        return this;
    }

    @Override
    public String toString() {
        return "Motherboard {" +
                "socket=" + getSocket() +
                ", vgaOnboard=" + isVgaOnboard() +
                ", raidOnboard=" + isRaidOnboard() +
                ", formFactor=" + getFormFactor() +
                ", sataCount=" + getSataCount() +
                ", usbCount=" + getUsbCount() +
                ", ddrCount=" + getDdrCount() +
                ", maxRamSizeGb=" + getMaxRamSizeGb() +
                ", vendor=" + getVendor() +
                ", model=" + getModel() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }

    public enum FormFactor {
        ATX, MICROATX, MINI_ITX
    }

}
