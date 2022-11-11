package com.tc.state.main;

import com.tc.state.bean.City;
import com.tc.state.bean.Distric;
import com.tc.state.bean.Region;
import com.tc.state.bean.State;
import com.tc.state.bean.Status;
import com.tc.state.logic.LogicState;
import com.tc.state.view.ViewCity;

public class Main {

	public static void main(String[] args) {

		City city01 = new City("Gorod01", Status.BIG);
		City city02 = new City("Gorod02", Status.MEDIUM);
		City city03 = new City("Gorod03", Status.SMALL);

		City city04 = new City("Gorod04", Status.BIG);
		City city05 = new City("Gorod05", Status.MEDIUM);
		City city06 = new City("Gorod06", Status.SMALL);

		City city07 = new City("Gorod07", Status.BIG);
		City city08 = new City("Gorod08", Status.MEDIUM);
		City city09 = new City("Gorod09", Status.SMALL);

		Distric dist01 = new Distric("Gorodok", Status.DISTRIC_CENTER, 789.26);
		dist01.add(city01);
		dist01.add(city02);
		dist01.add(city03);
		dist01.add(city04);

		Distric dist02 = new Distric("Gorodishe", Status.DISTRIC_CENTER, 1249.80);
		dist02.add(city05);
		dist02.add(city06);
		dist02.add(city07);
		dist02.add(city08);
		dist02.add(city09);

		City city10 = new City("Vill01", Status.BIG);
		City city11 = new City("Vill02", Status.MEDIUM);
		City city12 = new City("Vill03", Status.SMALL);

		City city13 = new City("Vill04", Status.BIG);
		City city14 = new City("Vill05", Status.MEDIUM);
		City city15 = new City("Vill06", Status.SMALL);

		City city16 = new City("Vill07", Status.BIG);
		City city17 = new City("Vill08", Status.MEDIUM);
		City city18 = new City("Vill09", Status.SMALL);

		Distric dist03 = new Distric("Village", Status.DISTRIC_CENTER, 874.53);
		dist03.add(city10);
		dist03.add(city11);
		dist03.add(city12);
		dist03.add(city13);

		Distric dist04 = new Distric("GreatVillage", Status.DISTRIC_CENTER, 1529.90);
		dist04.add(city14);
		dist04.add(city15);
		dist04.add(city16);
		dist04.add(city17);
		dist04.add(city18);

		City city19 = new City("Setl01", Status.BIG);
		City city20 = new City("Setl02", Status.MEDIUM);
		City city21 = new City("Setl03", Status.SMALL);

		City city22 = new City("Setl04", Status.BIG);
		City city23 = new City("Setl05", Status.MEDIUM);
		City city24 = new City("Setl06", Status.SMALL);

		City city25 = new City("Setl07", Status.BIG);
		City city26 = new City("Setl08", Status.MEDIUM);
		City city27 = new City("Setl09", Status.SMALL);

		Distric dist05 = new Distric("NewSettle", Status.DISTRIC_CENTER, 854.34);
		dist05.add(city19);
		dist05.add(city20);
		dist05.add(city21);
		dist05.add(city22);

		Distric dist06 = new Distric("Settlevill", Status.DISTRIC_CENTER, 956 / 23);
		dist06.add(city23);
		dist06.add(city24);
		dist06.add(city25);
		dist06.add(city26);
		dist06.add(city27);

		Region regionMogilevsk = new Region("Mogilev", Status.REGIONAL_CENTER);
		regionMogilevsk.add(dist01);
		regionMogilevsk.add(dist02);

		Region regionBrestsk = new Region("Brest", Status.REGIONAL_CENTER);
		regionBrestsk.add(dist03);
		regionBrestsk.add(dist04);

		Region regionVitebsk = new Region("Vitebsk", Status.REGIONAL_CENTER);
		regionVitebsk.add(dist05);
		regionVitebsk.add(dist06);

		State erafia = new State("Erafia", Status.CAPITAL);
		erafia.add(regionMogilevsk);
		erafia.add(regionVitebsk);
		erafia.add(regionBrestsk);

		LogicState logic = new LogicState();
		ViewCity view = new ViewCity();

		System.out.println("\nCarital: " + erafia.getStatus());
		System.out.print("\nNumber of Regions: " + logic.NumberOfStatus(erafia, Status.REGIONAL_CENTER));
		System.out.println();
		System.out.printf("\nDistric square = %.2f", dist01.getSquare());
		System.out.printf("\nDistric 01 and 02 square = %.2f", dist01.getSquare() + dist02.getSquare());
		System.out.printf("\nRegion Mogilev and Brest square = %.2f",
				logic.totalSquare(regionMogilevsk, regionBrestsk));
		System.out.printf("\nState Erafia square = %.2f", logic.totalSquare(erafia));
		System.out.println();
		view.print(logic.findByStatusRegion(erafia, Status.REGIONAL_CENTER));

	}

}
