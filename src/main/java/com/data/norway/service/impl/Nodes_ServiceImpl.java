package com.data.norway.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Values;
import org.springframework.stereotype.Service;

import com.data.norway.service.Nodes_Services;

@Service
public class Nodes_ServiceImpl implements Nodes_Services {
	
	final Driver driver;
	
	public Nodes_ServiceImpl(Driver driver) {
		super();
		this.driver = driver;
	}

	@Override
	public List<Map<String, Object>> getIncommingLinks(String id) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		try (Session session = driver.session()) {

			Result result = session.run("MATCH p=(n{id:$id})<-[*1]-(m) return properties(n), collect(properties(m))",
					Values.parameters("id", id));
			while (result.hasNext()) {
				Record record = result.next();
				System.out.println("Record: " + record);
				Map<String, Object> nodeData = record.asMap();
				resultList.add(nodeData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}

	@Override
	public List<Map<String, Object>> getIncommingGraph(String id) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		try (Session session = driver.session()) {

			Result result = session.run(
					"MATCH path = (n{id:$id})<-[*]-(m) with collect(path) as paths call apoc.convert.toTree(paths) yield value return value",
					Values.parameters("id", id));
			while (result.hasNext()) {
				Record record = result.next();
				System.out.println("Record: " + record);
				Map<String, Object> nodeData = record.asMap();
				resultList.add(nodeData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}

	@Override
	public List<Map<String, Object>> getOutgoingLinks(String id) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		try (Session session = driver.session()) {

			Result result = session.run("MATCH p=(n{id:$id})-[*1]->(m) return properties(n), collect(properties(m))",
					Values.parameters("id", id));
			while (result.hasNext()) {
				Record record = result.next();
				System.out.println("Record: " + record);
				Map<String, Object> nodeData = record.asMap();
				resultList.add(nodeData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}
	
	@Override
	public List<Map<String, Object>> getOutgoingGraph(String id) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		try (Session session = driver.session()) {

			Result result = session.run(
					"MATCH path = (n{id:$id})-[*1]->(m) with collect(path) as paths call apoc.convert.toTree(paths) yield value return value",
					Values.parameters("id", id));
			while (result.hasNext()) {
				Record record = result.next();
				System.out.println("Record: " + record);
				Map<String, Object> nodeData = record.asMap();
				resultList.add(nodeData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}

	@Override
	public List<Map<String, Object>> getNode(String id) {
		List<Map<String, Object>> resultList = new ArrayList<>();
		try (Session session = driver.session()) {

			Result result = session.run(
					"MATCH (n{id:$id}) return properties(n)", Values.parameters("id", id));
			while (result.hasNext()) {
				Record record = result.next();
				System.out.println("Record: " + record);
				Map<String, Object> nodeData = record.asMap();
				resultList.add(nodeData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}

}
