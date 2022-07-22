package com.example.demo.dao.dao.categoryDao
import com.example.demo.dao.model.Category

interface CategoryDao{
    fun fetchAllCategories(): List<Category>
    fun fetchCategoryById(categoryId: Long) :Category
    fun insertCategory(category: Category)
    fun updateCategory(category: Category)
    fun deleteCategory(categoryId: Long)
}
