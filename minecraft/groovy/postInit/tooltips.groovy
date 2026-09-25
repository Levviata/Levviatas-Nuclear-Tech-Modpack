import net.minecraftforge.event.entity.player.ItemTooltipEvent

def slidingblastdoor1 = "Craft with a screwdriver to change variant."
def slidingblastdoor2 = "Has craftable skins."

// here comes the LevviataInc fix.
event_manager.listen { ItemTooltipEvent event ->
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
    if (event.getItemStack() in item('minecraft:spawn_egg').withNbt(['EntityTag': ['id': 'hbm:entity_elder_one']])) {
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
    if (event.getItemStack() in item('hbm:sliding_blast_door_legacy')) {
        event.getToolTip() << slidingblastdoor1
        event.getToolTip() << slidingblastdoor2
    }
    if (event.getItemStack() in item('hbm:sliding_blast_door_2')) {
        event.getToolTip() << slidingblastdoor1
        event.getToolTip() << slidingblastdoor2
    }
    if (event.getItemStack() in item('hbm:crate')) {
        event.getToolTip() << 'Drops (3-5)'
        event.getToolTip() << '- Stimpak (28.57%)'
        event.getToolTip() << '- Antidote (14.29%)'
        event.getToolTip() << '- HE Grenade (22.86%)'
        event.getToolTip() << '- Incendiary Grenade (11.43%)'
        event.getToolTip() << '- HE Stick Grenade (17.14%)'
        event.getToolTip() << '- Ammo Container (5.71%)'
    }
    if (event.getItemStack() in item('hbm:crate_weapon')) {
        event.getToolTip() << 'Drops (1-2. 1% for 25)'
        event.getToolTip() << '- Break-Action Revolver (26.32%)'
        event.getToolTip() << "- Lever Action Shotgun (18.42%)"
        event.getToolTip() << '- Heavy Revolver (13.16%)'
        event.getToolTip() << '- Grease Gun (13.16%)'
        event.getToolTip() << '- Liberator (5.26%)'
        event.getToolTip() << '- Flare Gun (21.05%)'
        event.getToolTip() << '- Panzerschreck (2.63%)'
    }
    if (event.getItemStack() in item('hbm:crate_lead')) {
        event.getToolTip() << 'Drops (3-5)'
        event.getToolTip() << '- Uranium Ingot (5.62%)'
        event.getToolTip() << '- U-238 Ingot (4.49%)'
        event.getToolTip() << '- Plutonium Ingot (3.93%)'
        event.getToolTip() << '- Pu-240 Ingot (3.37%)'
        event.getToolTip() << '- Neptunium Ingot (3.93%)'
        event.getToolTip() << '- Uranium Fuel Ingot (4.49%)'
        event.getToolTip() << '- Plutonium Fuel Ingot (3.93%)'
        event.getToolTip() << '- MOX Fuel Ingot (3.37%)'
        event.getToolTip() << '- Uranium Nugget (5.62%)'
        event.getToolTip() << '- U-238 Nugget (4.49%)'
        event.getToolTip() << '- Plutonium Nugget (3.93%)'
        event.getToolTip() << '- Pu-240 Nugget (3.37%)'
        event.getToolTip() << '- Neptunium Nugget (3.93%)'
        event.getToolTip() << '- Uranium Fuel Nugget (4.49%)'
        event.getToolTip() << '- Plutonium Fuel Nugget (3.93%)'
        event.getToolTip() << '- MOX Fuel Nugget (3.37%)'
        event.getToolTip() << '- Deuterium Cell (4.49%)'
        event.getToolTip() << '- Tritium Cell (4.49%)'
        event.getToolTip() << '- UF6 Cell (4.49%)'
        event.getToolTip() << '- PUF6 Cell (4.49%)'
        event.getToolTip() << '- RTG Pellet (3.37%)'
        event.getToolTip() << '- Weak RTG Pellet (3.93%)'
        event.getToolTip() << '- Tritium-Deuterium Cake (2.81%)'
        event.getToolTip() << '- Yellowcake Powder (5.62%)'
    }
    if (event.getItemStack() in item('hbm:crate_metal')) {
        event.getToolTip() << 'Drops (3-5)'
        event.getToolTip() << '- Burner Press (7.81%)'
        event.getToolTip() << '- Breeding Reactor (4.69%)'
        event.getToolTip() << '- Wood-Burning Generator (7.81%)'
        event.getToolTip() << '- Diesel Generator (6.25%)'
        event.getToolTip() << '- RT Generator (3.12%)'
        event.getToolTip() << '- Electricity Pylon (7.03%)'
        event.getToolTip() << '- Energy Storage Block (6.25%)'
        event.getToolTip() << '- Li-Ion Energy Storage Block (3.91%)'
        event.getToolTip() << '- Electric Furnace (6.25%)'
        event.getToolTip() << '- Assembly Machine (7.81%)'
        event.getToolTip() << '- Tank (5.47%)'
        event.getToolTip() << '- Centrifuge Element (4.69%)'
        event.getToolTip() << '- Motor (6.25%)'
        event.getToolTip() << '- Heating Coil (5.47%)'
        event.getToolTip() << '- Photovoltaic Panel (2.34%)'
        event.getToolTip() << '- Copper Coil (7.81%)'
        event.getToolTip() << '- Titanium Blade (2.34%)'
        event.getToolTip() << '- Combustion Engine Piston (4.69%)'
    }
}
log.info("Loaded tooltips!")