package com.epam.bp.hardware_shop.servlet;

import com.epam.bp.hardware_shop.entity.HwShop;
import com.epam.bp.hardware_shop.entity.HwShopFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import java.math.BigDecimal;

public class MainServlet extends javax.servlet.http.HttpServlet {
    private static final int WARES_AMOUNT = 5;
    private static final BigDecimal LOW_PRICE = BigDecimal.valueOf(20000);
    private static final BigDecimal HIGH_PRICE = BigDecimal.valueOf(100000);
    private static final Logger LOGGER = LoggerFactory.getLogger(MainServlet.class);

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        HwShop hwShop = HwShopFactory.createRandomHWShop(WARES_AMOUNT);
        request.setAttribute("hwShop", hwShop);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/default.jsp");
        requestDispatcher.forward(request, response);
        //     LOGGER.info("Generated random HWShop:\n" + hwShop);
        //     LOGGER.info("Cloned and sorted by price HWShop:\n" + HwShopUtil.SortByPrice(hwShop, Ware.PRICE_COMPARATOR));
        //     LOGGER.info("\n" + HwShopUtil.SelectByPrice(hwShop, LOW_PRICE, HIGH_PRICE));
    }
}
