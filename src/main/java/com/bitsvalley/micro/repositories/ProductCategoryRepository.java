package com.bitsvalley.micro.repositories;

import com.bitsvalley.micro.domain.ProductCategory;
import com.bitsvalley.micro.domain.ShopProduct;
import com.bitsvalley.micro.domain.WarehouseLocation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Fru Chifen
 * 25.02.2023
 */
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {

    List<ProductCategory> findByOrgId(long orgID);

}
