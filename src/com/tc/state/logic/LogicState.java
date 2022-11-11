package com.tc.state.logic;

import java.util.ArrayList;
import java.util.List;

import com.tc.state.bean.City;
import com.tc.state.bean.Distric;
import com.tc.state.bean.Region;
import com.tc.state.bean.State;
import com.tc.state.bean.Status;

public class LogicState {

	public double totalSquare(Region region) {
		double sum = 0.0;
		for (Distric i : region.getDist()) {
			sum = sum + i.getSquare();
		}

		return sum;
	}

	public double totalSquare(Region... region) {
		double sum = 0.0;
		for (Region j : region) {
			for (Distric i : j.getDist()) {
				sum = sum + i.getSquare();
			}
		}
		return sum;
	}

	public double totalSquare(State state) {
		double sum = 0.0;
		for (Region j : state.getState()) {
			for (Distric i : j.getDist()) {
				sum = sum + i.getSquare();
			}
		}

		return sum;
	}

	public List<Region> findByStatusRegion(State state, Status status) {
		List<Region> rez = new ArrayList<Region>();
		for (Region r : state.getState()) {
			if (status == r.getStatus()) {
				rez.add(r);

			}
		}
		return rez;
	}

	public int NumberOfStatus(State state, Status status) {
		int sum = 0;
		for (Region region : state.getState()) {
			if (status == region.getStatus()) {
				sum++;
			}
			for (Distric distric : region.getDist()) {
				if (status == distric.getStatus()) {
					sum++;
				}
				for (City city : distric.getCitys()) {
					if (status == city.getStatus()) {
						sum++;
					}
				}
			}
		}
		return sum;
	}
}
