import net.minecraftforge.event.entity.player.ItemTooltipEvent

def deprecatedNotice = '(LEGACY)'
// More than once that I see an item that has no use and that has been deprecated, but it is not declared.
// here comes the LevviataInc fix.
event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('hbm:hadron_coil_mese')) {
        event.getToolTip() << deprecatedNotice
    }
    if (event.getItemStack() in item('hbm:template_folder')) {
        event.getToolTip() << deprecatedNotice
    }
    if (event.getItemStack() in item('hbm:machine_fensu')) {
        event.getToolTip() << deprecatedNotice
    }
}