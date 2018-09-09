package com.faded.sprinbootenvers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.history.RevisionRepository;

import com.faded.sprinbootenvers.entity.SomeGroup;

public interface SomeGroupRepository extends RevisionRepository<SomeGroup, String, Integer>,
		JpaRepository<SomeGroup, String>, JpaSpecificationExecutor<SomeGroup> {

}
