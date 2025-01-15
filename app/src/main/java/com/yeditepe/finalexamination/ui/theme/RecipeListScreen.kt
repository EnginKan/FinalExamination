package com.yeditepe.finalexamination.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.yeditepe.finalexamination.viewmodel.RecipeViewModel

@Composable
fun RecipeListScreen(navController: NavController, viewModel: RecipeViewModel) {
    val recipes by viewModel.recipes.observeAsState(emptyList())

    LazyColumn {
        items(recipes) { recipe ->
            // TODO: Display recipe title and image
            // TODO: Use navController.navigate("detail/${recipe.id}") for navigation
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecipeListScreen() {
    // TODO: Provide a mock ViewModel and mock NavController
}

@Preview(showBackground = true)
@Composable
fun PreviewRecipeDetailScreen() {
    // TODO: Provide a mock recipe and call RecipeDetailScreen
}
