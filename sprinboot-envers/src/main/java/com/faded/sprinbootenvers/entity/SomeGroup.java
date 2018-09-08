package com.faded.sprinbootenvers.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;

@Audited
@Entity
public class SomeGroup extends BaseEntity {

	private static final long serialVersionUID = 7606700128997174662L;

	private String name;
	private String description;

	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
	private List<GroupMember> members;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<GroupMember> getMembers() {
		return members;
	}

	public void setMembers(List<GroupMember> members) {
		this.members = members;
	}

}
