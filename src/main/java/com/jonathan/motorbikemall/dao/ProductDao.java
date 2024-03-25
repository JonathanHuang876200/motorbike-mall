package com.jonathan.motorbikemall.dao;

import com.jonathan.motorbikemall.dto.ProductQueryParams;
import com.jonathan.motorbikemall.dto.ProductRequest;
import com.jonathan.motorbikemall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}


