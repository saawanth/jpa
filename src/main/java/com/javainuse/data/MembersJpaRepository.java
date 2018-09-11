package com.javainuse.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.javainuse.model.Members;

@Component
public interface MembersJpaRepository extends JpaRepository<Members, Long> {
	
	Members findByName(String name);

}
