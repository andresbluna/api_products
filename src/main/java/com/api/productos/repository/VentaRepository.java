package com.api.productos.repository;

import com.api.productos.model.VentaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<VentaModel, Integer> {
}
