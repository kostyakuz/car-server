package com.kostya.carserver.controllers

import com.kostya.carserver.models.BooksReader
import com.kostya.carserver.repositories.BookReadersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookReadersController @Autowired constructor(
    private val repository: BookReadersRepository
) {

    @GetMapping("/readers")
    fun getALLReaders(): List<BooksReader?>{
        return repository.findAll()
    }

    @PostMapping("/readers/add")
    fun addNewReaders(){
        val newReader = BooksReader(name = "Petya", phone = "1234")
        repository.save(newReader)
    }
}