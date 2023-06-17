package ch.madskills.jdbcmysqltest.controller

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus

interface DbBenchmarkController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{value}",produces = [MediaType.APPLICATION_JSON_VALUE])
    fun select(@PathVariable("value") value: Long)

}