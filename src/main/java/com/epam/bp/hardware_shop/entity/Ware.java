package com.epam.bp.hardware_shop.entity;

import java.math.BigDecimal;
import java.util.Comparator;

public abstract class Ware implements Cloneable, Comparable<Ware> {
    private BigDecimal price;
    public static final Comparator<Ware> PRICE_COMPARATOR = new Comparator<Ware>() {
        @Override
        public int compare(Ware ware1, Ware ware2) {
            return ware1.price.compareTo(ware2.price);
        }
    };
    private int weight;
    private String model;
    private Vendor vendor;

    public Vendor getVendor() {
        return vendor;
    }

    public Ware setVendor(Vendor vendor) {
        this.vendor = vendor;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Ware setModel(String model) {
        this.model = model;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Ware setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Ware setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    protected Ware clone() {
        try {
            return (Ware) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Ware another) {
        return this.price.compareTo(another.price);
    }

    public enum Vendor {
        AMD, INTEL, NVIDIA, ASUS, HP, DELL, LENOVO, ACER, SAMSUNG, APPLE, TOSHIBA, GIGABYTE, MSI, PHILLIPS, SONY
    }
}
