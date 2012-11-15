package tk.nekotech.featureblock;

import org.bukkit.plugin.java.JavaPlugin;
import tk.nekotech.featureblock.commands.FeatureBlockCommand;
import tk.nekotech.featureblock.listeners.BlockPlace;
import tk.nekotech.featureblock.listeners.CreatureSpawn;
import tk.nekotech.featureblock.listeners.PortalCreate;
import tk.nekotech.featureblock.listeners.VehicleEvents;
import tk.nekotech.featureblock.listeners.WeatherEvents;

public class FeatureBlock extends JavaPlugin {
    @Override
    public void onEnable() {
        Config.load(this);
        new BlockPlace(this);
        new CreatureSpawn(this);
        new PortalCreate(this);
        new VehicleEvents(this);
        new WeatherEvents(this);
        this.getCommand("featureblock").setExecutor(new FeatureBlockCommand(this));
    }
}
