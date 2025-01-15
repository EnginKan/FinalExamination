package com.yeditepe.finalexamination.model

data class Recipe(
    val id: Int, // Unique identifier for the recipe
    val title: String, // Title of the recipe
    val description: String, // Detailed description of the recipe
    val imageResId: Int // Resource ID for the recipe image
)