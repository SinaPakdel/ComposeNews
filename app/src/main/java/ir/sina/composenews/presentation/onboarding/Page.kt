package ir.sina.composenews.presentation.onboarding

import androidx.annotation.DrawableRes
import ir.sina.composenews.R

data class Page(
    val title: String, val description: String, @DrawableRes val image: Int
)

val pages = listOf(
    Page("1", "1", R.drawable.onboarding1),
    Page("2", "2", R.drawable.onboarding2),
    Page("2", "3", R.drawable.onboarding3)
)
