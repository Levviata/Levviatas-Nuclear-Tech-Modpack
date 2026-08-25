def recipeCount = 0;
def replacedCount = 0;
def removedCount = 0;
def documented = 0;
def hbmRecipes = 15;


crafting.addShapeless(item('hbm:ball_fireclay'), [item('minecraft:clay_ball'), item('minecraft:clay_ball'), item('minecraft:clay_ball'), item('hbm:ingot_aluminium')])
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:lung_diagnostic'))
        .row('ABB')
        .row('CDE')
        .row('CFG')
        .key('A', item('hbm:ingot_copper'))
        .key('B', item('minecraft:iron_ingot'))
        .key('C', item('hbm:wire_fine:2900'))
        .key('D', item('hbm:circuit:7'))
        .key('E', item('hbm:ingot_steel'))
        .key('F', item('hbm:powder_coal'))
        .key('G', item('hbm:powder_asbestos'))
        .register()
recipeCount++
documented++

// renewable balefire. Why? why not
crafting.shapedBuilder()
        .output(item('hbm:egg_balefire_shard'))
        .row('BBB')
        .row('CAC')
        .row('BBB')
        .key('A', item('hbm:powder_magic'))
        .key('B', item('hbm:gem_rad'))
        .key('C', item('minecraft:bone'))
        .register()
recipeCount++
documented++


crafting.shapedBuilder()
        .name(resource('hbm:ashglasses'))
        .output(item('hbm:ashglasses'))
        .row('A A')
        .row('BCB')
        .key('A', ore('ingotAnyRubber'))
        .key('B', ore('blockGlassBlack'))
        .key('C', ore('ingotAnyPlastic'))
        .replaceByName()
        .register()
replacedCount++
documented++

/* its good but i want players to be forced to use universal buckets
crafting.shapedBuilder()
        .output(item('hbm:press_preheater'))
        .row('AAA')
        .row('BCB')
        .row('DBD')
        .key('A', item('hbm:plate_copper'))
        .key('B', item('minecraft:stone:*'))
        .key('C', item('minecraft:lava_bucket').transform(item('minecraft:bucket')))
        .key('D', item('hbm:ingot_tungsten'))
        .register()
*/
crafting.shapedBuilder()
        .name(resource('hbm:machine_ammo_press'))
        .output(item('hbm:machine_ammo_press'))
        .row('TPT')
        .row('S S')
        .row('BBB')
        .key('T', item('hbm:ingot_tungsten'))
        .key('P', item('minecraft:piston'))
        .key('S', item('hbm:plate_titanium'))
        .key('B', item('minecraft:stonebrick:*'))
        .replaceByName()
        .register()
replacedCount++
documented++

crafting.shapedBuilder()
        .name(resource('refinedstorage:writer'))
        .output(item('refinedstorage:writer'))
        .row('ABA')
        .row('CDC')
        .row('AEA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:core'))
        .key('C', item('minecraft:redstone'))
        .key('D', item('refinedstorage:cable'))
        .key('E', item('refinedstorage:processor', 5))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:wrench'))
        .output(item('refinedstorage:wrench'))
        .row('ABA')
        .row('AAA')
        .row(' A ')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:processor', 3))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:wireless_transmitter'))
        .output(item('refinedstorage:wireless_transmitter'))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:ender_pearl'))
        .key('C', item('hbm:cm_block'))
        .key('D', item('refinedstorage:processor', 5))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:wireless_grid'))
        .output(item('refinedstorage:wireless_grid').withNbt([Energy: 3200]))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', ore('batteryAnySelfCharging'))
        .key('C', item('refinedstorage:grid'))
        .key('D', item('refinedstorage:processor', 5))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:wireless_crafting_monitor'))
        .output(item('refinedstorage:wireless_crafting_monitor'))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', ore('batteryAnySelfCharging'))
        .key('C', item('refinedstorage:crafting_monitor'))
        .key('D', item('refinedstorage:processor', 5))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:upgrade'))
        .output(item('refinedstorage:upgrade'))
        .row('ABA')
        .row('DCD')
        .row('ABA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('hbm:glass_uranium'))
        .key('C', item('refinedstorage:processor', 5))
        .key('D', ore('ingotAnyResistantAlloy'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:storage_monitor'))
        .output(item('refinedstorage:storage_monitor'))
        .row('ABC')
        .row('DEC')
        .row('AFC')
        .key('A', item('refinedstorage:processor', 3))
        .key('B', item('refinedstorage:core'))
        .key('C', item('hbm:glass_lead'))
        .key('D', item('hbm:ingot_steel'))
        .key('E', item('hbm:cm_block'))
        .key('F', item('refinedstorage:core', 1))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:storage_housing'))
        .output(item('refinedstorage:storage_housing'))
        .row('ABA')
        .row('D D')
        .row('CCC')
        .key('A', item('hbm:glass_uranium'))
        .key('D', ore('ingotAnyPlastic'))
        .key('C', ore('ingotAnyResistantAlloy'))
        .key('B', item('hbm:circuit:9'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:stack_upgrade'))
        .output(item('refinedstorage:upgrade', 4))
        .row('ABA')
        .row('BAB')
        .row('ABA')
        .key('A', item('minecraft:sugar'))
        .key('B', item('refinedstorage:upgrade', 2))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:speed_upgrade'))
        .output(item('refinedstorage:upgrade', 2))
        .row('ABA')
        .row('BCB')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:sugar'))
        .key('C', item('refinedstorage:upgrade'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:security_manager'))
        .output(item('refinedstorage:security_manager'))
        .row('ABA')
        .row('CDC')
        .row('ACA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', ore('chest'))
        .key('C', item('refinedstorage:security_card'))
        .key('D', item('hbm:cm_block'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:security_card'))
        .output(item('refinedstorage:security_card'))
        .row('AAA')
        .row('BCB')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:network_card'))
        .key('C', item('refinedstorage:processor', 4))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:reader'))
        .output(item('refinedstorage:reader'))
        .row('ABA')
        .row('CDC')
        .row('AEA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:core', 1))
        .key('C', item('minecraft:redstone'))
        .key('D', item('refinedstorage:cable'))
        .key('E', item('refinedstorage:processor', 5))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:range_upgrade'))
        .output(item('refinedstorage:upgrade', 1))
        .row('ABA')
        .row('BCB')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', ore('enderpearl'))
        .key('C', item('refinedstorage:upgrade'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:processor_binding'))
        .output(item('refinedstorage:processor_binding') * 8)
        .row('   ')
        .row('ABA')
        .row('   ')
        .key('A', item('minecraft:string'))
        .key('B', ore('slimeball'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:portable_grid'))
        .output(item('refinedstorage:portable_grid').withNbt([Energy: 3200]))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('C', item('refinedstorage:grid'))
        .key('B', ore("batteryAnySelfCharging"))
        .key('D', item('refinedstorage:processor:4'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:pattern'))
        .output(item('refinedstorage:pattern'))
        .row('AGA')
        .row('BAB')
        .row('CCC')
        .key('A', item('hbm:glass_lead'))
        .key('B', ore('ingotAnyRubber'))
        .key('C', item('hbm:ingot_steel'))
        .key('G', item('hbm:circuit:7'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:network_transmitter'))
        .output(item('refinedstorage:network_transmitter'))
        .row('AAA')
        .row('BCD')
        .row('EEE')
        .key('A', item('minecraft:ender_pearl'))
        .key('B', item('refinedstorage:core'))
        .key('C', item('hbm:cm_block'))
        .key('D', item('refinedstorage:core', 1))
        .key('E', item('refinedstorage:processor', 5))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:network_receiver'))
        .output(item('refinedstorage:network_receiver'))
        .row('AAA')
        .row('BCD')
        .row('EEE')
        .key('A', item('refinedstorage:processor', 5))
        .key('B', item('refinedstorage:core'))
        .key('C', item('hbm:cm_block'))
        .key('D', item('refinedstorage:core', 1))
        .key('E', item('minecraft:ender_pearl'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:network_card'))
        .output(item('refinedstorage:network_card'))
        .row('AAA')
        .row('BCB')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:paper'))
        .key('C', item('refinedstorage:processor:4'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:interface'))
        .output(item('refinedstorage:interface'))
        .row('ABA')
        .row('CDC')
        .row('AEA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:importer'))
        .key('C', item('minecraft:redstone'))
        .key('D', item('hbm:cm_block'))
        .key('E', item('refinedstorage:exporter'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:grid'))
        .output(item('refinedstorage:grid'))
        .row('ABC')
        .row('DEC')
        .row('AFC')
        .key('A', item('refinedstorage:processor:3'))
        .key('B', item('refinedstorage:core'))
        .key('C', item('hbm:glass_lead'))
        .key('D', item('hbm:ingot_steel'))
        .key('E', item('hbm:cm_block'))
        .key('F', item('refinedstorage:core:1'))
        .replaceByName()
        .register()
replacedCount++

crafting.replaceShapeless(item('refinedstorage:grid:1'), [item('refinedstorage:grid'), item('refinedstorage:processor:3'), item('minecraft:crafting_table')])
crafting.replaceShapeless(item('refinedstorage:grid:2'), [item('refinedstorage:grid'), item('refinedstorage:processor:3'), item('refinedstorage:pattern')])
replacedCount++
replacedCount++

crafting.replaceShapeless(item('refinedstorage:core'), [item('refinedstorage:processor:3'), item('hbm:powder_magic')])
crafting.replaceShapeless(item('refinedstorage:core:1'), [item('refinedstorage:processor:3'), ore('dustAnyPropellant')])
replacedCount++
replacedCount++


crafting.shapedBuilder()
        .name(resource('refinedstorage:filter'))
        .output(item('refinedstorage:filter'))
        .row('ABA')
        .row('BCB')
        .row('ABA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:paper'))
        .key('C', item('minecraft:hopper'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:external_storage'))
        .output(item('refinedstorage:external_storage'))
        .row('ABC')
        .row('DED')
        .row('BFB')
        .key('A', item('refinedstorage:core'))
        .key('B', item('hbm:ingot_steel'))
        .key('C', item('refinedstorage:core:1'))
        .key('D', ore('chest'))
        .key('E', item('refinedstorage:cable'))
        .key('F', item('refinedstorage:processor:4'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:disk_manipulator'))
        .output(item('refinedstorage:disk_manipulator'))
        .row('ABA')
        .row('CDE')
        .row('ABA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:storage_housing'))
        .key('C', item('refinedstorage:core'))
        .key('D', item('hbm:cm_block'))
        .key('E', item('refinedstorage:core:1'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:disk_drive'))
        .output(item('refinedstorage:disk_drive'))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', ore('chest'))
        .key('C', item('hbm:cm_block'))
        .key('D', item('refinedstorage:processor:5'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:detector'))
        .output(item('refinedstorage:detector'))
        .row('ABA')
        .row('CDC')
        .row('AEA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:redstone_torch'))
        .key('C', item('minecraft:comparator'))
        .key('D', item('hbm:cm_block'))
        .key('E', item('refinedstorage:processor:4'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:destructor'))
        .output(item('refinedstorage:destructor'))
        .row('ABA')
        .row('CDC')
        .row('AEA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:core:1'))
        .key('C', item('minecraft:redstone'))
        .key('D', item('refinedstorage:cable'))
        .key('E', item('refinedstorage:processor:4'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:cutting_tool'))
        .output(item('refinedstorage:cutting_tool'))
        .row('  A')
        .row(' B ')
        .row('B  ')
        .key('A', item('hbm:ingot_steel'))
        .key('B', ore('stickWood'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:crafting_upgrade'))
        .output(item('refinedstorage:upgrade:3'))
        .row('ABA')
        .row('CDC')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:core'))
        .key('C', ore('workbench'))
        .key('D', item('refinedstorage:upgrade'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:crafting_monitor'))
        .output(item('refinedstorage:crafting_monitor'))
        .row('ABC')
        .row('DEC')
        .row('ABC')
        .key('A', item('refinedstorage:processor:3'))
        .key('B', item('refinedstorage:pattern'))
        .key('C', item('hbm:glass_lead'))
        .key('D', item('hbm:ingot_steel'))
        .key('E', item('hbm:cm_block'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:crafter_manager'))
        .output(item('refinedstorage:crafter_manager'))
        .row('ABC')
        .row('DEC')
        .row('ABC')
        .key('A', item('refinedstorage:processor:3'))
        .key('B', item('refinedstorage:crafter'))
        .key('C', item('hbm:glass_lead'))
        .key('D', item('hbm:ingot_steel'))
        .key('E', item('hbm:cm_block'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:crafter'))
        .output(item('refinedstorage:crafter'))
        .row('ABA')
        .row('CDC')
        .row('AEA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:core'))
        .key('C', item('refinedstorage:processor:3'))
        .key('D', item('hbm:cm_block'))
        .key('E', item('refinedstorage:core:1'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:controller'))
        .output(item('refinedstorage:controller'))
        .row('ABA')
        .row('CDC')
        .row('ANA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:processor:3'))
        .key('C', ore('ingotAnyRubber'))
        .key('D', item('hbm:cm_block'))
        .key('N', item('hbm:battery_pack:6'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:constructor'))
        .output(item('refinedstorage:constructor'))
        .row('ABA')
        .row('CDC')
        .row('AEA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:core'))
        .key('C', item('minecraft:redstone'))
        .key('D', item('refinedstorage:cable'))
        .key('E', item('refinedstorage:processor:4'))
        .replaceByName()
        .register()
replacedCount++

crafting.replaceShapeless(item('refinedstorage:relay'), [item('hbm:cm_block'), item('refinedstorage:cable'), item('minecraft:redstone_torch')])
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:cable'))
        .output(item('refinedstorage:cable') * 12)
        .row(' A ')
        .row('B B')
        .row(' A ')
        .key('A', item('hbm:plate_steel'))
        .key('B', item('hbm:glass_lead'))
        //.key('C', item('hbm:ingot_red_copper'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:64k_storage_part'))
        .output(item('refinedstorage:storage_part:3'))
        .row('ABA')
        .row('CDC')
        .row('ACA')
        .key('A', item('refinedstorage:processor:5'))
        .key('B', ore('ingotAnyBismoidBronze'))
        .key('C', item('refinedstorage:storage_part:2'))
        .key('D', item('hbm:circuit:11'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('hbm:conveyor_wand_1'))
        .output(item('hbm:conveyor_wand') * 32)
        .row('RPR')
        .row('I I')
        .row('RPR')
        .key('R', item('hbm:plant_item:1'))
        .key('P', item('hbm:plate_iron'))
        .key('I', item('minecraft:iron_ingot'))
        .replaceByName()
        .register()
replacedCount++
documented++

crafting.shapedBuilder()
        .name(resource('hbm:conveyor_wand_2'))
        .output(item('hbm:conveyor_wand') * 64)
        .row('RPR')
        .row('I I')
        .row('RPR')
        .key('R', ore('ingotAnyRubber'))
        .key('P', item('hbm:plate_iron'))
        .key('I', item('minecraft:iron_ingot'))
        .replaceByName()
        .register()
replacedCount++
documented++

crafting.shapedBuilder()
        .name(resource('refinedstorage:64k_storage_disk'))
        .output(item('refinedstorage:storage_disk:3'))
        .row('ABA')
        .row('DMD')
        .row('CCC')
        .key('A', item('hbm:glass_uranium'))
        .key('D', ore('ingotAnyPlastic'))
        .key('C', ore('ingotAnyResistantAlloy'))
        .key('B', item('hbm:circuit:9'))
        .key('M', item('refinedstorage:storage_part:3'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:64k_storage_block'))
        .output(item('refinedstorage:storage:3'))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:storage_part:3'))
        .key('C', item('hbm:cm_block:1'))
        .key('D', item('hbm:cm_circuit:3'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:4k_storage_part'))
        .output(item('refinedstorage:storage_part:1'))
        .row('ABA')
        .row('CDC')
        .row('ACA')
        .key('A', item('refinedstorage:processor:3'))
        .key('B', item('hbm:ingot_desh'))
        .key('C', item('refinedstorage:storage_part'))
        .key('D', item('hbm:circuit:8'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:4k_storage_disk'))
        .output(item('refinedstorage:storage_disk:1'))
        .row('ABA')
        .row('DMD')
        .row('CCC')
        .key('A', item('hbm:glass_uranium'))
        .key('D', ore('ingotAnyPlastic'))
        .key('C', ore('ingotAnyResistantAlloy'))
        .key('B', item('hbm:circuit:9'))
        .key('M', item('refinedstorage:storage_part:1'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:4k_storage_block'))
        .output(item('refinedstorage:storage:1'))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:storage_part:1'))
        .key('C', item('hbm:cm_block:2'))
        .key('D', item('hbm:cm_circuit:1'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:1k_storage_part'))
        .output(item('refinedstorage:storage_part'))
        .row('ABA')
        .row('CDC')
        .row('ACA')
        .key('A', ore('ingotAnyRubber'))
        .key('B', item('hbm:ingot_steel'))
        .key('C', item('hbm:glass_lead'))
        .key('D', item('hbm:circuit:7'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:1k_storage_disk'))
        .output(item('refinedstorage:storage_disk'))
        .row('ABA')
        .row('DMD')
        .row('CCC')
        .key('A', item('hbm:glass_uranium'))
        .key('D', ore('ingotAnyPlastic'))
        .key('C', ore('ingotAnyResistantAlloy'))
        .key('B', item('hbm:circuit:9'))
        .key('M', item('refinedstorage:storage_part'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:1k_storage_block'))
        .output(item('refinedstorage:storage'))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:storage_part'))
        .key('C', item('hbm:cm_block'))
        .key('D', item('hbm:cm_circuit'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:16k_storage_part'))
        .output(item('refinedstorage:storage_part:2'))
        .row('CSC')
        .row('ADA')
        .row('CAC')
        .key('C', item('refinedstorage:processor:4'))
        .key('S', ore('ingotAnyResistantAlloy'))
        .key('A', item('refinedstorage:storage_part:1'))
        .key('D', item('hbm:circuit:9'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:16k_storage_disk'))
        .output(item('refinedstorage:storage_disk:2'))
        .row('ABA')
        .row('DMD')
        .row('CCC')
        .key('A', item('hbm:glass_uranium'))
        .key('D', ore('ingotAnyPlastic'))
        .key('C', ore('ingotAnyResistantAlloy'))
        .key('B', item('hbm:circuit:9'))
        .key('M', item('refinedstorage:storage_part:2'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:16k_storage_block'))
        .output(item('refinedstorage:storage:2'))
        .row('ABA')
        .row('ACA')
        .row('ADA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('refinedstorage:storage_part:2'))
        .key('C', item('hbm:cm_block:3'))
        .key('D', item('hbm:cm_circuit:2'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:fortune_1_upgrade'))
        .output(item('refinedstorage:upgrade:7'))
        .row('ABA')
        .row('CDC')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:enchanted_book').withNbt([StoredEnchantments: [id: 35, lvl:1]]))
        .key('C', item('minecraft:bookshelf'))
        .key('D', item('refinedstorage:upgrade'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:fortune_2_upgrade'))
        .output(item('refinedstorage:upgrade:8'))
        .row('ABA')
        .row('CDC')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:enchanted_book').withNbt([StoredEnchantments: [id: 35, lvl:2]]))
        .key('C', item('minecraft:bookshelf'))
        .key('D', item('refinedstorage:upgrade'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:fortune_3_upgrade'))
        .output(item('refinedstorage:upgrade:9'))
        .row('ABA')
        .row('CDC')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:enchanted_book').withNbt([StoredEnchantments: [id: 35, lvl:3]]))
        .key('C', item('minecraft:bookshelf'))
        .key('D', item('refinedstorage:upgrade'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('refinedstorage:silk_touch_upgrade'))
        .output(item('refinedstorage:upgrade:6'))
        .row('ABA')
        .row('CDC')
        .row('AAA')
        .key('A', item('hbm:ingot_steel'))
        .key('B', item('minecraft:enchanted_book').withNbt([StoredEnchantments: [id: 33, lvl:1]]))
        .key('C', item('minecraft:bookshelf'))
        .key('D', item('refinedstorage:upgrade'))
        .replaceByName()
        .register()
replacedCount++
/* if it aint broken dont fix it
crafting.shapedBuilder()
        .name(resource('hbm:desh_sword'))
        .output(item('hbm:desh_sword'))
        .row('A')
        .row('A')
        .row('B')
        .key('A', item('hbm:ingot_desh'))
        .key('B', ore('ingotAnyPlastic'))
        .replaceByName()
        .register()
*/
crafting.shapedBuilder() // bring back old glory
        .name(resource('hbm:fluid_identifier_multi'))
        .output(item('hbm:fluid_identifier_multi'))
        .row('A')
        .row('B')
        .row('C')
        .key('A', ore('dye'))
        .key('B', item('hbm:circuit'))
        .key('C', item('hbm:plate_iron'))
        .replaceByName()
        .register()
replacedCount++
documented++

// im not sure when i removed this recipe but im adding it back
crafting.shapedBuilder()
        .name(resource('hbm:defuser'))
        .output(item('hbm:defuser'))
        .row(' AS')
        .row('ABA')
        .row(' A ')
        .key('A', ore('ingotAnyRubber'))
        .key('S', item('hbm:plate_iron'))
        .key('B', ore('dyeRed'))
        .replaceByName()
        .register()
replacedCount++
documented++

crafting.shapedBuilder()
        .name(resource('hbm:wiring_red_copper'))
        .output(item('hbm:wiring_red_copper'))
        .row('SSS')
        .row('SBS')
        .row('SSS')
        .key('S', ore('plateSteel'))
        .key('B', ore('ingotMingrade'))
        .replaceByName()
        .register()
replacedCount++
documented++

crafting.shapedBuilder()
        .output(item('hbm:defuser_desh'))
        .row(' AS')
        .row('A A')
        .row(' A ')
        .key('A', ore('ingotAnyPlastic'))
        .key('S', item('hbm:ingot_desh'))
        .register()
recipeCount++
documented++

crafting.shapedBuilder()
        .output(item('hbm:insert_doxium'))
        .row('AAA')
        .row('ABA')
        .row('AAA')
        .key('A', ore('container1000estradiol'))
        .key('B', ore('insert'))
        .register()
recipeCount++
documented++

// security armor, base recipes suck
crafting.shapedBuilder()
        .name(resource('hbm:security_helmet'))
        .output(item('hbm:security_helmet'))
        .row(' S ')
        .row('AKA')
        .row('BGB')
        .key('A', item('hbm:ingot_steel'))
        .key('B', ore('ingotAnyPlastic'))
        .key('G', ore('anyReinforcedPane'))
        .key('K', item('hbm:plate_kevlar'))
        .key('S', item('hbm:plate_steel'))
        .replaceByName()
        .register()
replacedCount++
documented++

crafting.shapedBuilder()
        .name(resource('hbm:security_plate'))
        .output(item('hbm:security_plate'))
        .row('KAK')
        .row('PKP')
        .row('AKA')
        .key('A', item('hbm:plate_polymer'))
        .key('P', ore('ingotAnyPlastic'))
        .key('K', item('hbm:plate_kevlar'))
        .replaceByName()
        .register()
replacedCount++
documented++

crafting.shapedBuilder()
        .name(resource('hbm:security_legs'))
        .output(item('hbm:security_legs'))
        .row('PAP')
        .row('K K')
        .row('A A')
        .key('A', item('hbm:plate_polymer'))
        .key('P', ore('ingotAnyPlastic'))
        .key('K', item('hbm:plate_kevlar'))
        .replaceByName()
        .register()
replacedCount++
documented++

crafting.shapedBuilder()
        .name(resource('hbm:security_boots'))
        .output(item('hbm:security_boots'))
        .row('A A')
        .row('K K')
        .row('P P')
        .key('A', item('hbm:plate_steel'))
        .key('P', ore('ingotAnyPlastic'))
        .key('K', item('hbm:plate_kevlar'))
        .replaceByName()
        .register()
replacedCount++
documented++

// provisional Neutron Reflector recipes as the new Blast Furnace doesn't have the recipe for it yet
/* recipe added to the arc welder like in 1.7.10
crafting.addShapeless(item('hbm:neutron_reflector') * 2, [ore('coal'), ore('Tungsten')])
crafting.addShapeless(item('hbm:neutron_reflector') * 2, [ore('coke'), ore('Tungsten')])
recipeCount += 2
documented += 2*/

// tried to damage the item with 10 other methods, listening to events and shit, to it being a simple method, sad.
/*crafting.addShapeless(item('hbm:powder_cement') * 4, [item('hbm:block_slag:1'), item('hbm:blades_steel:*').reuse().transformDamage(2)])
crafting.addShapeless(item('hbm:powder_cement') * 4, [item('hbm:block_slag:1'), item('hbm:blades_titanium:*').reuse().transformDamage(2)])
crafting.addShapeless(item('hbm:powder_cement') * 4, [item('hbm:block_slag:1'), item('hbm:blades_desh').reuse()])
recipeCount += 3*/

// Sacrifice.
crafting.addShapeless(item('hbm:powder_spark_mix') * 10, [item('minecraft:dragon_egg'), item('hbm:blades_steel:*').reuse().transformDamage(2)])
crafting.addShapeless(item('hbm:powder_spark_mix') * 10, [item('minecraft:dragon_egg'), item('hbm:blades_titanium:*').reuse().transformDamage(2)])
crafting.addShapeless(item('hbm:powder_spark_mix') * 10, [item('minecraft:dragon_egg'), item('hbm:blades_desh').reuse()])
recipeCount += 3

// meteorite sword filler recipes
crafting.shapedBuilder()
        .output(item('hbm:meteorite_sword_machined'))
        .row('AGA')
        .row('GBG')
        .row('AGA')
        .key('A', item('hbm:circuit:9'))
        .key('B', item('hbm:meteorite_sword_alloyed'))
        .key('G', item('hbm:wire_dense:7900'))
        .register()
recipeCount++

crafting.addShapeless(item('hbm:meteorite_sword_treated'), [ore('ntmchemistryset'), item('hbm:meteorite_sword_machined'), ore('container1000radiosolvent') * 16, ore('container1000bloodhot') * 16])
crafting.addShapeless(item('hbm:meteorite_sword_treated'), [ore('ntmchemistryset'), item('hbm:meteorite_sword_machined'), ore('container16000radiosolvent'), ore('container16000bloodhot')])
recipeCount++
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:meteorite_sword_irradiated'))
        .row('ADA')
        .row('CBC')
        .row('ADA')
        .key('A', item('hbm:plate_bismuth'))
        .key('B', item('hbm:meteorite_sword_bred'))
        .key('C', item('hbm:ingot_polonium'))
        .key('D', item('hbm:ingot_u235'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:meteorite_sword_fused'))
        .row('ADA')
        .row('CBC')
        .row('ADA')
        .key('A', item('hbm:plate_dalekanium'))
        .key('B', item('hbm:meteorite_sword_irradiated'))
        .key('C', item('hbm:ingot_meteorite'))
        .key('D', item('hbm:ingot_starmetal'))
        .register()
recipeCount++

crafting.addShapeless(item('hbm:meteorite_sword_baleful'), [item('hbm:meteorite_sword_fused'), item('hbm:egg_balefire_shard')])
recipeCount++

// shimmer tools shouldnt be available in the mid game because they can break too many things, instantly
crafting.shapedBuilder()
        .name(resource('hbm:shimmer_head'))
        .output(item('hbm:shimmer_head'))
        .row('SSS')
        .row('KAK')
        .row('SSS')
        .key('S', item('hbm:ingot_combine_steel'))
        .key('K', item('hbm:block_combine_steel'))
        .key('A', item('hbm:block_euphemium'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('hbm:shimmer_axe_head'))
        .output(item('hbm:shimmer_axe_head'))
        .row('SCC')
        .row('SAK')
        .row('SCC')
        .key('S', item('hbm:plate_combine_steel'))
        .key('K', item('hbm:block_combine_steel'))
        .key('A', item('hbm:block_euphemium'))
        .key('C', item('hbm:ingot_combine_steel'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .output(item('hbm:det_n2'))
        .row('ACA')
        .row('CBC')
        .row('ACA')
        .key('A', item('hbm:plate_polymer'))
        .key('B', item('hbm:c4'))
        .key('C', item('hbm:n2_charge'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:det_bale'))
        .row('ABA')
        .row('DCD')
        .row('ABA')
        .key('A', item('hbm:neutron_reflector'))
        .key('B', item('hbm:circuit:13'))
        .key('C', item('hbm:egg_balefire_shard'))
        .key('D', item('hbm:det_charge'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:spinny_light'))
        .row(' B ')
        .row('BAB')
        .row(' B ')
        .key('A', item('hbm:circuit'))
        .key('B', ore('blockGlass'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:gun_double_barrel'))
        .row(' A ')
        .row('BCE')
        .row('BDF')
        .key('A', item('minecraft:skull'))
        .key('B', ore('barrelLightSaturnite'))
        .key('C', ore('receiverLightSaturnite'))
        .key('D', ore('gunMechanismSaturnite'))
        .key('E', ore('stockAnyHardPlastic'))
        .key('F', ore('gripAnyHardPlastic'))
        .register()
recipeCount++

 // Calibers
crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_caliber')) //9mm
        .row(' A ')
        .row('BDC')
        .row(' A ')
        .key('A', ore('gunMechanismGunMetal'))
        .key('B', item('hbm:weapon_mod_generic:1'))
        .key('C', item('hbm:weapon_mod_generic'))
        .key('D', ore('9mm'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_caliber:1')) //45mm
        .row(' A ')
        .row('BDC')
        .row(' A ')
        .key('A', ore('gunMechanismGunMetal'))
        .key('B', item('hbm:weapon_mod_generic:1'))
        .key('C', item('hbm:weapon_mod_generic'))
        .key('D', ore('.45'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_caliber:2')) //.22 LR
        .row(' A ')
        .row('BDC')
        .row(' A ')
        .key('A', ore('gunMechanismGunMetal'))
        .key('B', item('hbm:weapon_mod_generic:1'))
        .key('C', item('hbm:weapon_mod_generic'))
        .key('D', ore('.22 LR'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_caliber:3')) //.357 Magnum
        .row(' A ')
        .row('BDC')
        .row(' A ')
        .key('A', ore('gunMechanismGunMetal'))
        .key('B', item('hbm:weapon_mod_generic:3'))
        .key('C', item('hbm:weapon_mod_generic:2'))
        .key('D', ore('.357'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_caliber:4')) //.44 Magnum
        .row(' A ')
        .row('BDC')
        .row(' A ')
        .key('A', ore('gunMechanismGunMetal'))
        .key('B', item('hbm:weapon_mod_generic:3'))
        .key('C', item('hbm:weapon_mod_generic:2'))
        .key('D', ore('.44'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_caliber:5')) //5.56mm
        .row(' A ')
        .row('BDC')
        .row(' A ')
        .key('A', ore('gunMechanismWeaponSteel'))
        .key('B', item('hbm:weapon_mod_generic:7'))
        .key('C', item('hbm:weapon_mod_generic:6'))
        .key('D', ore('5.56mm'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_caliber:6')) //7.62mm
        .row(' A ')
        .row('BDC')
        .row(' A ')
        .key('A', ore('gunMechanismWeaponSteel'))
        .key('B', item('hbm:weapon_mod_generic:7'))
        .key('C', item('hbm:weapon_mod_generic:6'))
        .key('D', ore('7.62mm'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_caliber:7')) //.50 BMG
        .row(' A ')
        .row('BDC')
        .row(' A ')
        .key('A', ore('gunMechanismSaturnite'))
        .key('B', item('hbm:weapon_mod_generic:15'))
        .key('C', item('hbm:weapon_mod_generic:14'))
        .key('D', ore('.50 BMG'))
        .register()
recipeCount++


// Ghiorsium
crafting.shapedBuilder()
        .name(resource('hbm:insert_ghiorsium'))
        .output(item('hbm:insert_ghiorsium'))
        .row('ABA')
        .row('BCB')
        .row('ABA')
        .key('A', item('hbm:ducttape'))
        .key('B', item('hbm:ingot_pb209'))
        .key('C', item('hbm:ingot_u238'))
        .replaceByName()
        .register()
crafting.shapedBuilder()
        .name(resource('hbm:cladding_ghiorsium'))
        .output(item('hbm:cladding_ghiorsium'))
        .row('ABA')
        .row('BCB')
        .row('ABA')
        .key('A', item('hbm:ducttape'))
        .key('B', item('hbm:ingot_pb209'))
        .key('C', item('hbm:cladding_desh'))
        .replaceByName()
        .register()
replacedCount++
replacedCount++



crafting.replaceShapeless(item('hbm:missile_taint'), [item('hbm:missile_assembly'), ore('container1000watz'), item('hbm:powder_spark_mix'), item('hbm:powder_magic')])
replacedCount++
crafting.addShapeless(item('hbm:taint') * 4, [ore('dirt') * 4, ore('container1000watz'), item('hbm:powder_spark_mix'), item('hbm:powder_magic')])
recipeCount++

// no one told me this thing doesnt work and I've been including it for the past 6 months as a working mechanic
// remove unused item
crafting.removeByOutput(item('hbm:template_folder'))
removedCount++

// paa hazmat to paa armor
crafting.addShapeless(item('hbm:paa_plate'), [item('hbm:neutron_reflector'), item('hbm:neutron_reflector'), item('hbm:neutron_reflector'), item('hbm:hazmat_paa_plate')])
crafting.addShapeless(item('hbm:paa_legs'), [item('hbm:neutron_reflector'), item('hbm:neutron_reflector'), item('hbm:hazmat_paa_legs')])
crafting.addShapeless(item('hbm:paa_boots'), [item('hbm:neutron_reflector'), item('hbm:neutron_reflector'), item('hbm:hazmat_paa_boots')])
recipeCount++
recipeCount++
recipeCount++

// pink fluid, contains traces amounts of geass hatred
crafting.addShapeless(item('hbm:syringe_mkunicorn'), [item('hbm:nugget_euphemium'), item('hbm:watch'), item('hbm:syringe_empty')])
recipeCount++

// processor hbmified
crafting.addShapeless(item('refinedstorage:processor:3'), [item('refinedstorage:processor_binding'), item('hbm:ingot_steel'), ore('ingotAnyRubber'), item('hbm:circuit:7')])
crafting.addShapeless(item('refinedstorage:processor:4'), [item('refinedstorage:processor_binding'), item('hbm:ingot_desh'), ore('ingotAnyPlastic'), item('hbm:circuit:8')])
crafting.addShapeless(item('refinedstorage:processor:5'), [item('refinedstorage:processor_binding'), ore('ingotAnyResistantAlloy'), ore('ingotAnyHardPlastic'), item('hbm:circuit:9')])
recipeCount++
recipeCount++
recipeCount++

// bye useless ingot
crafting.removeByOutput(item('refinedstorage:quartz_enriched_iron'))
crafting.removeByOutput(item('refinedstorage:quartz_enriched_iron_block'))
removedCount++
removedCount++

// remove raw processor
crafting.removeByOutput(item('refinedstorage:processor'))
crafting.removeByOutput(item('refinedstorage:processor:1'))
crafting.removeByOutput(item('refinedstorage:processor:2'))
removedCount++
removedCount++
removedCount++

crafting.removeByOutput(item('hbm:machine_battery_potato'))
removedCount++

// remove furnace raw processor recipe
furnace.removeByOutput(item('refinedstorage:processor:3'))
furnace.removeByOutput(item('refinedstorage:processor:4'))
furnace.removeByOutput(item('refinedstorage:processor:5'))
removedCount++
removedCount++
removedCount++


// remove fluid parts because they are boooring, big tanks and barrels are immersive and fun

crafting.removeByOutput(item('refinedstorage:fluid_storage'))
crafting.removeByOutput(item('refinedstorage:fluid_storage:1'))
crafting.removeByOutput(item('refinedstorage:fluid_storage:2'))
crafting.removeByOutput(item('refinedstorage:fluid_storage:3'))
removedCount++
removedCount++
removedCount++
removedCount++

crafting.removeByOutput(item('refinedstorage:fluid_storage_disk'))
crafting.removeByOutput(item('refinedstorage:fluid_storage_disk:1'))
crafting.removeByOutput(item('refinedstorage:fluid_storage_disk:2'))
crafting.removeByOutput(item('refinedstorage:fluid_storage_disk:3'))
removedCount++
removedCount++
removedCount++
removedCount++

crafting.removeByOutput(item('refinedstorage:fluid_storage_part'))
crafting.removeByOutput(item('refinedstorage:fluid_storage_part:1'))
crafting.removeByOutput(item('refinedstorage:fluid_storage_part:2'))
crafting.removeByOutput(item('refinedstorage:fluid_storage_part:3'))
removedCount++
removedCount++
removedCount++
removedCount++

furnace.removeByOutput(item('refinedstorage:silicon'))
removedCount++

crafting.removeByOutput(item('refinedstorage:fluid_interface'))
removedCount++

crafting.removeByOutput(item('refinedstorage:wireless_fluid_grid'))
crafting.removeByOutput(item('refinedstorage:grid:3'))
removedCount++
removedCount++

// remove casings as i prefer to use cm_block since its ntm's and thats better
crafting.removeByOutput(item('refinedstorage:machine_casing'))
removedCount++

log.info("Adding " + recipeCount + " recipes.")
log.info("Replacing " + replacedCount + " recipes.")
log.info("Removed " + removedCount + " recipes.")
log.info("Documented a total of " + documented + " recipes!")
def totalCount = removedCount + replacedCount + recipeCount + hbmRecipes
log.info("Changed a total of " + totalCount + " recipes!")


