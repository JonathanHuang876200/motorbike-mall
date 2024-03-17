package com.jonathan.motorbikemall.service;

import com.jonathan.motorbikemall.dto.ProductRequest;
import com.jonathan.motorbikemall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
