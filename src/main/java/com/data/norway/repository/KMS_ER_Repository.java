package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.KMS_ER;

public interface KMS_ER_Repository extends Neo4jRepository<KMS_ER, String> {

}
