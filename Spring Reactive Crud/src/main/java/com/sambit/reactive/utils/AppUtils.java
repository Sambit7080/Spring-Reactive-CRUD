package com.sambit.reactive.utils;

import org.springframework.beans.BeanUtils;
import com.sambit.reactive.dto.ProductDto;
import com.sambit.reactive.entity.Product;

public class AppUtils {

    public static ProductDto entityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    public static Product dtoToEntity(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }
}
