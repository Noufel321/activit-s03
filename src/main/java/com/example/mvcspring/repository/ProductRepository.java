package com.example.mvcspring.repository;

import com.example.mvcspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
