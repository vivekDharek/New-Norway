package com.data.norway.service;

import java.util.List;

import com.data.norway.DTO.COM_NET_ER_DTO;

public interface COM_NET_ER_Service {
	
	List<COM_NET_ER_DTO> findById(String id);

}
