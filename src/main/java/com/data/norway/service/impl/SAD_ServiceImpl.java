package com.data.norway.service.impl;

import java.util.*;
import java.util.stream.Collectors;

import org.neo4j.driver.*;
import org.springframework.stereotype.Service;
import org.neo4j.driver.Record;

import com.data.norway.DTO.SAD_DTO;
import com.data.norway.model.SAD;
import com.data.norway.repository.SAD_Repository;
import com.data.norway.service.SAD_Service;

@Service
public class SAD_ServiceImpl implements SAD_Service {

	
	final Driver driver;
	private SAD_Repository sad_repository;
	
	public SAD_ServiceImpl(Driver driver, SAD_Repository sad_repository) {
		super();
		this.driver = driver;
		this.sad_repository = sad_repository;
	}

	@Override
	public List<SAD_DTO> findByID(String id) {
		Optional<SAD> sads = sad_repository.findById(id);
		return sads.stream().map((sad) -> mapToDto(sad)).collect(Collectors.toList());
	}
	
	private SAD_DTO mapToDto(SAD sad) {
		SAD_DTO sad_dto = SAD_DTO.builder()
				.id(sad.getId())
				.req_type(sad.getReq_type())
				.stage(sad.getStage())
				.obj_text(sad.getObj_text())
				.req_forwarding(sad.getReq_forwarding())
				.realizes(sad.getRealizes())
				.req_origin(sad.getReq_origin())
				.build();
		return sad_dto;
	}

	@Override
	public List<Map<String, Object>> getIncommingLinks(String id) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		try (Session session = driver.session()) {
			
			Result result = 
					session.run("MATCH p=(n:SAD{id:$id})<-[*]-(m) return properties(n), collect(properties(m))", Values.parameters("id", id));
			while(result.hasNext()) {
				Record record = result.next();
				System.out.println("Record: "+record);
				Map<String, Object> nodeData = record.asMap();
				resultList.add(nodeData);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}
}
