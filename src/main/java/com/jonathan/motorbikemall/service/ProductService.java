package com.jonathan.motorbikemall.service;

import com.jonathan.motorbikemall.dto.ProductRequest;
import com.jonathan.motorbikemall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
