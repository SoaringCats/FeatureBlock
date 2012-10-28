package tk.nekotech.featureblock.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import tk.nekotech.featureblock.Config;
import tk.nekotech.featureblock.FeatureBlock;
import tk.nekotech.featureblock.JListen;

public class WeatherEvents extends JListen {
    public WeatherEvents(final FeatureBlock fb) {
        super(fb);
    }

    @EventHandler
    public void onWeatherChange(final WeatherChangeEvent event) {
        if (event.toWeatherState() && !Config.WEATHER_RAIN) {
            event.setCancelled(true);
            event.getWorld().setThundering(false);
        }
    }

    @EventHandler
    public void onLightningStrike(final LightningStrikeEvent event) {
        if (!Config.WEATHER_LIGHTNING) {
            event.setCancelled(true);
        }
    }
}
