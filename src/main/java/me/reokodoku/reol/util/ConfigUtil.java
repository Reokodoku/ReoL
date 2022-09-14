package me.reokodoku.reol.util;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class ConfigUtil {

    /**
     * Check if a config file exists
     * @param javaPlugin The plugin
     * @param filePath The file path of the "resources" folder (e.g. config.yml)
     */
    public static boolean configExists(JavaPlugin javaPlugin, String filePath) {
        return new File(javaPlugin.getDataFolder(), filePath).exists();
    }

    /**
     * Create a config file
     * @param javaPlugin The plugin
     * @param filePath The file path of the "resources" folder (e.g. otherFolder/otherConfig.yml)
     * @param replace If the file should be replaced
     */
    public static void createCustomConfig(JavaPlugin javaPlugin, String filePath, boolean replace) {
        javaPlugin.saveResource(filePath, replace);
    }

    /**
     * Get a string from a configuration file
     * @param fileConfiguration The file configuration
     * @param key The key/value to obtain
     * @return A {@link String} with the key.
     */
    public static String getString(FileConfiguration fileConfiguration, String key) {
        return fileConfiguration.getString(key);
    }

    /**
     * Get a boolean from a configuration file
     * @param fileConfiguration The file configuration
     * @param key The key/value to obtain
     * @return A boolean with the key.
     */
    public static boolean getBoolean(FileConfiguration fileConfiguration, String key) {
        return fileConfiguration.getBoolean(key);
    }

    /**
     * Get an int from a configuration file
     * @param fileConfiguration The file configuration
     * @param key The key/value to obtain
     * @return An int with the key.
     */
    public static int getInt(FileConfiguration fileConfiguration, String key) {
        return fileConfiguration.getInt(key);
    }

    /**
     * Get a double from a configuration file
     * @param fileConfiguration The file configuration
     * @param key The key/value to obtain
     * @return A double with the key.
     */
    public static double getDouble(FileConfiguration fileConfiguration, String key) {
        return fileConfiguration.getDouble(key);
    }

    /**
     * Get a configuration section from a configuration file
     * @param fileConfiguration The file configuration
     * @param key The key/value to obtain
     * @return A {@link ConfigurationSection} with the key.
     */
    public static ConfigurationSection getConfigurationSection(FileConfiguration fileConfiguration, String key) {
        return fileConfiguration.getConfigurationSection(key);
    }
}
