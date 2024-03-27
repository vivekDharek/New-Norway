package com.data.norway.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import com.data.norway.model.DS_ER;

@Repository
public interface DS_ER_Repository extends Neo4jRepository<DS_ER, String> {
	
	@Query("MATCH p=(n:DS_ER{id:$id})-[*]->(m) return p")
	List<DS_ER> findAllRel(String id);
	
	//@Query("MATCH p=(n:DS_ER{id:$id})-[*]->(m) return p")
	//ArrayList<String> findAllRelOptional(String id);

}
