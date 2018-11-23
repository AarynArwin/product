package com.geekerit.product.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ProductInfo
 * @Description 商品表
 * @Author Aaryn
 * @Date 2018/11/23 14:00
 * @Version 1.0
 */
@Data
@Entity
@Table(name = "product_info")
public class ProductInfo {
    /**
     * 商品主键
     */
    @Id
    private Long productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品价格
     */
    private BigDecimal productPrice;
    /**
     * 商品库存
     */
    private Integer productStock;
    /**
     * 商品描述
     */
    private String productDescription;
    /**
     * 商品图片
     */
    private String productIcon;
    /**
     * 商品状态
     */
    private Integer productStatus;
    /**
     * 商品分类
     */
    private Integer categoryType;
    /**
     * 商品创建时间
     */
    private Date createTime;
    /**
     * 商品修改时间
     */
    private Date updateTime;
}
