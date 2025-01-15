package com.yeditepe.finalexamination.ui.theme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.yeditepe.finalexamination.viewmodel.RecipeViewModel

@Composable
fun RecipeDetailScreen(recipeId: Int, viewModel: RecipeViewModel) {
    val selectedRecipe = viewModel.getRecipeById(recipeId)

    selectedRecipe?.let { recipe ->
        // TODO: Display recipe title, image, and description
    } ?: run {
        Text("Recipe not found")
    }
}