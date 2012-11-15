package tk.nekotech.featureblock.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import tk.nekotech.featureblock.Config;
import tk.nekotech.featureblock.FeatureBlock;
import tk.nekotech.featureblock.JListen;

public class BlockBreak extends JListen {
    public BlockBreak(FeatureBlock fb) {
        super(fb);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        switch (event.getBlock().getType()) {
            case AIR:
                if (!Config.BLOCK_BREAK_AIR) {
                    event.setCancelled(true);
                }
                break;
            case ANVIL:
                if (!Config.BLOCK_BREAK_ANVIL) {
                    event.setCancelled(true);
                }
                break;
            case BEACON:
                if (!Config.BLOCK_BREAK_BEACON) {
                    event.setCancelled(true);
                }
                break;
            case BEDROCK:
                if (!Config.BLOCK_BREAK_BEDROCK) {
                    event.setCancelled(true);
                }
                break;
            case BED_BLOCK:
                if (!Config.BLOCK_BREAK_BEDBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case BIRCH_WOOD_STAIRS:
                if (!Config.BLOCK_BREAK_BIRCHWOODSTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case BOOKSHELF:
                if (!Config.BLOCK_BREAK_BOOKSHELF) {
                    event.setCancelled(true);
                }
                break;
            case BREWING_STAND:
                if (!Config.BLOCK_BREAK_BREWINGSTAND) {
                    event.setCancelled(true);
                }
                break;
            case BRICK:
                if (!Config.BLOCK_BREAK_BRICK) {
                    event.setCancelled(true);
                }
                break;
            case BRICK_STAIRS:
                if (!Config.BLOCK_BREAK_BRICKSTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case BROWN_MUSHROOM:
                if (!Config.BLOCK_BREAK_BROWNMUSHROOM) {
                    event.setCancelled(true);
                }
                break;
            case BURNING_FURNACE:
                if (!Config.BLOCK_BREAK_BURNINGFURNACE) {
                    event.setCancelled(true);
                }
                break;
            case CACTUS:
                if (!Config.BLOCK_BREAK_CACTUS) {
                    event.setCancelled(true);
                }
                break;
            case CAKE_BLOCK:
                if (!Config.BLOCK_BREAK_CAKEBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case CARROT:
                if (!Config.BLOCK_BREAK_CARROT) {
                    event.setCancelled(true);
                }
                break;
            case CAULDRON:
                if (!Config.BLOCK_BREAK_CAULDRON) {
                    event.setCancelled(true);
                }
                break;
            case CHEST:
                if (!Config.BLOCK_BREAK_CHEST) {
                    event.setCancelled(true);
                }
                break;
            case CLAY:
                if (!Config.BLOCK_BREAK_CLAY) {
                    event.setCancelled(true);
                }
                break;
            case COAL_ORE:
                if (!Config.BLOCK_BREAK_COALORE) {
                    event.setCancelled(true);
                }
                break;
            case COBBLESTONE:
                if (!Config.BLOCK_BREAK_COBBLESTONE) {
                    event.setCancelled(true);
                }
                break;
            case COBBLESTONE_STAIRS:
                if (!Config.BLOCK_BREAK_COBBLESTONESTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case COBBLE_WALL:
                if (!Config.BLOCK_BREAK_COBBLEWALL) {
                    event.setCancelled(true);
                }
                break;
            case COCOA:
                if (!Config.BLOCK_BREAK_COCOA) {
                    event.setCancelled(true);
                }
                break;
            case COMMAND:
                if (!Config.BLOCK_BREAK_COMMAND) {
                    event.setCancelled(true);
                }
                break;
            case CROPS:
                if (!Config.BLOCK_BREAK_CROPS) {
                    event.setCancelled(true);
                }
                break;
            case DEAD_BUSH:
                if (!Config.BLOCK_BREAK_DEADBUSH) {
                    event.setCancelled(true);
                }
                break;
            case DETECTOR_RAIL:
                if (!Config.BLOCK_BREAK_DETECTORRAIL) {
                    event.setCancelled(true);
                }
                break;
            case DIAMOND_BLOCK:
                if (!Config.BLOCK_BREAK_DIAMONDBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case DIAMOND_ORE:
                if (!Config.BLOCK_BREAK_DIAMONDORE) {
                    event.setCancelled(true);
                }
                break;
            case DIODE_BLOCK_OFF:
                if (!Config.BLOCK_BREAK_DIODEBLOCKOFF) {
                    event.setCancelled(true);
                }
                break;
            case DIODE_BLOCK_ON:
                if (!Config.BLOCK_BREAK_DIODEBLOCKON) {
                    event.setCancelled(true);
                }
                break;
            case DIRT:
                if (!Config.BLOCK_BREAK_DIRT) {
                    event.setCancelled(true);
                }
                break;
            case DISPENSER:
                if (!Config.BLOCK_BREAK_DISPENSER) {
                    event.setCancelled(true);
                }
                break;
            case DOUBLE_STEP:
                if (!Config.BLOCK_BREAK_DOUBLESTEP) {
                    event.setCancelled(true);
                }
                break;
            case DRAGON_EGG:
                if (!Config.BLOCK_BREAK_DRAGONEGG) {
                    event.setCancelled(true);
                }
                break;
            case EMERALD_BLOCK:
                if (!Config.BLOCK_BREAK_EMERALDBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case EMERALD_ORE:
                if (!Config.BLOCK_BREAK_EMERALDORE) {
                    event.setCancelled(true);
                }
                break;
            case ENCHANTMENT_TABLE:
                if (!Config.BLOCK_BREAK_ENCHANTMENTTABLE) {
                    event.setCancelled(true);
                }
                break;
            case ENDER_CHEST:
                if (!Config.BLOCK_BREAK_ENDERCHEST) {
                    event.setCancelled(true);
                }
                break;
            case ENDER_PORTAL:
                if (!Config.BLOCK_BREAK_ENDERPORTAL) {
                    event.setCancelled(true);
                }
                break;
            case ENDER_PORTAL_FRAME:
                if (!Config.BLOCK_BREAK_ENDERPORTALFRAME) {
                    event.setCancelled(true);
                }
                break;
            case ENDER_STONE:
                if (!Config.BLOCK_BREAK_ENDERSTONE) {
                    event.setCancelled(true);
                }
                break;
            case FENCE:
                if (!Config.BLOCK_BREAK_FENCE) {
                    event.setCancelled(true);
                }
                break;
            case FENCE_GATE:
                if (!Config.BLOCK_BREAK_FENCEGATE) {
                    event.setCancelled(true);
                }
                break;
            case FIRE:
                if (!Config.BLOCK_BREAK_FIRE) {
                    event.setCancelled(true);
                }
                break;
            case FLOWER_POT:
                if (!Config.BLOCK_BREAK_FLOWERPOT) {
                    event.setCancelled(true);
                }
                break;
            case FURNACE:
                if (!Config.BLOCK_BREAK_FURNACE) {
                    event.setCancelled(true);
                }
                break;
            case GLASS:
                if (!Config.BLOCK_BREAK_GLASS) {
                    event.setCancelled(true);
                }
                break;
            case GLOWING_REDSTONE_ORE:
                if (!Config.BLOCK_BREAK_GLOWINGREDSTONEORE) {
                    event.setCancelled(true);
                }
                break;
            case GLOWSTONE:
                if (!Config.BLOCK_BREAK_GLOWSTONE) {
                    event.setCancelled(true);
                }
                break;
            case GOLD_BLOCK:
                if (!Config.BLOCK_BREAK_GOLDBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case GOLD_ORE:
                if (!Config.BLOCK_BREAK_GOLDORE) {
                    event.setCancelled(true);
                }
                break;
            case GRASS:
                if (!Config.BLOCK_BREAK_GRASS) {
                    event.setCancelled(true);
                }
                break;
            case GRAVEL:
                if (!Config.BLOCK_BREAK_GRAVEL) {
                    event.setCancelled(true);
                }
                break;
            case HUGE_MUSHROOM_1:
                if (!Config.BLOCK_BREAK_HUGEMUSHROOM1) {
                    event.setCancelled(true);
                }
                break;
            case HUGE_MUSHROOM_2:
                if (!Config.BLOCK_BREAK_HUGEMUSHROOM2) {
                    event.setCancelled(true);
                }
                break;
            case ICE:
                if (!Config.BLOCK_BREAK_ICE) {
                    event.setCancelled(true);
                }
                break;
            case IRON_BLOCK:
                if (!Config.BLOCK_BREAK_IRONBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case IRON_DOOR_BLOCK:
                if (!Config.BLOCK_BREAK_IRONDOORBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case IRON_FENCE:
                if (!Config.BLOCK_BREAK_IRONFENCE) {
                    event.setCancelled(true);
                }
                break;
            case IRON_ORE:
                if (!Config.BLOCK_BREAK_IRONORE) {
                    event.setCancelled(true);
                }
                break;
            case JACK_O_LANTERN:
                if (!Config.BLOCK_BREAK_JACKOLANTERN) {
                    event.setCancelled(true);
                }
                break;
            case JUKEBOX:
                if (!Config.BLOCK_BREAK_JUKEBOX) {
                    event.setCancelled(true);
                }
                break;
            case JUNGLE_WOOD_STAIRS:
                if (!Config.BLOCK_BREAK_JUNGLEWOODSTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case LADDER:
                if (!Config.BLOCK_BREAK_LADDER) {
                    event.setCancelled(true);
                }
                break;
            case LAPIS_BLOCK:
                if (!Config.BLOCK_BREAK_LAPISBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case LAPIS_ORE:
                if (!Config.BLOCK_BREAK_LAPISORE) {
                    event.setCancelled(true);
                }
                break;
            case LAVA:
                if (!Config.BLOCK_BREAK_LAVA) {
                    event.setCancelled(true);
                }
                break;
            case LEAVES:
                if (!Config.BLOCK_BREAK_LEAVES) {
                    event.setCancelled(true);
                }
                break;
            case LEVER:
                if (!Config.BLOCK_BREAK_LEVER) {
                    event.setCancelled(true);
                }
                break;
            case LOCKED_CHEST:
                if (!Config.BLOCK_BREAK_LOCKEDCHEST) {
                    event.setCancelled(true);
                }
                break;
            case LOG:
                if (!Config.BLOCK_BREAK_LOG) {
                    event.setCancelled(true);
                }
                break;
            case LONG_GRASS:
                if (!Config.BLOCK_BREAK_LONGGRASS) {
                    event.setCancelled(true);
                }
                break;
            case MELON_BLOCK:
                if (!Config.BLOCK_BREAK_MELONBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case MELON_STEM:
                if (!Config.BLOCK_BREAK_MELONSTEM) {
                    event.setCancelled(true);
                }
                break;
            case MOB_SPAWNER:
                if (!Config.BLOCK_BREAK_MOBSPAWNER) {
                    event.setCancelled(true);
                }
                break;
            case MONSTER_EGGS:
                if (!Config.BLOCK_BREAK_MONSTEREGGS) {
                    event.setCancelled(true);
                }
                break;
            case MOSSY_COBBLESTONE:
                if (!Config.BLOCK_BREAK_MOSSYCOBBLESTONE) {
                    event.setCancelled(true);
                }
                break;
            case MYCEL:
                if (!Config.BLOCK_BREAK_MYCEL) {
                    event.setCancelled(true);
                }
                break;
            case NETHERRACK:
                if (!Config.BLOCK_BREAK_NETHERRACK) {
                    event.setCancelled(true);
                }
                break;
            case NETHER_BRICK:
                if (!Config.BLOCK_BREAK_NETHERBRICK) {
                    event.setCancelled(true);
                }
                break;
            case NETHER_BRICK_STAIRS:
                if (!Config.BLOCK_BREAK_NETHERBRICKSTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case NETHER_FENCE:
                if (!Config.BLOCK_BREAK_NETHERFENCE) {
                    event.setCancelled(true);
                }
                break;
            case NETHER_WARTS:
                if (!Config.BLOCK_BREAK_NETHERWARTS) {
                    event.setCancelled(true);
                }
                break;
            case NOTE_BLOCK:
                if (!Config.BLOCK_BREAK_NOTEBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case OBSIDIAN:
                if (!Config.BLOCK_BREAK_OBSIDIAN) {
                    event.setCancelled(true);
                }
                break;
            case PISTON_BASE:
                if (!Config.BLOCK_BREAK_PISTONBASE) {
                    event.setCancelled(true);
                }
                break;
            case PISTON_EXTENSION:
                if (!Config.BLOCK_BREAK_PISTONEXTENSION) {
                    event.setCancelled(true);
                }
                break;
            case PISTON_MOVING_PIECE:
                if (!Config.BLOCK_BREAK_PISTONMOVINGPIECE) {
                    event.setCancelled(true);
                }
                break;
            case PISTON_STICKY_BASE:
                if (!Config.BLOCK_BREAK_PISTONSTICKYBASE) {
                    event.setCancelled(true);
                }
                break;
            case PORTAL:
                if (!Config.BLOCK_BREAK_PORTAL) {
                    event.setCancelled(true);
                }
                break;
            case POTATO:
                if (!Config.BLOCK_BREAK_POTATO) {
                    event.setCancelled(true);
                }
                break;
            case POWERED_RAIL:
                if (!Config.BLOCK_BREAK_POWEREDRAIL) {
                    event.setCancelled(true);
                }
                break;
            case PUMPKIN:
                if (!Config.BLOCK_BREAK_PUMPKIN) {
                    event.setCancelled(true);
                }
                break;
            case PUMPKIN_STEM:
                if (!Config.BLOCK_BREAK_PUMPKINSTEM) {
                    event.setCancelled(true);
                }
                break;
            case RAILS:
                if (!Config.BLOCK_BREAK_RAILS) {
                    event.setCancelled(true);
                }
                break;
            case REDSTONE_LAMP_OFF:
                if (!Config.BLOCK_BREAK_REDSTONELAMPOFF) {
                    event.setCancelled(true);
                }
                break;
            case REDSTONE_LAMP_ON:
                if (!Config.BLOCK_BREAK_REDSTONELAMPON) {
                    event.setCancelled(true);
                }
                break;
            case REDSTONE_ORE:
                if (!Config.BLOCK_BREAK_REDSTONEORE) {
                    event.setCancelled(true);
                }
                break;
            case REDSTONE_TORCH_OFF:
                if (!Config.BLOCK_BREAK_REDSTONETORCHOFF) {
                    event.setCancelled(true);
                }
                break;
            case REDSTONE_TORCH_ON:
                if (!Config.BLOCK_BREAK_REDSTONETORCHON) {
                    event.setCancelled(true);
                }
                break;
            case REDSTONE_WIRE:
                if (!Config.BLOCK_BREAK_REDSTONEWIRE) {
                    event.setCancelled(true);
                }
                break;
            case RED_MUSHROOM:
                if (!Config.BLOCK_BREAK_REDMUSHROOM) {
                    event.setCancelled(true);
                }
                break;
            case RED_ROSE:
                if (!Config.BLOCK_BREAK_REDROSE) {
                    event.setCancelled(true);
                }
                break;
            case SAND:
                if (!Config.BLOCK_BREAK_SAND) {
                    event.setCancelled(true);
                }
                break;
            case SANDSTONE:
                if (!Config.BLOCK_BREAK_SANDSTONE) {
                    event.setCancelled(true);
                }
                break;
            case SANDSTONE_STAIRS:
                if (!Config.BLOCK_BREAK_SANDSTONESTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case SAPLING:
                if (!Config.BLOCK_BREAK_SAPLING) {
                    event.setCancelled(true);
                }
                break;
            case SIGN_POST:
                if (!Config.BLOCK_BREAK_SIGNPOST) {
                    event.setCancelled(true);
                }
                break;
            case SKULL:
                if (!Config.BLOCK_BREAK_SKULL) {
                    event.setCancelled(true);
                }
                break;
            case SMOOTH_BRICK:
                if (!Config.BLOCK_BREAK_SMOOTHBRICK) {
                    event.setCancelled(true);
                }
                break;
            case SMOOTH_STAIRS:
                if (!Config.BLOCK_BREAK_SMOOTHSTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case SNOW:
                if (!Config.BLOCK_BREAK_SNOW) {
                    event.setCancelled(true);
                }
                break;
            case SNOW_BLOCK:
                if (!Config.BLOCK_BREAK_SNOWBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case SOIL:
                if (!Config.BLOCK_BREAK_SOIL) {
                    event.setCancelled(true);
                }
                break;
            case SOUL_SAND:
                if (!Config.BLOCK_BREAK_SOULSAND) {
                    event.setCancelled(true);
                }
                break;
            case SPONGE:
                if (!Config.BLOCK_BREAK_SPONGE) {
                    event.setCancelled(true);
                }
                break;
            case SPRUCE_WOOD_STAIRS:
                if (!Config.BLOCK_BREAK_SPRUCEWOODSTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case STATIONARY_LAVA:
                if (!Config.BLOCK_BREAK_STATIONARYLAVA) {
                    event.setCancelled(true);
                }
                break;
            case STATIONARY_WATER:
                if (!Config.BLOCK_BREAK_STATIONARYWATER) {
                    event.setCancelled(true);
                }
                break;
            case STEP:
                if (!Config.BLOCK_BREAK_STEP) {
                    event.setCancelled(true);
                }
                break;
            case STONE:
                if (!Config.BLOCK_BREAK_STONE) {
                    event.setCancelled(true);
                }
                break;
            case STONE_BUTTON:
                if (!Config.BLOCK_BREAK_STONEBUTTON) {
                    event.setCancelled(true);
                }
                break;
            case STONE_PLATE:
                if (!Config.BLOCK_BREAK_STONEPLATE) {
                    event.setCancelled(true);
                }
                break;
            case SUGAR_CANE_BLOCK:
                if (!Config.BLOCK_BREAK_SUGARCANEBLOCK) {
                    event.setCancelled(true);
                }
                break;
            case THIN_GLASS:
                if (!Config.BLOCK_BREAK_THINGLASS) {
                    event.setCancelled(true);
                }
                break;
            case TNT:
                if (!Config.BLOCK_BREAK_TNT) {
                    event.setCancelled(true);
                }
                break;
            case TORCH:
                if (!Config.BLOCK_BREAK_TORCH) {
                    event.setCancelled(true);
                }
                break;
            case TRAP_DOOR:
                if (!Config.BLOCK_BREAK_TRAPDOOR) {
                    event.setCancelled(true);
                }
                break;
            case TRIPWIRE:
                if (!Config.BLOCK_BREAK_TRIPWIRE) {
                    event.setCancelled(true);
                }
                break;
            case TRIPWIRE_HOOK:
                if (!Config.BLOCK_BREAK_TRIPWIREHOOK) {
                    event.setCancelled(true);
                }
                break;
            case VINE:
                if (!Config.BLOCK_BREAK_VINE) {
                    event.setCancelled(true);
                }
                break;
            case WALL_SIGN:
                if (!Config.BLOCK_BREAK_WALLSIGN) {
                    event.setCancelled(true);
                }
                break;
            case WATER:
                if (!Config.BLOCK_BREAK_WATER) {
                    event.setCancelled(true);
                }
                break;
            case WATER_LILY:
                if (!Config.BLOCK_BREAK_WATERLILY) {
                    event.setCancelled(true);
                }
                break;
            case WEB:
                if (!Config.BLOCK_BREAK_WEB) {
                    event.setCancelled(true);
                }
                break;
            case WOOD:
                if (!Config.BLOCK_BREAK_WOOD) {
                    event.setCancelled(true);
                }
                break;
            case WOODEN_DOOR:
                if (!Config.BLOCK_BREAK_WOODENDOOR) {
                    event.setCancelled(true);
                }
                break;
            case WOOD_BUTTON:
                if (!Config.BLOCK_BREAK_WOODBUTTON) {
                    event.setCancelled(true);
                }
                break;
            case WOOD_DOUBLE_STEP:
                if (!Config.BLOCK_BREAK_WOODDOUBLESTEP) {
                    event.setCancelled(true);
                }
                break;
            case WOOD_PLATE:
                if (!Config.BLOCK_BREAK_WOODPLATE) {
                    event.setCancelled(true);
                }
                break;
            case WOOD_STAIRS:
                if (!Config.BLOCK_BREAK_WOODSTAIRS) {
                    event.setCancelled(true);
                }
                break;
            case WOOD_STEP:
                if (!Config.BLOCK_BREAK_WOODSTEP) {
                    event.setCancelled(true);
                }
                break;
            case WOOL:
                if (!Config.BLOCK_BREAK_WOOL) {
                    event.setCancelled(true);
                }
                break;
            case WORKBENCH:
                if (!Config.BLOCK_BREAK_WORKBENCH) {
                    event.setCancelled(true);
                }
                break;
            case YELLOW_FLOWER:
                if (!Config.BLOCK_BREAK_YELLOWFLOWER) {
                    event.setCancelled(true);
                }
                break;
            case APPLE:
                break;
            case ARROW:
                break;
            case BAKED_POTATO:
                break;
            case BED:
                break;
            case BLAZE_POWDER:
                break;
            case BLAZE_ROD:
                break;
            case BOAT:
                break;
            case BONE:
                break;
            case BOOK:
                break;
            case BOOK_AND_QUILL:
                break;
            case BOW:
                break;
            case BOWL:
                break;
            case BREAD:
                break;
            case BREWING_STAND_ITEM:
                break;
            case BUCKET:
                break;
            case CAKE:
                break;
            case CARROT_ITEM:
                break;
            case CARROT_STICK:
                break;
            case CAULDRON_ITEM:
                break;
            case CHAINMAIL_BOOTS:
                break;
            case CHAINMAIL_CHESTPLATE:
                break;
            case CHAINMAIL_HELMET:
                break;
            case CHAINMAIL_LEGGINGS:
                break;
            case CLAY_BALL:
                break;
            case CLAY_BRICK:
                break;
            case COAL:
                break;
            case COMPASS:
                break;
            case COOKED_BEEF:
                break;
            case COOKED_CHICKEN:
                break;
            case COOKED_FISH:
                break;
            case COOKIE:
                break;
            case DIAMOND:
                break;
            case DIAMOND_AXE:
                break;
            case DIAMOND_BOOTS:
                break;
            case DIAMOND_CHESTPLATE:
                break;
            case DIAMOND_HELMET:
                break;
            case DIAMOND_HOE:
                break;
            case DIAMOND_LEGGINGS:
                break;
            case DIAMOND_PICKAXE:
                break;
            case DIAMOND_SPADE:
                break;
            case DIAMOND_SWORD:
                break;
            case DIODE:
                break;
            case EGG:
                break;
            case EMERALD:
                break;
            case EMPTY_MAP:
                break;
            case ENDER_PEARL:
                break;
            case EXP_BOTTLE:
                break;
            case EYE_OF_ENDER:
                break;
            case FEATHER:
                break;
            case FERMENTED_SPIDER_EYE:
                break;
            case FIREBALL:
                break;
            case FISHING_ROD:
                break;
            case FLINT:
                break;
            case FLINT_AND_STEEL:
                break;
            case FLOWER_POT_ITEM:
                break;
            case GHAST_TEAR:
                break;
            case GLASS_BOTTLE:
                break;
            case GLOWSTONE_DUST:
                break;
            case GOLDEN_APPLE:
                break;
            case GOLDEN_CARROT:
                break;
            case GOLD_AXE:
                break;
            case GOLD_BOOTS:
                break;
            case GOLD_CHESTPLATE:
                break;
            case GOLD_HELMET:
                break;
            case GOLD_HOE:
                break;
            case GOLD_INGOT:
                break;
            case GOLD_LEGGINGS:
                break;
            case GOLD_NUGGET:
                break;
            case GOLD_PICKAXE:
                break;
            case GOLD_RECORD:
                break;
            case GOLD_SPADE:
                break;
            case GOLD_SWORD:
                break;
            case GREEN_RECORD:
                break;
            case GRILLED_PORK:
                break;
            case INK_SACK:
                break;
            case IRON_AXE:
                break;
            case IRON_BOOTS:
                break;
            case IRON_CHESTPLATE:
                break;
            case IRON_DOOR:
                break;
            case IRON_HELMET:
                break;
            case IRON_HOE:
                break;
            case IRON_INGOT:
                break;
            case IRON_LEGGINGS:
                break;
            case IRON_PICKAXE:
                break;
            case IRON_SPADE:
                break;
            case IRON_SWORD:
                break;
            case ITEM_FRAME:
                break;
            case LAVA_BUCKET:
                break;
            case LEATHER:
                break;
            case LEATHER_BOOTS:
                break;
            case LEATHER_CHESTPLATE:
                break;
            case LEATHER_HELMET:
                break;
            case LEATHER_LEGGINGS:
                break;
            case MAGMA_CREAM:
                break;
            case MAP:
                break;
            case MELON:
                break;
            case MELON_SEEDS:
                break;
            case MILK_BUCKET:
                break;
            case MINECART:
                break;
            case MONSTER_EGG:
                break;
            case MUSHROOM_SOUP:
                break;
            case NETHER_STALK:
                break;
            case NETHER_STAR:
                break;
            case PAINTING:
                break;
            case PAPER:
                break;
            case POISONOUS_POTATO:
                break;
            case PORK:
                break;
            case POTATO_ITEM:
                break;
            case POTION:
                break;
            case POWERED_MINECART:
                break;
            case PUMPKIN_PIE:
                break;
            case PUMPKIN_SEEDS:
                break;
            case RAW_BEEF:
                break;
            case RAW_CHICKEN:
                break;
            case RAW_FISH:
                break;
            case RECORD_10:
                break;
            case RECORD_11:
                break;
            case RECORD_3:
                break;
            case RECORD_4:
                break;
            case RECORD_5:
                break;
            case RECORD_6:
                break;
            case RECORD_7:
                break;
            case RECORD_8:
                break;
            case RECORD_9:
                break;
            case REDSTONE:
                break;
            case ROTTEN_FLESH:
                break;
            case SADDLE:
                break;
            case SEEDS:
                break;
            case SHEARS:
                break;
            case SIGN:
                break;
            case SKULL_ITEM:
                break;
            case SLIME_BALL:
                break;
            case SNOW_BALL:
                break;
            case SPECKLED_MELON:
                break;
            case SPIDER_EYE:
                break;
            case STICK:
                break;
            case STONE_AXE:
                break;
            case STONE_HOE:
                break;
            case STONE_PICKAXE:
                break;
            case STONE_SPADE:
                break;
            case STONE_SWORD:
                break;
            case STORAGE_MINECART:
                break;
            case STRING:
                break;
            case SUGAR:
                break;
            case SUGAR_CANE:
                break;
            case SULPHUR:
                break;
            case WATCH:
                break;
            case WATER_BUCKET:
                break;
            case WHEAT:
                break;
            case WOOD_AXE:
                break;
            case WOOD_DOOR:
                break;
            case WOOD_HOE:
                break;
            case WOOD_PICKAXE:
                break;
            case WOOD_SPADE:
                break;
            case WOOD_SWORD:
                break;
            case WRITTEN_BOOK:
                break;
            default:
                break;
        }
    }
}
