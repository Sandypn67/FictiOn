package com.example.fiction.template.api

import com.example.fiction.template.list.Book

data class BookListResp(
    val count :Int,
    val next: String,
    val results : List<Book>
)