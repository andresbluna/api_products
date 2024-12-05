package com.api.productos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;

@Entity
@Table(name = "producto")
@Getter
@Setter
public class ProductoModel {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String nombre;

        @Column
        private String descripcion;

        @Column
        private Double precio;

        @Column
        private Integer stock;


    }

