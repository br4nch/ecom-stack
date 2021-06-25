package com.ecommerce.product.controller;

import com.ecommerce.product.constants.APIMappingConstant;
import com.ecommerce.product.dto.form.ProductFormDTO;
import com.ecommerce.product.dto.query.ProductQueryDTO;
import com.ecommerce.product.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(APIMappingConstant.PRODUCT)
public class ProductController implements BaseController<ProductQueryDTO, ProductFormDTO> {

    @Autowired
    private ProductService productService;

    @PostMapping
    @Override
    public ProductFormDTO create(ProductFormDTO e) {
        return null;
    }

    @PutMapping
    @Override
    public ProductFormDTO update(ProductFormDTO e) {
        return null;
    }

    @DeleteMapping
    @Override
    public void delete(Long id) {

    }

    @GetMapping
    @Override
    public Page<ProductQueryDTO> getAll(@PageableDefault PageRequest pr) {
        return productService.getAll(pr);
    }

    @GetMapping("/{id}")
    @Override
    public ProductQueryDTO getOne(@PathVariable Long id) {
        return null;
    }
}
