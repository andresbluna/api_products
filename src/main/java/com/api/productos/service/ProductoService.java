package com.api.productos.service;

import com.api.productos.model.ProductoModel;
import com.api.productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<ProductoModel> getAllProductos() {
        return productoRepository.findAll();
    }

    public ProductoModel saveProducto(ProductoModel producto) {
        return productoRepository.save(producto);
    }

    public Optional<ProductoModel> getProductoById(Long id) {
        return productoRepository.findById(id);
    }

    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
