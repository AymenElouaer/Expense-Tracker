package com.example.demo.dao.dao.categoryDao

import com.example.demo.dao.model.Category
import com.example.demo.dao.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryDaoImpl : CategoryDao {
    @Autowired
    private lateinit var categoryRepository: CategoryRepository

    override fun fetchAllCategories(): List<Category> = categoryRepository.findAll()

    override fun fetchCategoryById(categoryId: Long):Category {
        return categoryRepository.findById(categoryId).orElse(null)

        }

    override fun insertCategory(category: Category) {
       categoryRepository.save(category)
    }

    override fun updateCategory(category: Category) {
        categoryRepository.save(category)
    }

    override fun deleteCategory(categoryId: Long) {
        categoryRepository.deleteById(categoryId)
    }

}

