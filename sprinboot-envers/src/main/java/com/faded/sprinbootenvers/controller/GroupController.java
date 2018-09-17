package com.faded.sprinbootenvers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.history.Revision;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping(value = "/group")
	@ApiOperation("Query Groups by group name.")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "groupName", value = "Group name", required = false, dataType = "string", paramType = "query"), })
	public List<SomeGroup> queryGroups(
			@RequestParam(value = "groupName", required = false) Optional<String> groupName) {

		return groupService.findAll(groupName);
	}

	@GetMapping(value = "/group/revisions/{groupId}")
	public List<Revision<Integer, SomeGroup>> queryRevisions(@PathVariable Optional<String> groupId) {

		return groupService.findRevisions(groupId);
	}

	@PostMapping(value = "/group")
	@ApiOperation("Creates a new group with members.")
	public ResponseEntity<String> createGroup(@RequestBody SomeGroup group) {

		groupService.save(group);
		return new ResponseEntity<>("Group Created!", HttpStatus.OK);
	}

	@PutMapping(value = "/group")
	@ApiOperation("Edit an existing group.")
	public ResponseEntity<String> editGroup(@RequestBody SomeGroup group) {

		groupService.save(group);
		return new ResponseEntity<>("Group Updated!", HttpStatus.OK);
	}

	@DeleteMapping(value = "/group/{name}")
	@ApiOperation("Delete an existing group with group name.")
	public ResponseEntity<String> deleteGroup(@PathVariable Optional<String> name) {

		groupService.delete(name);
		return new ResponseEntity<>("Group Deleted!", HttpStatus.OK);
	}
}
