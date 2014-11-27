package othlon.stopgap.items;

import net.minecraft.item.Item;
import othlon.stopgap.StopGap;

public class SGIngot extends Item{

    public SGIngot(String name){
        this.setCreativeTab(StopGap.getCreativeTab());
        this.setUnlocalizedName(name+" ingot");
        this.setTextureName("stopgap:"+name+"_ingot");
    }

}
