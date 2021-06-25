package com.ecommerce.product.service;


import com.ecommerce.product.entity.BaseEntity;

import java.util.List;

public interface BaseService<E extends BaseEntity, D extends BaseDTO> {
    D create(E e);

    D update(E e);

    void delete(E e);

    List<D> getAll();

    D getOne(Long id);
}
