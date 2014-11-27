package othlon.stopgap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class SGTab extends CreativeTabs{

    public SGTab(int id, String modid)
    {
        super(id, modid);

    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks.redstone_block);
    }
}
