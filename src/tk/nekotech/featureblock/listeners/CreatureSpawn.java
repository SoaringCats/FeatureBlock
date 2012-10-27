package tk.nekotech.featureblock.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
import tk.nekotech.featureblock.Config;
import tk.nekotech.featureblock.FeatureBlock;
import tk.nekotech.featureblock.JListen;

public class CreatureSpawn extends JListen {
    public CreatureSpawn(final FeatureBlock fb) {
        super(fb);
    }

    @SuppressWarnings("incomplete-switch")
    @EventHandler
    public void onCreatureSpawn(final CreatureSpawnEvent event) {
        switch (event.getSpawnReason()) {
            case BUILD_IRONGOLEM:
                if (!Config.MOB_CREATE_IRONGOLEM) {
                    event.setCancelled(true);
                }
                break;
            case BUILD_SNOWMAN:
                if (!Config.MOB_CREATE_SNOWMAN) {
                    event.setCancelled(true);
                }
                break;
        }
        switch (event.getEntityType()) {
            case BLAZE:
                if (!Config.MOB_BLAZE) {
                    event.setCancelled(true);
                }
                break;
            case CAVE_SPIDER:
                if (!Config.MOB_CAVESPIDER) {
                    event.setCancelled(true);
                }
                break;
            case CHICKEN:
                if (!Config.MOB_CHICKEN) {
                    event.setCancelled(true);
                }
                break;
            case COW:
                if (!Config.MOB_COW) {
                    event.setCancelled(true);
                }
                break;
            case CREEPER:
                if (!Config.MOB_CREEPER) {
                    event.setCancelled(true);
                }
                break;
            case ENDER_DRAGON:
                if (!Config.MOB_ENDERDRAGON) {
                    event.setCancelled(true);
                }
                break;
            case ENDERMAN:
                if (!Config.MOB_ENDERMAN) {
                    event.setCancelled(true);
                }
                break;
            case GHAST:
                if (!Config.MOB_GHAST) {
                    event.setCancelled(true);
                }
                break;
            case GIANT:
                if (!Config.MOB_GIANT) {
                    event.setCancelled(true);
                }
                break;
            case IRON_GOLEM:
                if (!Config.MOB_IRONGOLEM) {
                    event.setCancelled(true);
                }
                break;
            case MAGMA_CUBE:
                if (!Config.MOB_MAGMACUBE) {
                    event.setCancelled(true);
                }
                break;
            case MUSHROOM_COW:
                if (!Config.MOB_MUSHROOMCOW) {
                    event.setCancelled(true);
                }
                break;
            case OCELOT:
                if (!Config.MOB_OCELOT) {
                    event.setCancelled(true);
                }
                break;
            case PIG:
                if (!Config.MOB_PIG) {
                    event.setCancelled(true);
                }
                break;
            case PIG_ZOMBIE:
                if (!Config.MOB_PIGZOMBIE) {
                    event.setCancelled(true);
                }
                break;
            case SHEEP:
                if (!Config.MOB_SHEEP) {
                    event.setCancelled(true);
                }
                break;
            case SILVERFISH:
                if (!Config.MOB_SILVERFISH) {
                    event.setCancelled(true);
                }
                break;
            case SKELETON:
                if (!Config.MOB_SKELETON) {
                    event.setCancelled(true);
                }
                break;
            case SLIME:
                if (!Config.MOB_SLIME) {
                    event.setCancelled(true);
                }
                break;
            case SNOWMAN:
                if (!Config.MOB_SNOWMAN) {
                    event.setCancelled(true);
                }
                break;
            case SPIDER:
                if (!Config.MOB_SPIDER) {
                    event.setCancelled(true);
                }
                break;
            case SQUID:
                if (!Config.MOB_SQUID) {
                    event.setCancelled(true);
                }
                break;
            case VILLAGER:
                if (!Config.MOB_VILLAGER) {
                    event.setCancelled(true);
                }
                break;
            case WOLF:
                if (!Config.MOB_WOLF) {
                    event.setCancelled(true);
                }
                break;
            case ZOMBIE:
                if (!Config.MOB_ZOMBIE) {
                    event.setCancelled(true);
                }
                break;
        }
    }
}
