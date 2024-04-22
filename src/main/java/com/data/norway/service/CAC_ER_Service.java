package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.CAC_ER_DTO;

public interface CAC_ER_Service  {
	
	List<CAC_ER_DTO> findById(String id);

}
