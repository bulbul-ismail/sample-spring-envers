package com.faded.sprinbootenvers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.history.Revision;

import com.faded.sprinbootenvers.entity.SomeGroup;

public interface GroupService {

	public void delete(Optional<String> groupName);

	public void save(SomeGroup group);

	public List<SomeGroup> findAll(Optional<String> groupName);
	
	public List<Revision<Integer, SomeGroup>> findRevisions(Optional<String> id); 
}
