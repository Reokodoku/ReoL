package me.reokodoku.reol.util;

import java.util.logging.Logger;

public class LoggerUtil {

    /**
     * Sends a message to the console with 'info' level
     * @param logger The plugin's logger
     * @param message The message to send
     */
    public static void info(Logger logger, String message) {
        logger.info(message.replace("&", "§"));
    }

    /**
     * Sends a message to the console with 'warning' level
     * @param logger The plugin's logger
     * @param message The message to send
     */
    public static void warning(Logger logger, String message) {
        logger.warning(message.replace("&", "§"));
    }

    /**
     * Sends a message to the console with 'severe' level
     * @param logger The plugin's logger
     * @param message The message to send
     */
    public static void severe(Logger logger, String message) {
        logger.severe(message.replace("&", "§"));
    }
}
