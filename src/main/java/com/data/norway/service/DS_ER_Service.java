package com.data.norway.service;

import java.util.*;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.DS_ER_DTO;
import com.data.norway.model.DS_ER;
import com.data.norway.model.SSRS_DS;

@Service
public interface DS_ER_Service {
	List<DS_ER_DTO> findByID(String id);
	Optional<DS_ER> findRel(String id);
	List<Map<String, Object>> findRelOptional(String id);
	//List<Set<String>> findRelOptional(String id);
	//ArrayList<String> findRelOptional(String id);
}
