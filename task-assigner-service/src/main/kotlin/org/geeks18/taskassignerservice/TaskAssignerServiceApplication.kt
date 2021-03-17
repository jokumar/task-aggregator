package org.geeks18.taskassignerservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskAssignerServiceApplication

fun main(args: Array<String>) {
	runApplication<TaskAssignerServiceApplication>(*args)
}
