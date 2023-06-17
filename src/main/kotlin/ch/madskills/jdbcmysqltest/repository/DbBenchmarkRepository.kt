package ch.madskills.jdbcmysqltest.repository

interface DbBenchmarkRepository {

    fun select(value: Long)
}