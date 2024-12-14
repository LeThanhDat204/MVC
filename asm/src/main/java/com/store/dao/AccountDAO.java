package com.store.dao;

import com.store.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO extends JpaRepository<Account, String> {
    // Thêm các phương thức tìm kiếm nếu cần
}
