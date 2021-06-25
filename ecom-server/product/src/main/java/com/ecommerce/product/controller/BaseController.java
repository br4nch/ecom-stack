package com.ecommerce.product.controller;

import com.ecommerce.product.dto.BaseDTO;
import com.ecommerce.product.dto.form.BaseFormDTO;
import com.ecommerce.product.dto.query.BaseQueryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface BaseController<D extends BaseQueryDTO, F extends BaseFormDTO> {
    F create(F e);

    F update(F e);

    void delete(Long id);

    Page<D> getAll(PageRequest pr);

    D getOne(Long id);
}
