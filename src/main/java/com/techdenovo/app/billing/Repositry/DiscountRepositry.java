package com.techdenovo.app.billing.Repositry;

import com.techdenovo.app.billing.domain.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepositry extends JpaRepository <Discount,Long> {


}
