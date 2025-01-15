package com.yeditepe.finalexamination.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexamination.model.Recipe

class RecipeViewModel : ViewModel() {
    private val _recipes = MutableLiveData<List<Recipe>>()
    val recipes: LiveData<List<Recipe>> get() = _recipes

    private val _selectedRecipe = MutableLiveData<Recipe?>()
    val selectedRecipe: LiveData<Recipe?> get() = _selectedRecipe

    init {
        // TODO: Initialize _recipes with a list of sample data
    }

    fun selectRecipe(recipe: Recipe) {
        // TODO: Update _selectedRecipe with the selected recipe
    }

    fun getRecipeById(id:Int){
        // TODO: Complete the method such that it will return selected Recipe if exist otherwise null


    }
}
