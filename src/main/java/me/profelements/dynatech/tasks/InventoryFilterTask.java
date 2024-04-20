package me.profelements.dynatech.tasks;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import me.profelements.dynatech.items.tools.InventoryFilter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class InventoryFilterTask implements Runnable {
    public static final Map<UUID, Set<String>> SF_ITEMS = new HashMap<>();
    public static final Map<UUID, Set<ItemStack>> OTHER_ITEMS = new HashMap<>();

    @Override
    public void run() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            var sfItems = SF_ITEMS.computeIfAbsent(p.getUniqueId(), k -> new HashSet<>());
            var otherItems = OTHER_ITEMS.computeIfAbsent(p.getUniqueId(), k -> new HashSet<>());

            for (ItemStack filterItem : p.getInventory().getContents()) {
                if (SlimefunItem.getByItem(filterItem) instanceof InventoryFilter) {
                    PlayerBackpack.getAsync(filterItem, backpack -> {
                        for (ItemStack bpStack : backpack.getInventory().getContents()) {
                            SlimefunItem item = SlimefunItem.getByItem(bpStack);
                            if (item != null) {
                                sfItems.add(item.getId());
                            } else {
                                otherItems.add(bpStack);
                            }
                        }
                    }, false);
                }
            }
        }
    }
}
