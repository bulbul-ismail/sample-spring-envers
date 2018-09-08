package com.faded.sprinbootenvers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;

@Audited
@Entity
public class GroupMember extends BaseEntity {

	private static final long serialVersionUID = 4439480884028000231L;

	@Column(name = "user_id")
	private String user_id;

	private String title;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id_fk", nullable = false)
	private SomeGroup group;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

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
