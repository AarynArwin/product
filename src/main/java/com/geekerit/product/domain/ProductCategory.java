package com.geekerit.product.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ClassName ProductCategory
 * @Description 商品类目
 * @Author Aaryn
 * @Date 2018/11/23 15:04
 * @Version 1.0
 */
@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;
    /** 类目名字 */
    private String categoryName;
    /** 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
