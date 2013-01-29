package com.zkdemo.model;

public class Car {
	
	/* Fields */
	/* ------ */
	private Integer id;
	private String make;
	private String model;
	private String description;
	private String imageUri;
	private Double rentalPrice;		// USD price.
	private CitiesEnum currentCity;
	private Integer passengersCount;
	
	/* Constructors */
	/* ------------ */
	public Car(Integer id, String model, String make, String description,  String preview, Double usdPrice){
		this.id = id;
		this.model = model;
		this.make = make;
		this.imageUri = preview;
		this.description = description;
		this.rentalPrice = usdPrice;
	}
	
	/* Properties */
	/* ---------- */
	public Integer getId() {
		return id;
	}	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getPreview() {
		return imageUri;
	}
	public void setPreview(String preview) {
		this.imageUri = preview;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getPrice() {
		return rentalPrice;
	}
	public void setPrice(Double price) {
		this.rentalPrice = price;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	public CitiesEnum getCurrentCity() {
		return currentCity;
	}
	public void setCurrentCity(CitiesEnum currentCity) {
		this.currentCity = currentCity;
	}
	
	/* Methods */
	/* ---------- */
	public Double GetPrice(CurrenciesEnum currency){
		
		switch (currency) {		
			case USD:
				return rentalPrice;		
			case EUR:
				return rentalPrice * 0.7433;
			case PLN:
					return rentalPrice * 3.1074;
			default:
				return 0.0;
		}			
	}

	public Integer getPassengersCount() {
		return passengersCount;
	}

	public void setPassengersCount(Integer passengersCount) {
		this.passengersCount = passengersCount;
	}
}
