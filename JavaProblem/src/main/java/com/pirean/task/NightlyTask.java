package com.pirean.task;
import java.util.List;
import java.util.TimerTask;

import com.pirean.model.Item;
import com.pirean.service.UpdateQualityService;


public class NightlyTask extends TimerTask {

	private static List<Item> items = null;
	
	public NightlyTask (List<Item> listOfItems) {
		items = listOfItems;
	}
	
	@Override
	public void run() {
		UpdateQualityService.updateQuality(items);
	}
		
}
