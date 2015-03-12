package com.pirean.main;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;

import com.pirean.model.Item;
import com.pirean.task.NightlyTask;


public class SuperMarketPlusPlus {

	private static List<Item> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        System.out.println("Starting Supermarket Plus Plus");
		
        items = new ArrayList<Item>();
        items.add(new Item("Thermal Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Chicken", 5, 7));
        items.add(new Item("Sulfuras", 0, 80));
        items.add(new Item("Backstage Passes", 15, 20));
        items.add(new Item("Ginger Cake", 3, 6));
        items.add(new Item("Organic Bananas", 2, 40));

        Timer timer = new Timer();
        Calendar date = Calendar.getInstance();
        date.set(Calendar.HOUR, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);
        // Schedule to run every day at midnight
        timer.schedule(
          new NightlyTask(items),
          date.getTime(),
          1000 * 60 * 60 * 24
        );
}

}