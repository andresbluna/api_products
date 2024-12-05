package com.api.productos.service;

import com.api.productos.model.VentaModel;
import com.api.productos.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public List<VentaModel> getAllVentas() {
        return ventaRepository.findAll();
    }

    public VentaModel saveVenta(VentaModel venta) {
        return ventaRepository.save(venta);
    }

    public VentaModel getVentaById(Integer id) {
        return ventaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Venta no encontrada"));
    }

    public void deleteVenta(Integer id) {
        ventaRepository.deleteById(id);
    }
}
