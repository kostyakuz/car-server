package com.kostya.carserver.controllers

import com.kostya.carserver.models.InitialPageData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CommonController {

    @GetMapping("/")
    fun getInitialPageData(): InitialPageData {
       return InitialPageData()
    }
}
