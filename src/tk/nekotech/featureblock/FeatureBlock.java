package tk.nekotech.featureblock;

import org.bukkit.plugin.java.JavaPlugin;
import tk.nekotech.featureblock.listeners.CreatureSpawn;
import tk.nekotech.featureblock.listeners.VehicleEvents;
import tk.nekotech.featureblock.listeners.WeatherChange;

public class FeatureBlock extends JavaPlugin {
    @Override
    public void onEnable() {
        Config.load(this);
        new CreatureSpawn(this);
        new VehicleEvents(this);
        new WeatherChange(this);
    }
}
