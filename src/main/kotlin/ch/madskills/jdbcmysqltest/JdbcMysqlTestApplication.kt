package ch.madskills.jdbcmysqltest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@EnableScheduling
@SpringBootApplication(scanBasePackages = ["ch.madskills.jdbcmysqltest"])
class JdbcMysqlTestApplication

fun main(args: Array<String>) {
    runApplication<JdbcMysqlTestApplication>(*args)
}
