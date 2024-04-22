package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.DNS_ER;

public interface DNS_ER_Repository extends Neo4jRepository<DNS_ER, String> {

}
