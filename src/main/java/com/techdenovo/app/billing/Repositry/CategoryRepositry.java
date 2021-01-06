package com.techdenovo.app.billing.Repositry;

import com.techdenovo.app.billing.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositry extends JpaRepository<Category ,Long> {

}
