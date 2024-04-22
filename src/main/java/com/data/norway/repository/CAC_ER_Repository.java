package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.CAC_ER;

public interface CAC_ER_Repository extends Neo4jRepository<CAC_ER, String> {
}
