package com.geekerit.product.controller;

import com.geekerit.product.VO.ProductInfoVO;
import com.geekerit.product.VO.ProductVO;
import com.geekerit.product.VO.ResultVO;
import com.geekerit.product.domain.ProductCategory;
import com.geekerit.product.domain.ProductInfo;
import com.geekerit.product.service.ProductCategoryService;
import com.geekerit.product.service.ProductInfoService;
import com.geekerit.product.utils.ProductVoUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author Aaryn
 * @Date 2018/11/23 13:51
 * @Version 1.0
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVO<ProductVO> list() {
        /** 1.查询所有的上架商品 */
        List<ProductInfo> upAll = productInfoService.findUpAll();
        /** 2.获取类目type列表 */
        List<Integer> collect = upAll.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());

        /** 3.从数据库查询类目 */
        List<ProductCategory> byCategoryTypeIn = productCategoryService.findByCategoryTypeIn(collect);

        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : byCategoryTypeIn){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : upAll) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);

        }
        return ProductVoUtil.success(productVOList);
    }
}
