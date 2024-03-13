package com.example.jetpackbasics

data class MyScreenState(
    val text: String = "",
    val namesList: MutableList<String> = mutableListOf()
)
