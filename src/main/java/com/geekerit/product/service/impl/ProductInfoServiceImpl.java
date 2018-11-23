package com.geekerit.product.service.impl;

import com.geekerit.product.domain.ProductInfo;
import com.geekerit.product.enums.ProductStatusEnum;
import com.geekerit.product.repository.ProductInfoRepository;
import com.geekerit.product.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductInfoServiceImpl
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/23 15:21
 * @Version 1.0
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {

        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());

    }
}
