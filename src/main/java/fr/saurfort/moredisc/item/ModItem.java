package fr.saurfort.moredisc.item;

import fr.saurfort.moredisc.ModTabs;
import fr.saurfort.moredisc.MoreDisc;
import fr.saurfort.moredisc.Reference;
import fr.saurfort.moredisc.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> DISC = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
    // NCS
        // Everen Maxwell
    public static final RegistryObject<Item> BOT_FIGHT = DISC.register("bot_fight", () -> new RecordItem(4, ModSounds.BOT_FIGHT, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.RARE)));

        // JJD & Division One
    public static final RegistryObject<Item> SOMEBODY_LIKE_ME = DISC.register("somebody_like_me", () -> new RecordItem(4, ModSounds.SOMEBODY_LIKE_ME, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.RARE)));

        //  Lost Sky x She Is Jules
    public static final RegistryObject<Item> DARKNESS = DISC.register("darkness", () -> new RecordItem(4, ModSounds.DARKNESS, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.EPIC)));

        // TheFatRat & Maisy Kay
    public static final RegistryObject<Item> THE_STORM = DISC.register("the_storm", () -> new RecordItem(4, ModSounds.THE_STORM, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.RARE)));

        // Unknown Brain
    public static final RegistryObject<Item> WHY_DO_I = DISC.register("why_do_i", () -> new RecordItem(4, ModSounds.WHY_DO_I, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.RARE)));

        // Alexion300
    public static final RegistryObject<Item> MARIO_THEME = DISC.register("mario_theme_song", () -> new RecordItem(4, ModSounds.MARIO_THEME, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> JINGLE_BELL = DISC.register("jingle_bell", () -> new RecordItem(4, ModSounds.JINGLE_BELL, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GRAVITY_FALLS = DISC.register("gravity_falls", () -> new RecordItem(4, ModSounds.GRAVITY_FALLS, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.EPIC)));

        // Minecraft
    public static final RegistryObject<Item> MINECON_22 = DISC.register("minecon_22", () -> new RecordItem(4, ModSounds.MINECON_22, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.RARE)));

        // YouTube
    public static final RegistryObject<Item> ONE_TRILLION = DISC.register("one_trillion", () -> new RecordItem(4, ModSounds.ONE_TRILLION, new Item.Properties().tab(ModTabs.NoCopyrightSound).stacksTo(1).rarity(Rarity.EPIC)));


    // CS
        // Fuze III
    public static final RegistryObject<Item> ON_APPEL_FUZE = DISC.register("on_mappel_fuze", () -> new RecordItem(4, ModSounds.ON_APPEL_FUZE, new Item.Properties().tab(ModTabs.CopyrightSound).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ROULETTE_PALADIENNES = DISC.register("roulette_paladienne", () -> new RecordItem(4, ModSounds.ROULETTE_PALADIENNES, new Item.Properties().tab(ModTabs.CopyrightSound).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> MII_CHALLENGE = DISC.register("mii_challenge", () -> new RecordItem(4, ModSounds.MII_CHALLENGE, new Item.Properties().tab(ModTabs.CopyrightSound).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ANTI_FUZE = DISC.register("anti-fuze", () -> new RecordItem(4, ModSounds.ANTI_FUZE, new Item.Properties().tab(ModTabs.CopyrightSound).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> KUMIZ = DISC.register("clash_kumiz", () -> new RecordItem(4, ModSounds.KUMIZ, new Item.Properties().tab(ModTabs.CopyrightSound).stacksTo(1).rarity(Rarity.RARE)));

        // Tai & Sacha
    public static final RegistryObject<Item> UNIVERS_SORA = DISC.register("univers_sora", () -> new RecordItem(4, ModSounds.UNIVERS_SORA, new Item.Properties().tab(ModTabs.CopyrightSound).stacksTo(1).rarity(Rarity.EPIC)));

        // Deo Toons
    public static final RegistryObject<Item> CHAUSSURES_ROUGES = DISC.register("chaussures_rouges", () -> new RecordItem(4, ModSounds.CHAUSSURES_ROUGES, new Item.Properties().tab(ModTabs.CopyrightSound).stacksTo(1).rarity(Rarity.RARE)));

        // Sheet Music Boss
    public static final RegistryObject<Item> RUSH_E = DISC.register("rush-e", () -> new RecordItem(4, ModSounds.RUSH_E, new Item.Properties().tab(ModTabs.CopyrightSound).stacksTo(1).rarity(Rarity.EPIC)));


    public static void register(IEventBus eventBus) {
        DISC.register(eventBus);
    }
}
