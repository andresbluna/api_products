package com.api.productos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "venta")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombrep", nullable = false)
    @NotBlank(message = "El nombre del producto es requerido")
    private String nombrep;

    @Column(nullable = false)
    @NotNull(message = "El neto es requerido")
    private Integer neto;

    @Column(nullable = false)
    @NotNull(message = "La cantidad es requerida")
    @Min(value = 0, message = "La cantidad debe ser mayor o igual a cero")
    private Integer cantidad;

    @Column(nullable = false)
    @NotNull(message = "El IVA es requerido")
    private Integer iva;

    @Column(nullable = false)
    @NotNull(message = "El total es requerido")
    private Integer total;

    @Column(name = "Fecha", nullable = false)
    @NotNull(message = "La fecha es requerida")
    private LocalDate fecha;

    @Column(name = "pdf_json", nullable = false)
    @NotBlank(message = "El PDF JSON es requerido")
    private String pdfJson;

    @Column(name = "codigo_user", nullable = false)
    @NotNull(message = "El código de usuario es requerido")
    private Integer codigoUser;
}
