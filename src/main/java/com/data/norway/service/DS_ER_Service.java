package com.data.norway.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.DS_ER_DTO;
import com.data.norway.model.DS_ER;
import com.data.norway.model.SSRS_DS;

@Service
public interface DS_ER_Service {
	List<DS_ER_DTO> findByID(String id);
	Optional<DS_ER> findRel(String id);
}
