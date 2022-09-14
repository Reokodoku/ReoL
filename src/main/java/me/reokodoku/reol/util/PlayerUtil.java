package me.reokodoku.reol.util;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Objects;

public class PlayerUtil {

    /**
     * Gets the player's inventory items
     * @param player The player
     * @return An {@link ArrayList<ItemStack>} with the items of the inventory.
     */
    public static ArrayList<ItemStack> getInventory(Player player) {
        ArrayList<ItemStack> inventory = new ArrayList<>();

        int readedSlots = 0;
        for (ItemStack item : player.getInventory().getContents()) {
            if(readedSlots < 35) inventory.add(item);
            readedSlots++;
        }

        return inventory;
    }

    /**
     * Gets the player's hotbar items
     * @param player The player
     * @return An {@link ArrayList<ItemStack>} with the items of the hotbar.
     */
    public static ArrayList<ItemStack> getHotbar(Player player) {
        ArrayList<ItemStack> hotbar = new ArrayList<>();

        int readedSlots = 0;
        for (ItemStack item : player.getInventory().getContents()) {
            if(readedSlots < 9) hotbar.add(item);

            readedSlots++;
        }

        return hotbar;
    }

    /**
     * Gets the player's ip address
     * @param player The player
     * @return A {@link String} with the ip address of the player.
     */
    public static String getIPAddress(Player player) {
        return Objects.requireNonNull(player.getAddress()).getHostString();
    }

    /**
     * Gets the player's ip port
     * @param player The player
     * @return An int with the ip port of the player.
     */
    public static int getIPPort(Player player) {
        return Objects.requireNonNull(player.getAddress()).getPort();
    }
}
