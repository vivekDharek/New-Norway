package com.data.norway.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import com.data.norway.DTO.DS_ER_DTO;
import com.data.norway.model.DS_ER;
import com.data.norway.model.SSRS_DS;

public interface DS_ER_Repository extends Neo4jRepository<DS_ER, String> {
	
	@Query("MATCH p=(n:DS_ER{id:$id})-[*]->(m) return p")
	List<DS_ER> findAllRel(String id);

}
