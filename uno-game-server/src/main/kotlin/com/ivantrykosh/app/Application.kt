package com.ivantrykosh.app

import com.ivantrykosh.app.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureSockets()
    configureSecurity()
    configureMonitoring()
    configureRouting()
}
