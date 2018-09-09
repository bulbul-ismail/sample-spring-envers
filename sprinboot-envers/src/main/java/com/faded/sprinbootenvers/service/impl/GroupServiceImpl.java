package com.faded.sprinbootenvers.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;
import org.springframework.stereotype.Service;

import com.faded.sprinbootenvers.entity.SomeGroup;
import com.faded.sprinbootenvers.repository.SomeGroupRepository;
import com.faded.sprinbootenvers.service.GroupService;
import com.faded.sprinbootenvers.spec.GroupSpecification;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	SomeGroupRepository someGroupRepository;

	public void save(SomeGroup group) {

		someGroupRepository.save(group);
	}

	public void delete(Optional<String> groupName) {

		someGroupRepository.delete(this.findAll(groupName).get(0));
	}

	public List<SomeGroup> findAll(Optional<String> groupName) {

		return someGroupRepository.findAll(GroupSpecification.matches(groupName));
	}

	public List<Revision<Integer, SomeGroup>> findRevisions(Optional<String> id) {

		Revisions<Integer, SomeGroup> revisions = someGroupRepository.findRevisions(id.get());
		Iterator<Revision<Integer, SomeGroup>> iterator = revisions.iterator();
		List<Revision<Integer, SomeGroup>> list = new ArrayList<>();
		iterator.forEachRemaining(list::add);
		
		return list;
	}

}
