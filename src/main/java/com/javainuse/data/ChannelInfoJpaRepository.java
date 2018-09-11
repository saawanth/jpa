package com.javainuse.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.javainuse.model.ChannelInfo;

@Component
public interface ChannelInfoJpaRepository extends JpaRepository<ChannelInfo, Long> {
	

}
