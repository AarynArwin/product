package com.geekerit.product.service;

import com.geekerit.product.domain.ProductInfo;

import java.util.List;

public interface ProductInfoService {
    /**
     * 查询上架商品
     * @param productStatus 上架状态
     * @return              上架状态的商品列表
     */
    List<ProductInfo> findUpAll();
}
