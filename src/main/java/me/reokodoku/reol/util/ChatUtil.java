package me.reokodoku.reol.util;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatUtil {

    /**
     * Sends to a certain player a message.
     * @param player The player that receives the message
     * @param message The message to send
     */
    public static void sendMessage(Player player, String message) {
        player.sendMessage(Component.text(message.replace("&", "§")));
    }

    /**
     * Sends a broadcast message
     * @param javaPlugin The plugin
     * @param message The message to send
     */
    public static void broadcastMessage(JavaPlugin javaPlugin, String message) {
        javaPlugin.getServer().broadcast(Component.text(message.replace("&", "§")));
    }

    /**
     * Sends to a certain player a message without replacing &amp; with §.
     * @param player The player that receives the message
     * @param message The message to send
     */
    public static void sendMessageWithoutReplace(Player player, String message) {
        player.sendMessage(Component.text(message));
    }

    /**
     * Sends a broadcast message without replacing &amp; with §.
     * @param javaPlugin The plugin
     * @param message The message to send
     */
    public static void broadcastMessageWithoutReplace(JavaPlugin javaPlugin, String message) {
        javaPlugin.getServer().broadcast(Component.text(message));
    }
}
