package com.epam.bp.hardware_shop;

import com.epam.bp.hardware_shop.entity.HwShop;
import com.epam.bp.hardware_shop.entity.Ware;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;

public class HwShopUtil {

    public static HwShop SortByPrice(HwShop hwShop, Comparator<Ware> comparator) {
        HwShop result = hwShop.clone();
        Collections.sort(result.wares, comparator);
        return result;
    }

    public static HwShop SelectByPrice(HwShop hwShop, BigDecimal lowLimit, BigDecimal highLimit) {
        HwShop result = new HwShop();
        result.setTitle("HWShop with wares selected by LOW_PRICE (" + lowLimit + ") and HIGH_PRICE (" + highLimit + ")");
        result.setAddress("We still somewhere at the same Universe");
        for (Ware ware : hwShop.wares) {
            if ((ware.getPrice().compareTo(lowLimit) < 0) | (ware.getPrice().compareTo(highLimit) > 0)) {
                continue;
            }
            result.add(ware);
            result.setWaresAmount(result.getWaresAmount() + 1);
        }
        return result;
    }
}
