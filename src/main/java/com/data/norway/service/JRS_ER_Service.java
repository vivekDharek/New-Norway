package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.JRS_ER_DTO;

public interface JRS_ER_Service {

	List<JRS_ER_DTO> findById(String id);
	
}
