package com.epam.bp.hardware_shop.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HwShop implements Cloneable {
    public List<Ware> wares = new ArrayList<>();
    private String title;
    private String address;
    private int waresAmount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWaresAmount() {
        return waresAmount;
    }

    public HwShop setWaresAmount(int waresAmount) {
        this.waresAmount = waresAmount;
        return this;
    }

    public void add(Ware ware) {
        wares.add(ware);
    }

    public BigDecimal getTotalWaresCost() {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (Ware ware : wares) {
            totalCost = totalCost.add(ware.getPrice());
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder()
                .append("Hardware shop named '")
                .append(getTitle())
                .append("' with address: '")
                .append(getAddress())
                .append("'.\nWares amount at store: ")
                .append(getWaresAmount())
                .append(".\nTotal wares cost: ")
                .append(getTotalWaresCost())
                .append(".\nFull wares list:\n");
        int i = 0;
        for (Ware ware : wares) {
            result.append((i + 1))
                    .append(". ")
                    .append(ware)
                    .append("\n");
            i++;
        }
        return result.toString();
    }

    @Override
    public HwShop clone() {
        try {
            HwShop clone = (HwShop) super.clone();
            List<Ware> cloneWares = new ArrayList<>();
            for (Ware ware : this.wares) cloneWares.add(ware.clone());
            clone.wares = cloneWares;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

