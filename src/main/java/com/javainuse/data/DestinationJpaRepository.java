package com.javainuse.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.javainuse.model.Destination;

@Component
public interface DestinationJpaRepository extends JpaRepository<Destination, Long> {
	
	Destination findByName(String name);

}
