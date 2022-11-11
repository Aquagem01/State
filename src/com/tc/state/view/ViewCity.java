package com.tc.state.view;

import java.util.List;
import com.tc.state.bean.Region;

public class ViewCity {

	public ViewCity() {
	}

	public void print(List<Region> regions) {
		for (Region s : regions) {
			System.out.print("\nTitle: " + s.getTitle() + "\t\tStatus: " + s.getStatus());
		}
	}

}
