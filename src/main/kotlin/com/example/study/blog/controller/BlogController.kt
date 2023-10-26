package com.example.study.blog.controller

import com.example.study.blog.dto.BlogDto
import com.example.study.blog.entity.Wordcount
import com.example.study.blog.service.BlogService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BlogController(
    val blogService: BlogService,
) {
    @GetMapping("/api/blog")
    fun search(@RequestBody @Valid blogDto: BlogDto): String? {
        return blogService.searchKakao(blogDto)
    }

    @GetMapping("/api/blog/rank")
    fun searchWordRank(): List<Wordcount> = blogService.searchWordRank()
}