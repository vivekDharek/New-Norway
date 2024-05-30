package com.data.norway.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.norway.model.Nodes;
/**
*
* @author Vivek Dharek
*/

public interface Nodes_Repository extends Neo4jRepository<Nodes, String> {
	
	/**
	*
	* Neo4jRepository has some default methods that we can use.
	* None has taken in development, custom queries has written.
	*/


}
