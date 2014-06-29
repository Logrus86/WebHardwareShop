package com.epam.bp.hardware_shop.entity;

public class Cpu extends Ware {

    private int frequencyMHz;
    private int coreQuantity;
    private int techProcessNm;
    private Socket socket;

    public Socket getSocket() {
        return socket;
    }

    public Cpu setSocket(Socket socket) {
        this.socket = socket;
        return this;
    }

    public int getFrequencyMHz() {
        return frequencyMHz;
    }

    public Cpu setFrequencyMHz(int frequencyMHz) {
        this.frequencyMHz = frequencyMHz;
        return this;
    }

    public int getCoreQuantity() {
        return coreQuantity;
    }

    public Cpu setCoreQuantity(int coreQuantity) {
        this.coreQuantity = coreQuantity;
        return this;
    }

    public int getTechProcessNm() {
        return techProcessNm;
    }

    public Cpu setTechProcessNm(int techProcessNm) {
        this.techProcessNm = techProcessNm;
        return this;
    }

    @Override
    public String toString() {
        return "Cpu {" +
                "frequencyMHz=" + getFrequencyMHz() +
                ", coreQuantity=" + getCoreQuantity() +
                ", techProcessNm=" + getTechProcessNm() +
                ", socket=" + getSocket() +
                ", vendor=" + getVendor() +
                ", model=" + getModel() +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                '}';
    }

    public enum Socket {
        LGA1150, LGA1155, LGA1156, FM1, FM2
    }
}
