package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Distric {

	private List<City> citys = new ArrayList<City>();
	private String title;
	private Status status;
	double square;

	public Distric() {
	}

	public Distric(List<City> citys, String title, Status status, double square) {
		this.citys = citys;
		this.title = title;
		this.status = status;
		this.square = square;
	}

	public Distric(String title, Status status, double square) {
		this.title = title;
		this.status = status;
		this.square = square;
	}

	public List<City> getCitys() {
		return citys;
	}

	public String getTitle() {
		return title;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public void setCitys(List<City> citys) {
		this.citys = citys;
	}

	public void add(City s) {
		this.citys.add(s);
	}

	@Override
	public int hashCode() {
		return Objects.hash(citys, square, status, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distric other = (Distric) obj;
		return Objects.equals(citys, other.citys)
				&& Double.doubleToLongBits(square) == Double.doubleToLongBits(other.square) && status == other.status
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Distric [citys=" + citys + ", title=" + title + ", status=" + status + ", square=" + square + "]";
	}

}
