package com.example.ktlintlint

sealed class Food {
    class Pizza(val slices: Int): Food()
    class Sushi(val pieces: Int): Food()
}