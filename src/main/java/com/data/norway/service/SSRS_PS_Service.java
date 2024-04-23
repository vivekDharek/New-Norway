package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_PS_DTO;

public interface SSRS_PS_Service {
	
	List<SSRS_PS_DTO> findById(String id);

}
