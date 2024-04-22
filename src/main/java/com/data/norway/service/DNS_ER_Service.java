package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.DNS_ER_DTO;

public interface DNS_ER_Service {

	List<DNS_ER_DTO> findById(String id);
	
}
