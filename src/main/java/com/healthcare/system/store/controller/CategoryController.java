package com.healthcare.system.store.controller;

import com.healthcare.system.store.model.Category;
import com.healthcare.system.store.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    // read all categories/medicines
    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAllCategories();
    }
    // search by id
    @GetMapping("/{id}")
    public Category getItem(@PathVariable Long id) {
        return categoryService.getCategory(id);
    }
    // create a new category/medicine
    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    // update categories
    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(
            @PathVariable Long id,
            @RequestBody Category categoryRequest) {

        Category updated = categoryService.updateCategory(id, categoryRequest);
        return ResponseEntity.ok(updated);
    }
}

