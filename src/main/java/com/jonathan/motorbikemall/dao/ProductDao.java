package com.jonathan.motorbikemall.dao;

import com.jonathan.motorbikemall.dto.ProductRequest;
import com.jonathan.motorbikemall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}


