package com.techdenovo.app.billing.Repositry;

import com.techdenovo.app.billing.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositry extends JpaRepository<Customer,Long> {
}
