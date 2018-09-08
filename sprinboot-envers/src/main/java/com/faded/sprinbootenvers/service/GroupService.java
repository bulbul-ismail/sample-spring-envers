package com.faded.sprinbootenvers.service;

import java.util.List;
import java.util.Optional;

import com.faded.sprinbootenvers.entity.SomeGroup;

public interface GroupService {

	public SomeGroup create();
	
	public SomeGroup delete();
	
	public SomeGroup update();
	
	public List<SomeGroup> findAll(Optional<String> groupName);
}
