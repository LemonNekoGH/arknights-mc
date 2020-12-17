package moe.lemonneko.mcmods.arknightsmc;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ArknightsMC.MODID)
public class ArknightsMC {
    public static final String MODID = "arknights_mc";

    private static final Logger LOGGER = LogManager.getLogger(ArknightsMC.class);

    static {
        LOGGER.info("class with name {} loaded by class loader {}", ArknightsMC.class.getName(), ArknightsMC.class.getClassLoader().getClass().getName());
    }

    public ArknightsMC() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    /**
     * Do something when server starting event dispatched.
     *
     * @param event server starting event
     */
    @SubscribeEvent
    public void onServerStarting(final FMLServerStartingEvent event) {
        LOGGER.info("server starting...");
    }

    /**
     * Do something when client setup event dispatched.
     *
     * @param event client setup event
     */
    @SubscribeEvent
    public void onClientStarting(final FMLClientSetupEvent event) {
        LOGGER.info("client setting up");
    }
}
