package zucan.potpourri.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import zucan.potpourri.Potpourri;

public class ItemsRegistry {

    public static final BlockItem STONE_LIGHT_BLOCK = new BlockItem(BlocksRegistry.STONE_LIGHT_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(Potpourri.MOD_ID, "stone_light_block"), STONE_LIGHT_BLOCK);
    }
}