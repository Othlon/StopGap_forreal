package othlon.stopgap.items;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.Item;

import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import othlon.stopgap.SGConfig;
import othlon.stopgap.blocks.SGFlintBlock;

public class  SGItems {

    public static Item ingotRed;
    public static Item mixRed;
    public static Item ingotGlow;
    public static Item mixGlow;


    public static void registerItems() {
         /* REDSTONE */
        if (SGConfig.canMakeOwnRedstone) {
            String redName = "red";

            ingotRed = new SGIngot(redName);
            GameRegistry.registerItem(ingotRed, "ingotRed");
            OreDictionary.registerOre("ingotRed", ingotRed);

            mixRed = new SGMixture(redName);
            GameRegistry.registerItem(mixRed, "mixRed");
        }

        /* GLOWSTONE */
        if (SGConfig.canMakeOwnGlowstone) {
            String glowName = "glow";

            ingotGlow = new SGIngot(glowName);
            GameRegistry.registerItem(ingotGlow, "ingotGlow");
            OreDictionary.registerOre("ingotGlow", ingotGlow);

            mixGlow = new SGMixture(glowName);
            GameRegistry.registerItem(mixGlow, "mixGlow");
        }// init

    }
}