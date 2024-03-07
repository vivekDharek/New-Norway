package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import com.data.norway.model.*;

public interface ContractRepository extends Neo4jRepository<CONTRACT, String>{


}
