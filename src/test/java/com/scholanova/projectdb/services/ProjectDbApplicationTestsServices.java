package com.scholanova.projectdb.services;

import com.scholanova.projectdb.models.Message;
import com.scholanova.projectdb.repositories.MessageRepository;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.test.web.servlet.MockMvc;


@SpringJUnitConfig(MessageService.class)
@JdbcTest
public class ProjectDbApplicationTestsServices {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private MessageRepository messageRepository;
	
	
	
	
}
