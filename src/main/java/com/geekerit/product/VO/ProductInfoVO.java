package com.geekerit.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName ProductInfoVO
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/23 15:54
 * @Version 1.0
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private Long productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
