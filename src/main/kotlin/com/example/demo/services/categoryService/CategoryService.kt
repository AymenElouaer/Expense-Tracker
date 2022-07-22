package com.example.demo.services.categoryService

import com.example.demo.dao.model.Category

interface CategoryService{
    fun getCategories(): List<Category>
    fun getCategoryById(categoryId: Long) : Category
    fun addCategory(category: Category)
    fun updateCategory(category: Category)
    fun removeCategory(categoryId: Long)
}