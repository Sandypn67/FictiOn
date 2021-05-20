package com.example.fiction.template.list

sealed class BookModel
//maitrise l'héritage

data class BookSuccess(val bookList : List<Book>) : BookModel()
object BookLoader : BookModel()
object BookError : BookModel()