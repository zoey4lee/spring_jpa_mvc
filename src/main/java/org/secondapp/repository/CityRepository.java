package org.secondapp.repository;


import org.secondapp.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository  extends JpaRepository<City, Integer>{
}
