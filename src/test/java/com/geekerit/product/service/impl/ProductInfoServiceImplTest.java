package com.geekerit.product.service.impl;

import com.geekerit.product.ProductApplicationTests;
import com.geekerit.product.domain.ProductInfo;
import com.geekerit.product.service.ProductInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ProductInfoServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = productInfoService.findUpAll();
        for (ProductInfo productInfo : upAll) {
            System.out.println("上架的商品信息为:" + productInfo.toString());
        }
    }
}