package ru.mityushkin.consultationbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConsultationBackendApplication

fun main(args: Array<String>) {
	runApplication<ConsultationBackendApplication>(*args)
}
