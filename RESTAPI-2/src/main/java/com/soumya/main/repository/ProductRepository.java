package com.soumya.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.main.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
