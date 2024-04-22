package com.data.norway.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.neo4j.driver.Driver;
import org.springframework.stereotype.Service;

import com.data.norway.DTO.KMS_ER_DTO;
import com.data.norway.model.KMS_ER;
import com.data.norway.repository.KMS_ER_Repository;
import com.data.norway.service.KMS_ER_Service;

@Service
public class KMS_ER_ServiceImpl implements KMS_ER_Service {

	final Driver driver;
	private KMS_ER_Repository kms_er_repository;
	
	public KMS_ER_ServiceImpl(Driver driver, KMS_ER_Repository kms_er_repository) {
		super();
		this.driver = driver;
		this.kms_er_repository = kms_er_repository;
	}

	@Override
	public List<KMS_ER_DTO> findById(String id) {
		Optional<KMS_ER> kms_ers = kms_er_repository.findById(id);
		return kms_ers.stream().map(
				(kms_er) -> mapToDto(kms_er)).collect(Collectors.toList());
	}
	
	private KMS_ER_DTO mapToDto(KMS_ER kms_er) {
		KMS_ER_DTO kms_er_dto = KMS_ER_DTO.builder()
				.id(kms_er.getId())
				.req_type(kms_er.getReq_type())
				.obj_text(kms_er.getObj_text())
				.val_statement(kms_er.getVal_statement())
				.val_evidence(kms_er.getVal_evidence())
				.val_proof_measure(kms_er.getVal_proof_measure())
				.val_result(kms_er.getVal_result())
				.ac_condition(kms_er.getAc_condition())
				.validates(kms_er.getValidates()).build();
		return kms_er_dto;
	}

}
