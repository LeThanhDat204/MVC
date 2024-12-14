package com.store.dao;

import com.store.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends JpaRepository<Role, String> {
    // Thêm các phương thức tìm kiếm nếu cần
}
