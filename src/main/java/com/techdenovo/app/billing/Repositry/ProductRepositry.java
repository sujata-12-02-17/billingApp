package com.techdenovo.app.billing.Repositry;

import com.techdenovo.app.billing.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositry extends JpaRepository<Product,Long> {
}
