package com.geekerit.product.service;

import com.geekerit.product.domain.ProductCategory;

import java.util.List;

/**
 * @ClassName ProductCategoryService
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/23 15:33
 * @Version 1.0
 */
public interface ProductCategoryService {
    /**
     * 查询所有的商品类目
     * @param categoryTypeList  商品类目编码集合
     * @return                  所有商品类目列表
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
