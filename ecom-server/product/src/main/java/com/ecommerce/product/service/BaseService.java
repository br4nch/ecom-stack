package com.ecommerce.product.service;


import com.ecommerce.product.dto.form.BaseFormDTO;
import com.ecommerce.product.dto.query.BaseQueryDTO;
import com.ecommerce.product.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface BaseService<E extends BaseEntity, Q extends BaseQueryDTO, F extends BaseFormDTO> {
    F create(E e);

    F update(E e);

    void delete(Long id);

    Page<Q> getAll(PageRequest pr);

    Q getOne(Long id);
}
