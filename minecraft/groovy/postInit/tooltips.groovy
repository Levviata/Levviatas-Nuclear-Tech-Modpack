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
        event.getToolTip() << 'Venting Pipe'
    }
    if (event.getItemStack() in item('minecraft:spawn_egg').withNbt(['EntityTag': ['id': 'hbm:entity_elder_one']])) { // i keep searching it as venting pipe so im adding it.
        event.getToolTip() << '§c Will not die no matter what. Genuinely.'
        event.getToolTip() << 'But why would you try to kill Quackos?'
    }
    if (event.getItemStack() in item('hbm:mass_storage_wood')) {
        event.getToolTip() << 'Tier: 1 / 4'
        event.getToolTip() << 'Capacity: 1000 items'
    }
    if (event.getItemStack() in item('hbm:mass_storage_iron')) {
        event.getToolTip() << 'Tier: 2 / 4'
        event.getToolTip() << 'Capacity: 10000 items'
    }
    if (event.getItemStack() in item('hbm:mass_storage_desh')) {
        event.getToolTip() << 'Tier: 3 / 4'
        event.getToolTip() << 'Capacity: 100.000 items'
    }
    if (event.getItemStack() in item('hbm:mass_storage')) {
        event.getToolTip() << 'Tier: 4 / 4'
        event.getToolTip() << 'Capacity: 1.000.000 items'
    }
    if (event.getItemStack().getTagCompound()?.hasKey('KEY_MOD_LIST_0')) {
        int[] values = event.getItemStack().getTagCompound()?.getIntArray("KEY_MOD_LIST_0");
        def dieselEngine = 226
        def aviationEngine = 227
        def turboEngine = 229
        for (int i : values) { // this is cool as shit
            if (i == dieselEngine)
            {
                event.getToolTip() << 'Fuels:'
                event.getToolTip() << '- Diesel'
                event.getToolTip() << '- Cracked Diesel'
                event.getToolTip() << '- Light Oil'
            }
            if (i == aviationEngine)
            {
                event.getToolTip() << 'Fuels:'
                event.getToolTip() << '- Kerosene'
                event.getToolTip() << '- LPG'
            }
            if (i == turboEngine)
            {
                event.getToolTip() << 'Fuels:'
                event.getToolTip() << '- Jet Fuel'
                event.getToolTip() << '- Reformate'
            }
        }
    } else if (event.getItemStack() in item('hbm:gun_drill')) { // normal
        event.getToolTip() << 'Fuels:'
        event.getToolTip() << '- Gasoline'
        event.getToolTip() << '- Leaded Gasoline'
        event.getToolTip() << '- Coal Gasoline'
        event.getToolTip() << '- Leaded Coal Gasoline'
    }
    if (event.getItemStack() in item('hbm:hand_drill')) {
        event.getToolTip() << 'Hand Screw'
    }
    if (event.getItemStack() in item('hbm:hand_drill_desh')) {
        event.getToolTip() << 'Desh Hand Screw'
    }
    if (event.getItemStack() in item('hbm:mp_warhead_15_volcano')) {
        event.getToolTip() << "Doesn't explode as it lacks code."
        event.getToolTip() << "Use Tectonic Missile."
    }
}
log.info("Loaded tooltips!")