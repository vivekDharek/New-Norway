package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.SSRS_KMS_DTO;

public interface SSRS_KMS_Service {
	
	List<SSRS_KMS_DTO> findById(String id);

}
