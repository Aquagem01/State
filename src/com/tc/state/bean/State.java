package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {

	private List<Region> state = new ArrayList<Region>();
	private String title;
	private Status status;

	public State() {
	}

	public State(String title, Status status) {
		this.title = title;
		this.status = status;
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

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Region> getState() {
		return state;
	}

	public void setState(List<Region> state) {
		this.state = state;
	}

	public void add(Region reg) {
		this.state.add(reg);
	}

	@Override
	public int hashCode() {
		return Objects.hash(state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(state, other.state);
	}

	@Override
	public String toString() {
		return "State [state=" + state + "]";
	}

}
