package com.faded.sprinbootenvers.service;

import java.util.List;
import java.util.Optional;

import com.faded.sprinbootenvers.entity.SomeGroup;

public interface GroupService {

	public void create(SomeGroup group);
	
	public void delete(Optional<String> groupName);
	
	public void update(SomeGroup group);
	
	public List<SomeGroup> findAll(Optional<String> groupName);
}
