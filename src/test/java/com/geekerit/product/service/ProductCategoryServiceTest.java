package com.geekerit.product.service;

import com.geekerit.product.ProductApplicationTests;
import com.geekerit.product.domain.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProductCategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> byCategoryTypeIn = productCategoryService.findByCategoryTypeIn(Arrays.asList(1, 2));
        for (ProductCategory productCategory : byCategoryTypeIn) {

            System.out.println(
                    "所有的商品类目信息为:" + productCategory.toString()
            );
        }
    }
}