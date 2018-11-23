package com.geekerit.product.VO;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description 请求的外层响应对象
 * @Author Aaryn
 * @Date 2018/11/23 15:39
 * @Version 1.0
 */
@Data
public class ResultVO<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

}
