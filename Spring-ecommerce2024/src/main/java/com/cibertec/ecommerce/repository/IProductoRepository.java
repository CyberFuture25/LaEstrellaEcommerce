package com.cibertec.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.ecommerce.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
