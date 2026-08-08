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
    if (event.getItemStack() in item('hbm:machine_bat9000')) {
        event.getToolTip() << deprecatedNotice
    }
    if (event.getItemStack() in item('hbm:rad_absorber')) { // cant remove that special § letter from the tooltip, lame
        event.getToolTip() << 'Removes radiation from the current chunk.'
        event.getToolTip() << '-5 chunk rad / second'
    }
    if (event.getItemStack() in item('hbm:rad_absorber:1')) {
        event.getToolTip() << 'Removes radiation from the current chunk.'
        event.getToolTip() << '-20 chunk rad / second'
    }
    if (event.getItemStack() in item('hbm:rad_absorber:2')) {
        event.getToolTip() << 'Removes radiation from the current chunk.'
        event.getToolTip() << '-200 chunk rad / second'
    }
    if (event.getItemStack() in item('hbm:rad_absorber:3')) {
        event.getToolTip() << 'Removes radiation from the current chunk.'
        event.getToolTip() << '-20000 chunk rad / second'
    }
    if (event.getItemStack() in item('hbm:muffler')) {
        event.getToolTip() << '(Probably useless).'
    }
    if (event.getItemStack() in item('hbm:redstone_sword')) {
        event.getToolTip() << 'Modified stats'
    }
    if (event.getItemStack() in item('hbm:big_sword')) {
        event.getToolTip() << 'Modified stats'
    }
    if (event.getItemStack() in item('hbm:steel_sword')) {
        event.getToolTip() << 'Modified stats'
    }
    if (event.getItemStack() in item('hbm:ore_nether_plutonium')) {
        event.getToolTip() << 'Disabled by default.'
    }
    if (event.getItemStack() in item('hbm:machine_drain')) { // i keep searching it as venting pipe so im adding it.
        event.getToolTip() << '(a.k.a Venting Pipe)'
    }
    if (event.getItemStack() in item('minecraft:spawn_egg').withNbt(['EntityTag': ['id': 'hbm:entity_elder_one']])) { // i keep searching it as venting pipe so im adding it.
        event.getToolTip() << '§c Will not die no matter what. Genuinely.'
        event.getToolTip() << 'But why would you try to kill quackos?'
    }
}