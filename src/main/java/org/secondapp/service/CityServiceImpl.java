package org.secondapp.service;

import org.secondapp.model.City;
import org.secondapp.repository2.City2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private City2Repository city2Repository;
	
	@Override
	public City create(City city) {
		
		return city2Repository.saveAndFlush(city);
	}
}
