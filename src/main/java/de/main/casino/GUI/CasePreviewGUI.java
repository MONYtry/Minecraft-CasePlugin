package de.main.casino.GUI;

import de.main.casino.Casino;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;

public class CaseEditorGUI {

    public static void openItemInCase(Player p,String caseName) {

        FileConfiguration cfg = JavaPlugin.getPlugin(Casino.class).getConfig();
        String case_inhalt_title = cfg.getString("settings.gui_inhalt_title");

        Inventory caseInventory = Bukkit.createInventory(null, 45, case_inhalt_title);

        Map<ItemStack, Double> caseItems = CasinoMainGUI.cases.getOrDefault(caseName, java.util.Collections.emptyMap());

        int i = 0;

        for (ItemStack item : caseItems.keySet()) {

            caseInventory.setItem(i, item);
            i++;

            if (i >= caseInventory.getSize()) break;
        }

        p.openInventory(caseInventory);
    }
}