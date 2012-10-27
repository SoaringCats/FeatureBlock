package tk.nekotech.featureblock.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.inventory.ItemStack;
import tk.nekotech.featureblock.Config;
import tk.nekotech.featureblock.FeatureBlock;
import tk.nekotech.featureblock.JListen;

public class VehicleEvents extends JListen {
    public VehicleEvents(final FeatureBlock fb) {
        super(fb);
    }

    @EventHandler
    public void onVehicleCreate(final VehicleCreateEvent event) {
        final Location loc = event.getVehicle().getLocation();
        if (event.getVehicle() instanceof Boat && !Config.VEHICLE_BOAT_PLACE) {
            loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.BOAT));
            event.getVehicle().remove();
        }
        if (event.getVehicle() instanceof Minecart && !Config.VEHICLE_MINECART_PLACE) {
            loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.MINECART));
            event.getVehicle().remove();
        }
    }

    @EventHandler
    public void onVehicleDestroy(final VehicleDestroyEvent event) {
        final Location loc = event.getVehicle().getLocation();
        if (event.getVehicle() instanceof Boat && !Config.VEHICLE_BOAT_BOATONBREAK) {
            event.setCancelled(true);
            loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.WOOD, 3));
            loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.STICK, 2));
            event.getVehicle().remove();
        }
    }

    @EventHandler
    public void onVehicleEnter(final VehicleEnterEvent event) {
        if (event.getVehicle() instanceof Boat && !Config.VEHICLE_BOAT_ENTER) {
            event.setCancelled(true);
            if (event.getEntered() instanceof Player) {
                ((Player) event.getEntered()).sendMessage(ChatColor.RED + "You aren't able to enter boats on this server.");
            }
        }
        if (event.getVehicle() instanceof Minecart && !Config.VEHICLE_MINECART_ENTER) {
            event.setCancelled(true);
            if (event.getEntered() instanceof Player) {
                ((Player) event.getEntered()).sendMessage(ChatColor.RED + "You aren't able to enter minecarts on this server.");
            }
        }
    }

    @EventHandler
    public void onVehicleExit(final VehicleExitEvent event) {
        final Location loc = event.getVehicle().getLocation();
        if (event.getVehicle() instanceof Boat && Config.VEHICLE_BOAT_DESTROYONEXIT) {
            loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.BOAT));
            event.getVehicle().remove();
        }
        if (event.getVehicle() instanceof Minecart && Config.VEHICLE_MINECART_DESTROYONEXIT) {
            loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.MINECART));
            event.getVehicle().remove();
        }
    }
}
