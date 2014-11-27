package othlon.stopgap.items;

import net.minecraft.item.Item;
import othlon.stopgap.StopGap;

public class SGMixture extends Item {

    public SGMixture(String name){
        this.setCreativeTab(StopGap.getCreativeTab());
        this.setUnlocalizedName(name+" mixture");
        this.setTextureName("stopgap:"+name+"_mix");
    }
}
