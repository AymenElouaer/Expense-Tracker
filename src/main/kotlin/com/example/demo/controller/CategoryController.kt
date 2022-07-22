package com.example.demo.controller

import com.example.demo.dao.model.Category
import com.example.demo.services.categoryService.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class CategoryController {
    @Autowired
    private lateinit var categoryService: CategoryService

    @GetMapping("/categories")
    fun getAllCategories(): List<Category> {
        return categoryService.getCategories()
        // select * from category
    }

    @GetMapping("/category/{id}")
    fun getCategory(@PathVariable id: Long): Category {
        return categoryService.getCategoryById(id)
    }

    @PostMapping("/categories")
    fun newCategory(@RequestBody category: Category){
       categoryService.addCategory(category)
    }
    @PutMapping("/update")
    fun update(@RequestBody category: Category) {
        categoryService.updateCategory(category)
    }
    @DeleteMapping("/category/{id}")
    fun delete(@PathVariable id : Long) {
        categoryService.removeCategory(id)
    }

}