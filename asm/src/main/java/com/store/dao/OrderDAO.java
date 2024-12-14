package com.store.dao;

import com.store.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDAO extends JpaRepository<Order, Long> {
    // Thêm các phương thức tìm kiếm nếu cần
}
