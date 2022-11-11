package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {

	private List<Distric> dist = new ArrayList<Distric>();
	private String title;
	private Status status;

	public Region() {
	}

	public Region(String title, Status status) {
		this.title = title;
		this.status = status;
	}

	public List<Distric> getDist() {
		return dist;
	}

	public void setDist(List<Distric> dist) {
		this.dist = dist;
	}

	public void add(Distric d) {
		this.dist.add(d);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dist, status, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(dist, other.dist) && status == other.status && Objects.equals(title, other.title);
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Region [dist=" + dist + ", title=" + title + ", status=" + status + "]";
	}

}
