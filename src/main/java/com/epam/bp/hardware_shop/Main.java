package com.epam.bp.hardware_shop;

import com.epam.bp.hardware_shop.entity.HwShop;
import com.epam.bp.hardware_shop.entity.HwShopFactory;
import com.epam.bp.hardware_shop.entity.Ware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class Main {
    private static final int WARES_AMOUNT = 5;
    private static final BigDecimal LOW_PRICE = BigDecimal.valueOf(20000);
    private static final BigDecimal HIGH_PRICE = BigDecimal.valueOf(100000);
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        HwShop hwShop = HwShopFactory.createRandomHWShop(WARES_AMOUNT);
        LOGGER.info("Generated random HWShop:\n" + hwShop);
        LOGGER.info("Cloned and sorted by price HWShop:\n" + HwShopUtil.SortByPrice(hwShop, Ware.PRICE_COMPARATOR));
        LOGGER.info("\n" + HwShopUtil.SelectByPrice(hwShop, LOW_PRICE, HIGH_PRICE));
    }
}
