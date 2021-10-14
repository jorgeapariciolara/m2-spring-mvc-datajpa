package com.example.m2springmvcdatajpa.repository;

import com.example.m2springmvcdatajpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {}
