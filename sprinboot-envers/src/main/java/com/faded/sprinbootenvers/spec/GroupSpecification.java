package com.faded.sprinbootenvers.spec;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import com.faded.sprinbootenvers.entity.SomeGroup;

public class GroupSpecification {

	public static Specification<SomeGroup> matches(Optional<String> groupName) {

		return (root, query, builder) -> {

			List<Predicate> predicates = new ArrayList<>();

			if (groupName.isPresent() && !groupName.get().isEmpty()) {

				Predicate predicate = builder.and(builder.equal(root.<String>get("name"), groupName.get()));
				predicates.add(predicate);
			}

			Predicate[] predicatesArray = predicates.toArray(new Predicate[predicates.size()]);
			return builder.and(predicatesArray);

		};

	}
}
