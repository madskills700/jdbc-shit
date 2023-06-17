package ch.madskills.jdbcmysqltest.repository

import org.springframework.jdbc.core.ResultSetExtractor
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class JdbcDbBenchmarkRepository(
    private val template: NamedParameterJdbcTemplate
): DbBenchmarkRepository {

    override fun select(value: Long) {
        template.query(
            "select :value;",
            MapSqlParameterSource()
                .addValue("value", value),
            ResultSetExtractor { _ ->

            }
        )
    }

}