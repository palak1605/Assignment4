package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class gettersetter {
	@Id
	String id;
	String Name;
	String Colour;
	String Size;
	String Gender;
	int price;
	String Available;
	double Rating;

	public String getId() {
		return id;
	}

	public void setId(String Id) {
		id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String colour) {
		Colour = colour;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAvailable() {
		return Available;
	}

	public void setAvailable(String available) {
		Available = available;
	}

	public double getRating() {
		return Rating;
	}

	public void setRating(double rating) {
		Rating = rating;
	}

	public gettersetter()
	{
		
	}
}
