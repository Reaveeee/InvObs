package de.reave.invObs;

import org.bukkit.ChatColor;
public class Utils {
    public static String prefixString(String text, ChatColor chatColor){
        return ChatColor.DARK_PURPLE + "[IO] " + chatColor + text;
    }
}
