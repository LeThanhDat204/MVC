package com.store.dao;

import com.store.entity.Authority;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityDAO extends JpaRepository<Authority, Integer> {
    // Thêm các phương thức tìm kiếm nếu cần
}
