import net.minecraftforge.event.entity.player.ItemTooltipEvent

@groovy.transform.Field def tooltipMap = [:]

event_manager.listen { ItemTooltipEvent event ->
    for (def entry in tooltipMap) { // iterate tooltip map
        if (event.getItemStack() in entry.key) { // if the item in the event matches the map entry
            event.getToolTip().add(4, entry.value)    // add the line of the map entry
        }
    }
}

def addTooltip(ItemStack itemStack, String line) {
    tooltipMap[itemStack] = line // store item and line in map
}

addTooltip(item('minecraft:coal'), '&e8 Operations')