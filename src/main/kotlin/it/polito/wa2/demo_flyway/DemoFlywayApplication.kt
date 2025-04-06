package it.polito.wa2.demo_flyway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoFlywayApplication

fun main(args: Array<String>) {
    runApplication<DemoFlywayApplication>(*args)
}
