package com.healthcare.system.store.services;

import com.healthcare.system.store.model.Category;
import com.healthcare.system.store.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategory(Long id) {
        return categoryRepository.findById(id)
                                 .orElseThrow(() -> new RuntimeException("Category not found: " + id));
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category incoming) {
        Category existing = categoryRepository.findById(id)
                                              .orElseThrow(() -> new RuntimeException("Category not found: " + id));

        existing.setName(incoming.getName());
        existing.setDescription(incoming.getDescription());
        // ... any other updatable fields

        return categoryRepository.save(existing);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    public List<Category> getByName(String name) {
        return categoryRepository.findByName(name);
    }


}