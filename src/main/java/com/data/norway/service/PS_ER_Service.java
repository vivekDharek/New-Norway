package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.PS_ER_DTO;

public interface PS_ER_Service {

	List<PS_ER_DTO> findById(String id);
	
}
