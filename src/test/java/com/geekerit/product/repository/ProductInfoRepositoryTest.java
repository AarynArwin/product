package com.geekerit.product.repository;

import com.geekerit.product.ProductApplicationTests;
import com.geekerit.product.domain.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ProductInfoRepositoryTest extends ProductApplicationTests{

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> byProductStatus = productInfoRepository.findByProductStatus(0);
        System.out.println("查询结果--" + byProductStatus.size());
    }
}