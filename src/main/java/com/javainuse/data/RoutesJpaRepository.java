package com.javainuse.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.javainuse.model.Routes;

@Component
public interface RoutesJpaRepository extends JpaRepository<Routes, Long> {
	

}
