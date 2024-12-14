package com.store.dao;

import com.store.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDAO extends JpaRepository<Category, String> {
    // Thêm các phương thức tìm kiếm nếu cần
}
