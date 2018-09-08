package com.faded.sprinbootenvers.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Audited
@Entity
@Table(name = "group_member")
public class GroupMember extends BaseEntity {

	private static final long serialVersionUID = 4439480884028000231L;

	private String title;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id_fk", nullable = false)
	private SomeGroup group;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SomeGroup getGroup() {
		return group;
	}

	public void setGroup(SomeGroup group) {
		this.group = group;
	}

}
