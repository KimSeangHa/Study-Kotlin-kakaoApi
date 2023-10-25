package com.example.study.blog.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Wordcount(
    @Id
    val word: String,
    var cnt: Int = 0,
) {
}