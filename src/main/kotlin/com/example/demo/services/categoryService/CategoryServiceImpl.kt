package com.example.demo.services.categoryService

import com.example.demo.dao.dao.categoryDao.CategoryDao
import com.example.demo.dao.model.Category
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.validation.annotation.Validated

@Service
class CategoryServiceImpl: CategoryService {
    @Autowired
    private lateinit var categoryDao: CategoryDao

     override fun getCategories(): List<Category> = categoryDao.fetchAllCategories()

    override fun getCategoryById(categoryId: Long): Category= categoryDao.fetchCategoryById(categoryId)

    override fun addCategory(category: Category) {
       categoryDao.insertCategory(category)
    }

    override fun updateCategory(category: Category) {
        categoryDao.updateCategory(category)
    }

    override fun removeCategory(categoryId: Long) {
        categoryDao.deleteCategory(categoryId)
    }


}
