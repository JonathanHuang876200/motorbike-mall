package com.jonathan.motorbikemall.service.impl;

import com.jonathan.motorbikemall.dao.ProductDao;
import com.jonathan.motorbikemall.model.Product;
import com.jonathan.motorbikemall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
