package com.ecommerce.product.dto.query;


import com.ecommerce.product.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@SuperBuilder
public class ProductQueryDTO extends BaseQueryDTO {
}
