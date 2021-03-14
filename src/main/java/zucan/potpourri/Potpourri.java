package zucan.potpourri;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zucan.potpourri.registry.BlocksRegistry;
import zucan.potpourri.registry.ItemsRegistry;

public class Potpourri implements ModInitializer {

    public static final String MOD_ID = "potpourri";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        BlocksRegistry.init();
        ItemsRegistry.init();

        LOGGER.info("[Potpourri] Initialized.");
    }
}