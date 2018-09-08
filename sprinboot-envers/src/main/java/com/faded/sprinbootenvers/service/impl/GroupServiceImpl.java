package com.faded.sprinbootenvers.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.faded.sprinbootenvers.entity.SomeGroup;
import com.faded.sprinbootenvers.repository.SomeGroupRepository;
import com.faded.sprinbootenvers.service.GroupService;
import com.faded.sprinbootenvers.spec.GroupSpecification;

public class GroupServiceImpl implements GroupService{

	
	@Autowired
	SomeGroupRepository someGroupRepository;
	
	@Override
	public SomeGroup create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SomeGroup delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SomeGroup update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SomeGroup> findAll(Optional<String> groupName) {
		
		return someGroupRepository.findAll(GroupSpecification.matches(groupName));
	}

}
