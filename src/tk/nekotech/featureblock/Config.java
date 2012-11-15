package tk.nekotech.featureblock;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
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
    // Block place locks
    public static boolean BLOCK_PLACE_AIR = true;
    public static boolean BLOCK_PLACE_ANVIL = true;
    public static boolean BLOCK_PLACE_BEACON = true;
    public static boolean BLOCK_PLACE_BEDROCK = true;
    public static boolean BLOCK_PLACE_BEDBLOCK = true;
    public static boolean BLOCK_PLACE_BIRCHWOODSTAIRS = true;
    public static boolean BLOCK_PLACE_BOOKSHELF = true;
    public static boolean BLOCK_PLACE_BREWINGSTAND = true;
    public static boolean BLOCK_PLACE_BRICK = true;
    public static boolean BLOCK_PLACE_BRICKSTAIRS = true;
    public static boolean BLOCK_PLACE_BROWNMUSHROOM = true;
    public static boolean BLOCK_PLACE_BURNINGFURNACE = true;
    public static boolean BLOCK_PLACE_CACTUS = true;
    public static boolean BLOCK_PLACE_CAKEBLOCK = true;
    public static boolean BLOCK_PLACE_CARROT = true;
    public static boolean BLOCK_PLACE_CAULDRON = true;
    public static boolean BLOCK_PLACE_CHEST = true;
    public static boolean BLOCK_PLACE_CLAY = true;
    public static boolean BLOCK_PLACE_COALORE = true;
    public static boolean BLOCK_PLACE_COBBLESTONE = true;
    public static boolean BLOCK_PLACE_COBBLESTONESTAIRS = true;
    public static boolean BLOCK_PLACE_COBBLEWALL = true;
    public static boolean BLOCK_PLACE_COCOA = true;
    public static boolean BLOCK_PLACE_COMMAND = true;
    public static boolean BLOCK_PLACE_CROPS = true;
    public static boolean BLOCK_PLACE_DEADBUSH = true;
    public static boolean BLOCK_PLACE_DETECTORRAIL = true;
    public static boolean BLOCK_PLACE_DIAMONDBLOCK = true;
    public static boolean BLOCK_PLACE_DIAMONDORE = true;
    public static boolean BLOCK_PLACE_DIODEBLOCKOFF = true;
    public static boolean BLOCK_PLACE_DIODEBLOCKON = true;
    public static boolean BLOCK_PLACE_DIRT = true;
    public static boolean BLOCK_PLACE_DISPENSER = true;
    public static boolean BLOCK_PLACE_DOUBLESTEP = true;
    public static boolean BLOCK_PLACE_DRAGONEGG = true;
    public static boolean BLOCK_PLACE_EMERALDBLOCK = true;
    public static boolean BLOCK_PLACE_EMERALDORE = true;
    public static boolean BLOCK_PLACE_ENCHANTMENTTABLE = true;
    public static boolean BLOCK_PLACE_ENDERCHEST = true;
    public static boolean BLOCK_PLACE_ENDERPORTAL = true;
    public static boolean BLOCK_PLACE_ENDERPORTALFRAME = true;
    public static boolean BLOCK_PLACE_ENDERSTONE = true;
    public static boolean BLOCK_PLACE_FENCE = true;
    public static boolean BLOCK_PLACE_FENCEGATE = true;
    public static boolean BLOCK_PLACE_FIRE = true;
    public static boolean BLOCK_PLACE_FLOWERPOT = true;
    public static boolean BLOCK_PLACE_FURNACE = true;
    public static boolean BLOCK_PLACE_GLASS = true;
    public static boolean BLOCK_PLACE_GLOWINGREDSTONEORE = true;
    public static boolean BLOCK_PLACE_GLOWSTONE = true;
    public static boolean BLOCK_PLACE_GOLDBLOCK = true;
    public static boolean BLOCK_PLACE_GOLDORE = true;
    public static boolean BLOCK_PLACE_GRASS = true;
    public static boolean BLOCK_PLACE_GRAVEL = true;
    public static boolean BLOCK_PLACE_HUGEMUSHROOM1 = true;
    public static boolean BLOCK_PLACE_HUGEMUSHROOM2 = true;
    public static boolean BLOCK_PLACE_ICE = true;
    public static boolean BLOCK_PLACE_IRONBLOCK = true;
    public static boolean BLOCK_PLACE_IRONDOORBLOCK = true;
    public static boolean BLOCK_PLACE_IRONFENCE = true;
    public static boolean BLOCK_PLACE_IRONORE = true;
    public static boolean BLOCK_PLACE_JACKOLANTERN = true;
    public static boolean BLOCK_PLACE_JUKEBOX = true;
    public static boolean BLOCK_PLACE_JUNGLEWOODSTAIRS = true;
    public static boolean BLOCK_PLACE_LADDER = true;
    public static boolean BLOCK_PLACE_LAPISBLOCK = true;
    public static boolean BLOCK_PLACE_LAPISORE = true;
    public static boolean BLOCK_PLACE_LAVA = true;
    public static boolean BLOCK_PLACE_LEAVES = true;
    public static boolean BLOCK_PLACE_LEVER = true;
    public static boolean BLOCK_PLACE_LOCKEDCHEST = true;
    public static boolean BLOCK_PLACE_LOG = true;
    public static boolean BLOCK_PLACE_LONGGRASS = true;
    public static boolean BLOCK_PLACE_MELONBLOCK = true;
    public static boolean BLOCK_PLACE_MELONSTEM = true;
    public static boolean BLOCK_PLACE_MOBSPAWNER = true;
    public static boolean BLOCK_PLACE_MONSTEREGGS = true;
    public static boolean BLOCK_PLACE_MOSSYCOBBLESTONE = true;
    public static boolean BLOCK_PLACE_MYCEL = true;
    public static boolean BLOCK_PLACE_NETHERRACK = true;
    public static boolean BLOCK_PLACE_NETHERBRICK = true;
    public static boolean BLOCK_PLACE_NETHERBRICKSTAIRS = true;
    public static boolean BLOCK_PLACE_NETHERFENCE = true;
    public static boolean BLOCK_PLACE_NETHERWARTS = true;
    public static boolean BLOCK_PLACE_NOTEBLOCK = true;
    public static boolean BLOCK_PLACE_OBSIDIAN = true;
    public static boolean BLOCK_PLACE_PISTONBASE = true;
    public static boolean BLOCK_PLACE_PISTONEXTENSION = true;
    public static boolean BLOCK_PLACE_PISTONMOVINGPIECE = true;
    public static boolean BLOCK_PLACE_PISTONSTICKYBASE = true;
    public static boolean BLOCK_PLACE_PORTAL = true;
    public static boolean BLOCK_PLACE_POTATO = true;
    public static boolean BLOCK_PLACE_POWEREDRAIL = true;
    public static boolean BLOCK_PLACE_PUMPKIN = true;
    public static boolean BLOCK_PLACE_PUMPKINSTEM = true;
    public static boolean BLOCK_PLACE_RAILS = true;
    public static boolean BLOCK_PLACE_REDSTONELAMPOFF = true;
    public static boolean BLOCK_PLACE_REDSTONELAMPON = true;
    public static boolean BLOCK_PLACE_REDSTONEORE = true;
    public static boolean BLOCK_PLACE_REDSTONETORCHOFF = true;
    public static boolean BLOCK_PLACE_REDSTONETORCHON = true;
    public static boolean BLOCK_PLACE_REDSTONEWIRE = true;
    public static boolean BLOCK_PLACE_REDMUSHROOM = true;
    public static boolean BLOCK_PLACE_REDROSE = true;
    public static boolean BLOCK_PLACE_SAND = true;
    public static boolean BLOCK_PLACE_SANDSTONE = true;
    public static boolean BLOCK_PLACE_SANDSTONESTAIRS = true;
    public static boolean BLOCK_PLACE_SAPLING = true;
    public static boolean BLOCK_PLACE_SIGNPOST = true;
    public static boolean BLOCK_PLACE_SKULL = true;
    public static boolean BLOCK_PLACE_SMOOTHBRICK = true;
    public static boolean BLOCK_PLACE_SMOOTHSTAIRS = true;
    public static boolean BLOCK_PLACE_SNOW = true;
    public static boolean BLOCK_PLACE_SNOWBLOCK = true;
    public static boolean BLOCK_PLACE_SOIL = true;
    public static boolean BLOCK_PLACE_SOULSAND = true;
    public static boolean BLOCK_PLACE_SPONGE = true;
    public static boolean BLOCK_PLACE_SPRUCEWOODSTAIRS = true;
    public static boolean BLOCK_PLACE_STATIONARYLAVA = true;
    public static boolean BLOCK_PLACE_STATIONARYWATER = true;
    public static boolean BLOCK_PLACE_STEP = true;
    public static boolean BLOCK_PLACE_STONE = true;
    public static boolean BLOCK_PLACE_STONEBUTTON = true;
    public static boolean BLOCK_PLACE_STONEPLATE = true;
    public static boolean BLOCK_PLACE_SUGARCANEBLOCK = true;
    public static boolean BLOCK_PLACE_THINGLASS = true;
    public static boolean BLOCK_PLACE_TNT = true;
    public static boolean BLOCK_PLACE_TORCH = true;
    public static boolean BLOCK_PLACE_TRAPDOOR = true;
    public static boolean BLOCK_PLACE_TRIPWIRE = true;
    public static boolean BLOCK_PLACE_TRIPWIREHOOK = true;
    public static boolean BLOCK_PLACE_VINE = true;
    public static boolean BLOCK_PLACE_WALLSIGN = true;
    public static boolean BLOCK_PLACE_WATER = true;
    public static boolean BLOCK_PLACE_WATERLILY = true;
    public static boolean BLOCK_PLACE_WEB = true;
    public static boolean BLOCK_PLACE_WOOD = true;
    public static boolean BLOCK_PLACE_WOODENDOOR = true;
    public static boolean BLOCK_PLACE_WOODBUTTON = true;
    public static boolean BLOCK_PLACE_WOODDOUBLESTEP = true;
    public static boolean BLOCK_PLACE_WOODPLATE = true;
    public static boolean BLOCK_PLACE_WOODSTAIRS = true;
    public static boolean BLOCK_PLACE_WOODSTEP = true;
    public static boolean BLOCK_PLACE_WOOL = true;
    public static boolean BLOCK_PLACE_WORKBENCH = true;
    public static boolean BLOCK_PLACE_YELLOWFLOWER = true;

    public static void load(final Plugin plugin) {
        final FileConfiguration conf = plugin.getConfig();
        final ArrayList<String> added = new ArrayList<String>();
        for (final Field field : Config.class.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
                final String path = field.getName().replaceAll("_", ".");
                try {
                    if (conf.isSet(path)) {
                        field.set(null, conf.get(path));
                    } else {
                        conf.set(path, field.get(null));
                        added.add(path + " (" + field.get(null) + "), ");
                    }
                } catch (final IllegalAccessException ex) {
                    //
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int left = 0;
        for (int i = 0; i < added.size(); i++) {
            sb.append(added.get(i));
            if (i == 49) {
                left = added.size() - 50;
            }
        }
        if (sb.length() != 0) {
            sb.setLength(sb.length() - 2);
            if (left != 0) {
                sb.append(" + " + left + " more...");
            }
            plugin.getLogger().info("New FeatureBlock configuration options added to your configuration file: " + sb.toString());
        }
        plugin.saveConfig();
    }
}
