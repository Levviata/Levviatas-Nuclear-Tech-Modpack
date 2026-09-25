import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent
import net.minecraftforge.event.entity.player.PlayerInteractEvent
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import com.hbm.blocks.generic.BlockCrate;
import com.hbm.blocks.generic.BlockCanCrate;
import com.hbm.blocks.generic.BlockSupplyCrate;
import net.minecraft.item.ItemPickaxe;

def masochistHasSeenEnough = 0

// crate info
event_manager.listen { PlayerInteractEvent event ->
   /* if (event.getItemStack() == ItemStack.EMPTY) {
        return;
    }*/
   //log.info("event working")
    log.info(event.getItemStack().getItem().getRegistryName())
    BlockPos pos = event.getPos()

    World world = event.getWorld()
    IBlockState state = world.getBlockState(pos)
    Block block = state.getBlock()

    if (event.getItemStack().getItem().getRegistryName() == resource('hbm:crowbar')) {
        if (block.getRegistryName() == resource("hbm:crate_ammo") || block.getRegistryName() == resource("hbm:crate_jungle")) {
            Minecraft.getMinecraft().ingameGUI.setOverlayMessage(new TextComponentString("Made out of hard bullshit, I need a pickaxe."), false);
        }
    }

    if (block instanceof BlockCrate) {
        if (event.getItemStack().getItem().getRegistryName().toString().contains("pickaxe") && masochistHasSeenEnough <= 30) {
            Minecraft.getMinecraft().ingameGUI.setOverlayMessage( new TextComponentString("No! If I break it without a crowbar I'll lose my goodies."), false);
            masochistHasSeenEnough++
            log.info(masochistHasSeenEnough)
        } else if (event.getItemStack().getItem().getRegistryName().toString().contains("pickaxe") && masochistHasSeenEnough >= 30) {
            Minecraft.getMinecraft().ingameGUI.setOverlayMessage( new TextComponentString("..."), false)
        } else if (event.getItemStack().getItem().getRegistryName() == resource('hbm:crowbar')) {
            return
        } else {
            Minecraft.getMinecraft().ingameGUI.setOverlayMessage( new TextComponentString("I need a crowbar to get the goodies."), false);
        }
    }

    if (block instanceof BlockSupplyCrate || block instanceof BlockCanCrate) {
        if (event.getItemStack().getItem().getRegistryName() == resource('hbm:crowbar')) {
            return
        } else {
            Minecraft.getMinecraft().ingameGUI.setOverlayMessage( new TextComponentString("I need a crowbar to get the goodies."), false);
        }
    }
}
