package com.kostya.carserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarserverApplication

fun main(args: Array<String>) {
	runApplication<CarserverApplication>(*args)
}
