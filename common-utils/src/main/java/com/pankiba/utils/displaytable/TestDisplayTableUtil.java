package com.pankiba.utils.displaytable;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class TestDisplayTableUtil {

	public static void main(String[] args) {

		EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
		DataSource dataSource = embeddedDatabaseBuilder.setType(EmbeddedDatabaseType.H2).addScript("db/schema.sql")
				.addScript("db/data.sql").build();

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		DisplayTableUtil.printTable(jdbcTemplate, "EMPLOYEE");


	}
}
