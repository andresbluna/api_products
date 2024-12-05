package com.api.productos.controller;

import com.api.productos.model.VentaModel;
import com.api.productos.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<VentaModel> getAllVentas() {
        return ventaService.getAllVentas();
    }

    @PostMapping("/crear")
    public VentaModel saveVenta(@RequestBody VentaModel venta) {
        return ventaService.saveVenta(venta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VentaModel> getVentaById(@PathVariable Integer id) {
        return ResponseEntity.ok(ventaService.getVentaById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVenta(@PathVariable Integer id) {
        ventaService.deleteVenta(id);
        return ResponseEntity.ok().build();
    }

}
