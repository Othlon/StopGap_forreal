package othlon.stopgap.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by Jen on 27/11/2014.
 */
public class SGBlocks {

    public static Block blockFlint;

    public static void registerBlocks(){

        blockFlint = new SGFlintBlock();
        GameRegistry.registerBlock(blockFlint, "BlockFlint");
    }
}
