package com.data.norway.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.SAD_DTO;

@Service
public interface SAD_Service {
	List<SAD_DTO> findByID(String id);
	List<Map<String, Object>> getIncommingLinks(String id);
}
