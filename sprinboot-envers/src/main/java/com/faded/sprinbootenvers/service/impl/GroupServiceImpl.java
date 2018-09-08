package com.faded.sprinbootenvers.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faded.sprinbootenvers.entity.SomeGroup;
import com.faded.sprinbootenvers.repository.SomeGroupRepository;
import com.faded.sprinbootenvers.service.GroupService;
import com.faded.sprinbootenvers.spec.GroupSpecification;

@Service
public class GroupServiceImpl implements GroupService{

	@Autowired
	SomeGroupRepository someGroupRepository;

	public void create(SomeGroup group) {

		someGroupRepository.save(group);
	}

	public void delete(Optional<String> groupName) {

		someGroupRepository.delete(this.findAll(groupName).get(0));
	}

	public void update(SomeGroup group) {
		SomeGroup current =  this.findAll(Optional.of(group.getName())).get(0);
		group.setId(current.getId());
		someGroupRepository.save(group);
	}

	public List<SomeGroup> findAll(Optional<String> groupName) {

		return someGroupRepository.findAll(GroupSpecification.matches(groupName));
	}

}
