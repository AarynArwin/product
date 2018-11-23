package com.geekerit.product.enums;

import lombok.Getter;

/**
 * 商品状态枚举
 */
@Getter
public enum ProductStatusEnum {
    /**
     * 商品上架状态
     */
    UP(0,"上架"),
    /**
     * 商品下架状态
     */
    DOWN(1,"下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
