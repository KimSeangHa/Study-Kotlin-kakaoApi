package com.example.study.blog.repository

import com.example.study.blog.entity.Wordcount
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

//interface WordRepository : CrudRepository<Wordcount, String> {
interface WordRepository : JpaRepository<Wordcount, String> {
    fun findTop100ByOrderByCntDesc(): List<Wordcount>
}