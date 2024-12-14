package com.store.dao;

import com.store.entity.OrderDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {
    // Thêm các phương thức tìm kiếm nếu cần
}
