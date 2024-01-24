package com.example.spring_k8s

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringK8sApplication

fun main(args: Array<String>) {
    runApplication<SpringK8sApplication>(*args)
}
