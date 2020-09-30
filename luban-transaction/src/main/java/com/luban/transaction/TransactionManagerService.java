package com.luban.transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

//@Component
public class TransactionManagerService {

	private PlatformTransactionManager transactionManager;

	private JdbcTemplate jdbcTemplate;

	public TransactionManagerService(PlatformTransactionManager transactionManager, DataSource dataSource) {
		this.transactionManager = transactionManager;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void test() {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setName("lubanTx");

		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			jdbcTemplate.execute("insert t1 values(2,2,2,2,2)");
//			if (1 == 1) {
//				throw new NullPointerException();
//			}
		} catch (Exception ex) {
			transactionManager.rollback(status);
			throw ex;
		}
		transactionManager.commit(status);
	}
}
