package testdata;

import utils.Reader;

public class OrderForm {
	private String name;
	private String country;
	private String city;
	private String card;
	private String month;
	private String year;
	
	public OrderForm (String fileName) {
		this.setName(Reader.json(fileName).get("name").toString());
		this.setCountry(Reader.json(fileName).get("country").toString());
		this.setCity(Reader.json(fileName).get("city").toString());
		this.setCard(Reader.json(fileName).get("card").toString());
		this.setMonth(Reader.json(fileName).get("month").toString());
		this.setYear(Reader.json(fileName).get("year").toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
