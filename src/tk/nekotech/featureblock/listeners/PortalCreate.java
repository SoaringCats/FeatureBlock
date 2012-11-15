package tk.nekotech.featureblock.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityCreatePortalEvent;
import tk.nekotech.featureblock.Config;
import tk.nekotech.featureblock.FeatureBlock;
import tk.nekotech.featureblock.JListen;

public class PortalCreate extends JListen {
    public PortalCreate(final FeatureBlock fb) {
        super(fb);
    }

    @SuppressWarnings("incomplete-switch")
    @EventHandler
    public void onPortalCreate(final EntityCreatePortalEvent event) {
        switch (event.getPortalType()) {
            case ENDER:
                if (!Config.PORTAL_END) {
                    event.setCancelled(true);
                }
                break;
            case NETHER:
                if (!Config.PORTAL_NETHER) {
                    event.setCancelled(true);
                }
        }
    }
}
