package com.geekerit.product.repository;

import com.geekerit.product.ProductApplicationTests;
import com.geekerit.product.domain.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProductCategoryRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(1, 2));
        for (ProductCategory productCategory : byCategoryTypeIn) {
            System.out.println("类目信息为" + productCategory.toString());
        }
    }
}