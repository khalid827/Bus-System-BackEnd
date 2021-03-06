package com.example.velocity.easybus.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.velocity.easybus.model.Bus;

public interface BusRepository extends MongoRepository<Bus, String> {
	
	List<Bus> findBybusNo(int busNo);
	
	@Query("{'departureLocation' : :#{#departureLocation}, 'arrivalLocation' : :#{#arrivalLocation}}")
	List<Bus> findBylocation(@Param("departureLocation") String departureLocation, @Param("arrivalLocation") String arrivalLocation);
	
	
}
