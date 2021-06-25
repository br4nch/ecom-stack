package com.ecommerce.product.service.product.impl;

import com.ecommerce.product.dto.form.ProductFormDTO;
import com.ecommerce.product.dto.query.ProductQueryDTO;
import com.ecommerce.product.entity.Product;
import com.ecommerce.product.repository.ProductRepository;
import com.ecommerce.product.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductFormDTO create(Product product) {
        return null;
    }

    @Override
    public ProductFormDTO update(Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<ProductQueryDTO> getAll(PageRequest pr) {
        Page<Product> products = productRepository.findAll(pr);
        return products.map(product -> new ProductQueryDTO());
    }

    @Override
    public ProductQueryDTO getOne(Long id) {
        return null;
    }
}
