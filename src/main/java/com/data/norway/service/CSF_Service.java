package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.CSF_DTO;

public interface CSF_Service {
	
	List<CSF_DTO> findById(String id);

}
