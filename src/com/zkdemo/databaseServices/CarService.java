package com.zkdemo.databaseServices;

import java.util.ArrayList;
import java.util.List;
import com.zkdemo.model.Car;

// Car entity simulation.
public class CarService implements IDatabaseService<Car> {
	
	private List<Car> cars = new ArrayList<Car>();

	@Override
	public void Add(Car newItem) {		
		if(!this.cars.contains(newItem)){
			this.cars.add(newItem);	
		}		
	}

	@Override
	public void Remove(Car item) {
		if(this.cars.contains(item)){
			this.cars.remove(item);	
		}
	}
	
	@Override
	public void Remove(Integer index) {
		if(this.cars.size() - 1 > index){
			this.cars.remove(index);	
		}		
	}

	@Override
	public void RemoveAll() {
		for (Car car : this.cars) {
			this.cars.remove(car);			
		}
	}

	@Override
	public List<Car> GetAll() {
		return this.cars;
	}	
	
	public List<Car> SearchBeginning(String letters){
		List<Car> foundCars = new ArrayList<Car>(); 
				
		for (Car car : this.cars) {
			if (car.getModel().matches("^" + letters)) {
				foundCars.add(car);
			}else 
				if (car.getMake().matches("^" + letters)) {
					foundCars.add(car);			
				}
		}
		
		return foundCars;
	}
}
