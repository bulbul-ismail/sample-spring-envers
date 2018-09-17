package com.faded.sprinbootenvers.entity;

import javax.persistence.Entity;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import com.faded.sprinbootenvers.util.MyCustomRevisionListener;

@Entity
@RevisionEntity(MyCustomRevisionListener.class)
public class MyCustomRevisionEntity extends DefaultRevisionEntity {

	private static final long serialVersionUID = -5732580197654786239L;

	private String operatorName;

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

}
