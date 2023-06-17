package ch.madskills.jdbcmysqltest.controller

import ch.madskills.jdbcmysqltest.service.DbBenchmarkService
import org.springframework.web.bind.annotation.RestController

@RestController
class DbBenchmarkControllerImpl(
    private val service: DbBenchmarkService
): DbBenchmarkController {

    override fun select(value: Long) {
        service.select(value)
    }

}