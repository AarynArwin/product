package com.geekerit.product.utils;

import com.geekerit.product.VO.ProductVO;
import com.geekerit.product.VO.ResultVO;

/**
 * @ClassName ProductVoUtil
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/23 16:19
 * @Version 1.0
 */
public class ProductVoUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
