package com.api.productos.controller;
import com.api.productos.model.ProductoModel;
import com.api.productos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<ProductoModel> getAllProductos() {
        return productoService.getAllProductos();
    }

    @PostMapping("/crear")
    public ProductoModel saveProducto(@RequestBody ProductoModel producto) {
        return productoService.saveProducto(producto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoModel> getProductoById(@PathVariable Long id) {
        return productoService.getProductoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
        return ResponseEntity.ok().build();
    }
}
