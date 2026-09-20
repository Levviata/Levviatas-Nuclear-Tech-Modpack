import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent
/* doesnt work
event_manager.listen { FurnaceFuelBurnTimeEvent event ->
    def stack = event.getItemStack()

    if (stack == item("hbm:block_scrap")) {
        event.setBurnTime(0)
        log("setting block scrap burn time to 0")
    }

    if (stack == item("hbm:scrap")) {
        event.setBurnTime(0)
        log("setting scrap burn time to 0")
    }
}*/