package me.reokodoku.reol.util;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class RegisterUtil {

    /**
     * Register a listener
     * @param javaPlugin The plugin
     * @param listener The listener to register
     */
    public static void registerListener(JavaPlugin javaPlugin, Listener listener) {
        javaPlugin.getServer().getPluginManager().registerEvents(listener, javaPlugin);
    }

    /**
     * Register listeners from an {@link ArrayList<>}
     * @param javaPlugin The plugin
     * @param listeners The {@link ArrayList<>} containing listeners
     */
    public static void registerListeners(JavaPlugin javaPlugin, ArrayList<Listener> listeners) {
        listeners.forEach((listener -> javaPlugin.getServer().getPluginManager().registerEvents(listener, javaPlugin)));
    }

    /**
     * Register a permission
     * @param javaPlugin The plugin
     * @param permission The permission to register
     */
    public static void registerPermission(JavaPlugin javaPlugin, Permission permission) {
        javaPlugin.getServer().getPluginManager().addPermission(permission);
    }

    /**
     * Register permissions from an {@link ArrayList<>}
     * @param javaPlugin The plugin
     * @param permissions The {@link ArrayList<>} containing permissions
     */
    public static void registerPermissions(JavaPlugin javaPlugin, ArrayList<Permission> permissions) {
        permissions.forEach((permission -> javaPlugin.getServer().getPluginManager().addPermission(permission)));
    }

    /**
     * Register a command
     * @param javaPlugin The plugin
     * @param commandName The name of the command
     * @param executor The command executor
     */
    public static void registerCommand(JavaPlugin javaPlugin, String commandName, CommandExecutor executor) {
        Objects.requireNonNull(javaPlugin.getCommand(commandName)).setExecutor(executor);
    }

    /**
     * Register commands from a {@link HashMap<>}
     * @param javaPlugin The plugin
     * @param commands The {@link HashMap<>} containing strings and command executors
     */
    public static void registerCommands(JavaPlugin javaPlugin, HashMap<String, CommandExecutor> commands) {
        commands.forEach((name, commandExecutor) -> Objects.requireNonNull(javaPlugin.getCommand(name)).setExecutor(commandExecutor));
    }
}
