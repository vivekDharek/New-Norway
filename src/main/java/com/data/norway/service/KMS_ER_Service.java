package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.KMS_ER_DTO;

public interface KMS_ER_Service {
	List<KMS_ER_DTO> findById(String id);

}
