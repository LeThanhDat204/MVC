package com.store.service.ipml;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.store.entity.Product;
import com.store.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> findAll() {
        // Logic xử lý, trả về danh sách sản phẩm
        return new ArrayList<>(); // Tạm thời trả về danh sách rỗng
    }
}
