package com.api.productos.repository;

import com.api.productos.model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository<ProductoModel, Long> {
}
