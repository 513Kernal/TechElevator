package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

import java.util.List;

public class DAOExample {

	public static void main(String[] args) {
	
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
		
		CityDAO dao = new JDBCCityDAO(worldDataSource);
		
		City smallville = new City();
		smallville.setCountryCode("USA");
		smallville.setDistrict("KS");
		smallville.setName("Smallville");
		smallville.setPopulation(42080);
		
		dao.create(smallville);
		
		City theCity = dao.findCityById(smallville.getId());
		System.out.println("Smallville id is"+theCity.getId());

		List<City> allCities = dao.findCityByCountryCode("USA");
		for(City c : allCities){
			System.out.println(c.getName()+" "+c.getPopulation());
		}

		System.out.println("\nCities in Ohio\n");
		allCities = dao.findCityByDistrict("Ohio");
		for (City c : allCities){
			System.out.println(c.getName()+" "+c.getPopulation());
		}
		//change all of the cities in Ohio to be in Oz
		for (City c : allCities) {
			c.setDistrict("Oz"); //this modifies memory
			dao.update(c); //this saves the changes to the database
		}

		//delete Smallville aka theCity
		dao.delete(theCity.getId());

	}

}
