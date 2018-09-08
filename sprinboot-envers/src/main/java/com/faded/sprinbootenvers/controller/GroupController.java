package com.faded.sprinbootenvers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.faded.sprinbootenvers.entity.SomeGroup;
import com.faded.sprinbootenvers.service.GroupService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class GroupController {

	@Autowired
	private GroupService groupService;

	@GetMapping(value = "/getGroups")
	@ApiOperation("Returns Currency data with given CODE parameter.")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "group_name", value = "Group name", required = false, dataType = "string", paramType = "query"), })
	public List<SomeGroup> queryGroups(@RequestParam(value = "groupName", required = false) Optional<String> groupName) {

		return groupService.findAll(groupName);
	}
}
