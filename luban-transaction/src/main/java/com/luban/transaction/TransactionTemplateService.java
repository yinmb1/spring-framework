package com.luban.transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

//@Component
public class TransactionTemplateService {

	private TransactionTemplate transactionTemplate;

	private JdbcTemplate jdbcTemplate;

	public TransactionTemplateService(TransactionTemplate transactionTemplate, DataSource dataSource) {
		this.transactionTemplate = transactionTemplate;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void test() {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				jdbcTemplate.execute("insert t1 values(2,2,2,2,2)");
				throw new NullPointerException();
			}
		});
	}
}
