package com.luban.transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

@Component
public class TransactionAnnotationService {
	private JdbcTemplate jdbcTemplate;

	public TransactionAnnotationService(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Transactional
	public void test() {
		jdbcTemplate.execute("insert t1 values(2,2,2,2,2)");
	}
}
