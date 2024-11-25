package de.reave.invObs;

import de.reave.invObs.commands.SeeEnderChestCommand;
import de.reave.invObs.commands.SeeInventoryCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class InvObs extends JavaPlugin {

    @Override
    public void onEnable() {
        //getCommand("commandname").setExecutor(new CommandClass());
        //getServer().getPluginManager().registerEvents(new EventsClass(), this);

        getCommand("seeinventory").setExecutor(new SeeInventoryCommand());
        getCommand("seeenderchest").setExecutor(new SeeEnderChestCommand());
    }

    @Override
    public void onDisable() {

    }
}
