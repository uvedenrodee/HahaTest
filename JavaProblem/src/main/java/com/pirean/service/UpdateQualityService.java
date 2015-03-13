package com.pirean.service;

import java.util.List;

import com.pirean.model.Item;

public class UpdateQualityService {
	
	public static void updateQuality(List<Item> items)
    {
        for (int i = 0; i < items.size(); i++)
        {
            if ((!"Aged Brie".equals(items.get(i).getName())) && !"Backstage Passes".equals(items.get(i).getName()) && !"Sulfuras".equals(items.get(i).getName())) 
            {
                if (items.get(i).getQuality() > 0)
                {
                	if ("Organic Bananas".equals(items.get(i).getName()))
                    {
                        items.get(i).setQuality(items.get(i).getQuality() - 2);
                    }
                	else
                	{
                		items.get(i).setQuality(items.get(i).getQuality() - 1);
                	}
                }
            }
            else
            {
                if (items.get(i).getQuality() < 50)
                {
                    items.get(i).setQuality(items.get(i).getQuality() + 1);

                    if ("Backstage Passes".equals(items.get(i).getName()))
                    {
                        if (items.get(i).getSellIn() < 11)
                        {
                            items.get(i).setQuality(items.get(i).getQuality() + 1);
                        }

                        if (items.get(i).getSellIn() < 6)
                        {
                            items.get(i).setQuality(items.get(i).getQuality() + 1);
                        }
                    }
                }
            }

            if (!"Sulfuras".equals(items.get(i).getName()))
            {
                items.get(i).setSellIn(items.get(i).getSellIn() - 1);
            }

            if (items.get(i).getSellIn() < 0)
            {
                if (!"Aged Brie".equals(items.get(i).getName()))
                {
                    if (!"Backstage Passes".equals(items.get(i).getName()))
                    {
                        if (items.get(i).getQuality() > 0)
                        {
                            if (!"Sulfuras".equals(items.get(i).getName()))
                            {
                            	if ("Organic Bananas".equals(items.get(i).getName()))
                                {
                                    items.get(i).setQuality(items.get(i).getQuality() - 2);
                                }
                            	else
                            	{
                            		items.get(i).setQuality(items.get(i).getQuality() - 1);
                            	}
                            }
                        }
                    }
                    else
                    {
                        items.get(i).setQuality(items.get(i).getQuality() - items.get(i).getQuality());
                    }
                }
                else
                {
                    if (items.get(i).getQuality() < 50)
                    {
                        items.get(i).setQuality(items.get(i).getQuality() + 1);
                    }
                }
            }
        }
    }
}
