package com.pirean.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.pirean.model.Item;
import com.pirean.util.ItemName;

public class UpdateQualityServiceTest {

	@Test
	public void testQualityDecreasesButSellinPositive() {
		List<Item> items = new ArrayList<Item>();
        items.add(new Item(ItemName.THERMAL_VEST.getValue(), 10, 20));
        items.add(new Item(ItemName.AGED_BRIE.getValue(), 2, 0));
        items.add(new Item(ItemName.CHICKEN.getValue(), 5, 7));
        items.add(new Item(ItemName.SULFURAS.getValue(), 0, 80));
        items.add(new Item(ItemName.BACKSTAGE_PASSES.getValue(), 15, 20));
        items.add(new Item(ItemName.GINGER_CAKE.getValue(), 3, 6));
        items.add(new Item(ItemName.ORGANIC_BANANAS.getValue(), 2, 40));
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 19);
        assertTrue(items.get(1).getQuality() == 1);
        assertTrue(items.get(2).getQuality() == 6);
        assertTrue(items.get(3).getQuality() == 80);
        assertTrue(items.get(4).getQuality() == 21);
        assertTrue(items.get(5).getQuality() == 5);
        assertTrue(items.get(6).getQuality() == 38);
        
	}
	
	@Test
	public void testQualityDecreasesButSellinNegative() {
		List<Item> items = new ArrayList<Item>();
        items.add(new Item(ItemName.THERMAL_VEST.getValue(), 0, 20));
        items.add(new Item(ItemName.AGED_BRIE.getValue(), 0, 0));
        items.add(new Item(ItemName.CHICKEN.getValue(), 0, 7));
        items.add(new Item(ItemName.SULFURAS.getValue(), 0, 80));
        items.add(new Item(ItemName.BACKSTAGE_PASSES.getValue(), 0, 20));
        items.add(new Item(ItemName.GINGER_CAKE.getValue(), 0, 6));
        items.add(new Item(ItemName.ORGANIC_BANANAS.getValue(), 0, 40));
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 18);
        assertTrue(items.get(1).getQuality() == 2);
        assertTrue(items.get(2).getQuality() == 5);
        assertTrue(items.get(3).getQuality() == 80);
        assertTrue(items.get(4).getQuality() == 0);
        assertTrue(items.get(5).getQuality() == 4);
        assertTrue(items.get(6).getQuality() == 36);
        
	}
	
	@Test
	public void testBackstagePasses() {
		List<Item> items = new ArrayList<Item>();
        items.add(new Item(ItemName.BACKSTAGE_PASSES.getValue(), 10, 20));
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 22);
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 24);
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 26);
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 28);
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 30);
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 33);
        
        UpdateQualityService.updateQuality(items);
        
        assertTrue(items.get(0).getQuality() == 36);
	}
}
