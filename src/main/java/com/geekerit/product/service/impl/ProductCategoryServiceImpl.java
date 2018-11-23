package com.geekerit.product.service.impl;

import com.geekerit.product.domain.ProductCategory;
import com.geekerit.product.repository.ProductCategoryRepository;
import com.geekerit.product.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductCategoryServiceImpl
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/23 15:35
 * @Version 1.0
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
