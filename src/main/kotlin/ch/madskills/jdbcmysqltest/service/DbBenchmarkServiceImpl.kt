package ch.madskills.jdbcmysqltest.service

import ch.madskills.jdbcmysqltest.repository.DbBenchmarkRepository
import org.springframework.stereotype.Service

@Service
class DbBenchmarkServiceImpl(
    private val repository: DbBenchmarkRepository
): DbBenchmarkService {

    override fun select(value: Long) {
        repository.select(value)
    }

}