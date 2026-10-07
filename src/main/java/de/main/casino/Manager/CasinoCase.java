package de.main.casino.Manager;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class CasinoCase {

    private String name;

    private Map<ItemStack, Double> items;

    public CasinoCase(String name)
    {
        this.name = name;
        this.items = new HashMap<>();
    }

    public String getName()
    {
        return name;
    }

    public Map<ItemStack, Double> getItems()
    {
        return items;
    }

    public void addItem(ItemStack item,double chance)
    {
        items.put(item,chance);
    }

}