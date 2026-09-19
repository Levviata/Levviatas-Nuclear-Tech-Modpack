import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent

event_manager.listen { FurnaceFuelBurnTimeEvent event ->
    if (event.getItemStack().getItem() == item("hbm:block_scrap")) {
        event.setBurnTime(0)
    }
    if (event.getItemStack().getItem() == item("hbm:scrap")) {
        event.setBurnTime(0)
    }
}