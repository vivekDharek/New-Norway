package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.SSRS_DNS;

public interface SSRS_DNS_Repository extends Neo4jRepository<SSRS_DNS, String> {

}
