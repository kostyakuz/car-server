package com.kostya.carserver.repositories

import com.kostya.carserver.controllers.SportsCar
import com.kostya.carserver.models.BooksReader
import org.springframework.data.jpa.repository.JpaRepository

interface SportCarStorage: JpaRepository<SportsCar?, Long?>