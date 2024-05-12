package com.kostya.carserver.controllers

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "sportcar")
data class SportsCar constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var imageUrl: String? = null,
    var descriptionUrl: String? = null,

)
