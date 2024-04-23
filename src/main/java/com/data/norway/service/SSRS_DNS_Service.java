package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_DNS_DTO;

public interface SSRS_DNS_Service {
	
	List<SSRS_DNS_DTO> findById(String id); 

}
