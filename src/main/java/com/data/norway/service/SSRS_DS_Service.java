package com.data.norway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.SSRS_DS_DTO;

@Service
public interface SSRS_DS_Service {
	List<SSRS_DS_DTO> findByID(String id);
}
