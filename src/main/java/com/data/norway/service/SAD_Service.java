package com.data.norway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.norway.DTO.SAD_DTO;
import com.data.norway.model.SAD;

@Service
public interface SAD_Service {
	List<SAD_DTO> findByID(String id);
}
