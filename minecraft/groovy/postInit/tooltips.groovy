import net.minecraftforge.event.entity.player.ItemTooltipEvent

def deprecatedNotice = '(LEGACY)'
// More than once I see an item that has no use that has been deprecated without the "(LEGACY)".
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
    if (event.getItemStack() in item('hbm:rad_absorber')) { // cant remove that special § letter from the tooltip, lame
        event.getToolTip() << "§e Removes radiation from the current chunk."
        event.getToolTip() << "§e -5 chunk rad / second"
    }
    if (event.getItemStack() in item('hbm:rad_absorber:1')) {
        event.getToolTip() << "§e Removes radiation from the current chunk."
        event.getToolTip() << "§e -20 chunk rad / second"
    }
    if (event.getItemStack() in item('hbm:rad_absorber:2')) {
        event.getToolTip() << "§e Removes radiation from the current chunk."
        event.getToolTip() << "§e -200 chunk rad / second"
    }
    if (event.getItemStack() in item('hbm:rad_absorber:3')) {
        event.getToolTip() << "§e Removes radiation from the current chunk."
        event.getToolTip() << "§e -20000 chunk rad / second"
    }
    if (event.getItemStack() in item('hbm:muffler')) {
        event.getToolTip() << "§e Probably useless."
    }
}