package com.example.study.blog.controller

import com.example.study.blog.dto.BlogDto
import com.example.study.blog.service.BlogService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BlogController(
    val blogService: BlogService,
) {
    @GetMapping("/api/blog")
    fun search(@RequestBody blogDto: BlogDto): String? {
        return blogService.searchKakao(blogDto)
    }
}