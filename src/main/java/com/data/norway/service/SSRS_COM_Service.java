package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_COM_DTO;

public interface SSRS_COM_Service {
	
	List<SSRS_COM_DTO> findById(String id);

}
