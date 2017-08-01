package com.soft.web.service.login;

import java.util.*;

import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.soft.web.dao.user.*;

@Service
public class TicketService {

	@Autowired
	private TicketMapper mapper;
	
	public List<Map> queryTickets(String ticket_name, Double ticket_price, String state) {
		return mapper.queryTickets(ticket_name, ticket_price, state);
	}
	
	public void save(String ticket_name, double ticket_price, String filepath) {
		mapper.save(ticket_name, ticket_price, filepath);
	}

	public void edit(int ticket_id) {
		mapper.edit(ticket_id);
	}
}