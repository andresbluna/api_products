package com.api.productos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "Producto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(nullable = false)
        @NotBlank(message = "El nombre del producto es requerido")
        private String nombre;

        @Column(nullable = false)
        @NotNull
        private BigDecimal valor;

        @Column(nullable = false)
        @NotNull
        @PositiveOrZero(message = "La cantidad debe ser mayor o igual a cero")
        private int cantidad;



    }

