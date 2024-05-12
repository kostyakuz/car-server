package com.kostya.carserver.repositories

import com.kostya.carserver.models.BooksReader
import org.springframework.data.jpa.repository.JpaRepository

interface BookReadersRepository: JpaRepository<BooksReader?,Long?>