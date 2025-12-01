package com.healthcare.system.store.repository;

import com.healthcare.system.store.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // custom queries here
    List<Category> findByName(String name);
}