package com.totalcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.totalcloud.entity.Product;

public interface ProductAdmRepository extends JpaRepository<Product, Long> {
}
