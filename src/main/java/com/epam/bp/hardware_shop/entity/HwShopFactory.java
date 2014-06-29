package com.epam.bp.hardware_shop.entity;

import java.util.Random;

public class HwShopFactory {
    private static int minMaxRandom(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    public static HwShop createRandomHWShop(int waresAmount) {
        HwShop hwShop = new HwShop();
        hwShop.setTitle("Some hardware shop №" + minMaxRandom(1, 1000));
        hwShop.setAddress("Somewhere in the Universe");
        hwShop.setWaresAmount(waresAmount);
        for (int i = 0; i < waresAmount; i++) {
            Ware ware = WareFactory.createRandomWare();
            hwShop.add(ware);
        }
        return hwShop;
    }

}
