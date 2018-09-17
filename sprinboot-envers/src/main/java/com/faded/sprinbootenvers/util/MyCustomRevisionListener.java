package com.faded.sprinbootenvers.util;

import org.hibernate.envers.RevisionListener;

import com.faded.sprinbootenvers.entity.MyCustomRevisionEntity;

public class MyCustomRevisionListener implements RevisionListener{

	@Override
	public void newRevision(Object revisionEntity) {
        MyCustomRevisionEntity exampleRevEntity = (MyCustomRevisionEntity) revisionEntity;
       // Identity identity = (Identity) Component.getInstance("org.jboss.seam.security.identity");

        exampleRevEntity.setOperatorName("test operator");
	}

}
