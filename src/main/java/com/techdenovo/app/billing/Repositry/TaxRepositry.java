package com.techdenovo.app.billing.Repositry;

import com.techdenovo.app.billing.domain.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRepositry  extends JpaRepository<Tax,Long> {
}
