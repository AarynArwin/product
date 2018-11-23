package com.geekerit.product.repository;

import com.geekerit.product.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName ProductInfoRepository
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/23 14:15
 * @Version 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,Long> {
    /**
     * 根据商品状态查询商品列表
     * @param productStatus 商品状态
     * @return              该状态下的商品列表
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
