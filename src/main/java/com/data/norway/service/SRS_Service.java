package com.data.norway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.SRS_DTO;
import com.data.norway.model.SRS;

@Service
public interface SRS_Service {
	List<SRS_DTO> findByID(String id);
}
