package com.javainuse.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.javainuse.model.Source;

@Component
public interface SourceJpaRepository extends JpaRepository<Source, Long> {
	
	Source findByName(String name);

}
