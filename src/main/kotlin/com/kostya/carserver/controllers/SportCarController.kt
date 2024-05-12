package com.kostya.carserver.controllers

import com.kostya.carserver.repositories.SportCarStorage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SportCarController @Autowired constructor(
    private  val sportCarStorage: SportCarStorage
){

    @GetMapping("/SportCar")
    fun getAllSportsCar(): List<SportsCar?> {
        return sportCarStorage.findAll()
    }
}