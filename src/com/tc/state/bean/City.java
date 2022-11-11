package com.tc.state.bean;

import java.util.Objects;

public class City {
	private String title;
	private Status status;

	public City() {

	}

	public City(String title, Status status) {
		super();
		this.title = title;
		this.status = status;

	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toPrintCity() {
		return "\nTitle: " + title + "\tDistric Status: " + status;
	}

	@Override
	public String toString() {
		return "City [title=" + title + ", statusDistr=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(title, other.title);
	}

}
