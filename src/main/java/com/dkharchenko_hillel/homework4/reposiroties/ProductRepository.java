package com.dkharchenko_hillel.homework4.reposiroties;

import com.dkharchenko_hillel.homework4.models.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    @Modifying
    @Query("update Product set name = ?2 where id = ?1")
    Integer updateProductNameById(Long id, String name);
    @Modifying
    @Query("update Product set price = ?2 where id = ?1")
    Integer updateProductSumById(Long id, Double price);
}
