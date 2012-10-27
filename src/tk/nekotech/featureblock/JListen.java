package tk.nekotech.featureblock;

import org.bukkit.event.Listener;

public class JListen implements Listener {
    protected FeatureBlock fb;

    public JListen(final FeatureBlock fb) {
        this.fb = fb;
        this.fb.getServer().getPluginManager().registerEvents(this, this.fb);
    }
}
