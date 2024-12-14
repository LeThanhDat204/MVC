package com.store.dao;

import com.store.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
    // Thêm các phương thức tìm kiếm nếu cần
}
