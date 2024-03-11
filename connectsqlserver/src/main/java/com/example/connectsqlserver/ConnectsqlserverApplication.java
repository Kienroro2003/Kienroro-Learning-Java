package com.example.connectsqlserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class ConnectsqlserverApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ConnectsqlserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM NHANVIEN";
		List<NHANVIEN> customers = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(NHANVIEN.class));

		customers.forEach(System.out :: println);
	}
}
