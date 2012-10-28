package tk.nekotech.featureblock;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class Config {
    // Mob locks
    public static boolean MOB_BAT = true;
    public static boolean MOB_BLAZE = true;
    public static boolean MOB_CAVESPIDER = true;
    public static boolean MOB_CHICKEN = true;
    public static boolean MOB_COW = true;
    public static boolean MOB_CREEPER = true;
    public static boolean MOB_ENDERDRAGON = true;
    public static boolean MOB_ENDERMAN = true;
    public static boolean MOB_GHAST = true;
    public static boolean MOB_GIANT = true;
    public static boolean MOB_IRONGOLEM = true;
    public static boolean MOB_MAGMACUBE = true;
    public static boolean MOB_MUSHROOMCOW = true;
    public static boolean MOB_OCELOT = true;
    public static boolean MOB_PIG = true;
    public static boolean MOB_PIGZOMBIE = true;
    public static boolean MOB_SHEEP = true;
    public static boolean MOB_SILVERFISH = true;
    public static boolean MOB_SKELETON = true;
    public static boolean MOB_SLIME = true;
    public static boolean MOB_SNOWMAN = true;
    public static boolean MOB_SPIDER = true;
    public static boolean MOB_SQUID = true;
    public static boolean MOB_VILLAGER = true;
    public static boolean MOB_WITCH = true;
    public static boolean MOB_WOLF = true;
    public static boolean MOB_ZOMBIE = true;
    // Mob creation locks
    public static boolean MOB_CREATE_SNOWMAN = true;
    public static boolean MOB_CREATE_IRONGOLEM = true;
    public static boolean MOB_CREATE_WITHER = true;
    // Weather lock
    public static boolean WEATHER_RAIN = true;
    public static boolean WEATHER_LIGHTNING = true;
    // Vehicle locks
    public static boolean VEHICLE_BOAT_PLACE = true;
    public static boolean VEHICLE_BOAT_ENTER = true;
    public static boolean VEHICLE_BOAT_DESTROYONEXIT = false;
    public static boolean VEHICLE_BOAT_BOATONBREAK = true;
    public static boolean VEHICLE_MINECART_PLACE = true;
    public static boolean VEHICLE_MINECART_ENTER = true;
    public static boolean VEHICLE_MINECART_DESTROYONEXIT = false;
    // Portal locks
    public static boolean PORTAL_END = true;
    public static boolean PORTAL_NETHER = true;

    public static void load(final Plugin plugin) {
        final FileConfiguration conf = plugin.getConfig();
        final StringBuilder sb = new StringBuilder();
        for (final Field field : Config.class.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
                final String path = field.getName().replaceAll("_", ".");
                try {
                    if (conf.isSet(path)) {
                        field.set(null, conf.get(path));
                    } else {
                        conf.set(path, field.get(null));
                        sb.append(path + " (" + field.get(null) + "), ");
                    }
                } catch (final IllegalAccessException ex) {
                    //
                }
            }
        }
        if (sb.length() != 0) {
            sb.setLength(sb.length() - 2);
            plugin.getLogger().info("New FeatureBlock configuration options added to your configuration file: " + sb.toString());
        }
        plugin.saveConfig();
    }
}
