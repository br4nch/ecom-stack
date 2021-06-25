package com.ecommerce.product.service.product;

import com.ecommerce.product.dto.form.ProductFormDTO;
import com.ecommerce.product.dto.query.ProductQueryDTO;
import com.ecommerce.product.entity.Product;
import com.ecommerce.product.service.BaseService;

public interface ProductService extends BaseService<Product, ProductQueryDTO, ProductFormDTO> {
}
