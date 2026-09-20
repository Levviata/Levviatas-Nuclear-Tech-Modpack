
def recipeCount = 0;
def replacedCount = 0;
def removedCount = 0;
def documented = 0;
def hbmRecipes = 74;
def refinedStorageRecipes = 85;

// NUCLEAR TECH //
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
        .key('B', item('hbm:coil_copper_torus'))
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
        .output(item('hbm:meteorite_sword_bred'))
        .row('ADA')
        .row('CBC')
        .row('ADA')
        .key('A', item('hbm:plate_bismuth'))
        .key('B', item('hbm:meteorite_sword_etched'))
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
        .key('S', ore('ingotAnyResistantAlloy'))
        .key('K', ore('blockAnyResistantAlloy'))
        .key('A', ore('blockAnyPlastic'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('hbm:shimmer_axe_head'))
        .output(item('hbm:shimmer_axe_head'))
        .row('SCC')
        .row('SAK')
        .row('SCC')
        .key('S', ore('plateTripleAnyResistantAlloy'))
        .key('K', ore('blockAnyResistantAlloy'))
        .key('A', ore('blockAnyPlastic'))
        .key('C', ore('ingotAnyResistantAlloy'))
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
        .name(resource('hbm:jetpack_glider'))
        .output(item('hbm:jetpack_glider'))
        .row('ABA')
        .row('CGC')
        .row('DFD')
        .key('A', item('hbm:circuit:9'))
        .key('C', item('hbm:plate_bismuth'))
        .key('G', item('hbm:jetpack_boost'))
        .key('B', item('hbm:motor_desh'))
        .key('D', item('hbm:thruster_nuclear'))
        .key('F', item('hbm:coin_maskman'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('hbm:cable_diode'))
        .output(item('hbm:cable_diode'))
        .row(' B ')
        .row('ACA')
        .row(' B ')
        .key('B', ore('nuggetSilicon'))
        .key('A', item('hbm:red_cable'))
        .key('C', ore('ingotMingrade'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .output(item('hbm:det_bale'))
        .row('AFA')
        .row('DCD')
        .row('ABA')
        .key('A', item('hbm:neutron_reflector'))
        .key('B', item('hbm:circuit:8'))
        .key('C', item('hbm:egg_balefire_shard'))
        .key('D', item('hbm:det_charge'))
        .key('F', ore('plateWeaponSteel'))
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
        .key('C', item('hbm:ingot_pb209'))
        .key('B', ore('plateSaturnite'))
        .replaceByName()
        .register()
crafting.shapedBuilder()
        .name(resource('hbm:cladding_ghiorsium'))
        .output(item('hbm:cladding_ghiorsium'))
        .row('ABA')
        .row('DCD')
        .row('ABA')
        .key('A', item('hbm:ducttape'))
        .key('B', item('hbm:ingot_pb209'))
        .key('C', item('hbm:cladding_desh'))
        .key('D', ore('plateSaturnite'))
        .replaceByName()
        .register()
replacedCount++
replacedCount++

crafting.shapedBuilder()
        .name(resource('hbm:crane_splitter'))
        .output(item('hbm:crane_splitter') * 4)
        .row('AAA')
        .row('BCB')
        .row('AAA')
        .key('A', ore('ingotSteel'))
        .key('B', item('hbm:part_generic'))
        .key('C', item('hbm:circuit'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('hbm:crane_router'))
        .output(item('hbm:crane_router') * 4)
        .row('ABA')
        .row('BCB')
        .row('ABA')
        .key('B', item('hbm:plate_polymer'))
        .key('A', item('hbm:part_generic'))
        .key('C', item('hbm:circuit:8'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('hbm:crane_boxer'))
        .output(item('hbm:crane_boxer') * 4)
        .row('AAA')
        .row('ABA')
        .row('CCC')
        .key('A', ore('plankWood'))
        .key('B', item('hbm:part_generic'))
        .key('C', item('hbm:conveyor_wand'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .name(resource('hbm:crane_unboxer'))
        .output(item('hbm:crane_unboxer') * 4)
        .row('AAA')
        .row('ABA')
        .row('CCC')
        .key('A', ore('stickWood'))
        .key('B', item('minecraft:shears'))
        .key('C', item('hbm:conveyor_wand'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .output(item('hbm:wand_s'))
        .row('  A')
        .row(' A ')
        .row('A  ')
        .key('A', item('hbm:undefined'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:wand_k'))
        .row('A  ')
        .row(' A ')
        .row('  A')
        .key('A', item('hbm:undefined'))
        .register()
recipeCount++


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
        .output(item('hbm:gun_n_i_4_n_i'))
        .row('DDD')
        .row('ABC')
        .row('DFG')
        .key('A', ore('barrelLightAnyBismoidBronze'))
        .key('B', ore('receiverLightAnyBismoidBronze'))
        .key('C', ore('stockAnyHardPlastic'))
        .key('D', item('hbm:undefined'))
        .key('F', ore('gunMechanismSaturnite'))
        .key('G', ore('gripAnyHardPlastic'))
        .register()
crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_special:16'))
        .row('DFD')
        .row('FBF')
        .row('DFD')
        .key('B', ore('ingotAluminum'))
        .key('D', item('hbm:undefined'))
        .key('F', ore('gunMechanismSaturnite'))
        .register()
crafting.shapedBuilder()
        .output(item('hbm:weapon_mod_special:17'))
        .row('DFD')
        .row('FBF')
        .row('DFD')
        .key('B', ore('ingotGold'))
        .key('D', item('hbm:undefined'))
        .key('F', ore('gunMechanismSaturnite'))
        .register()
recipeCount++
recipeCount++
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:gun_coilgun'))
        .row(' AB')
        .row('CDD')
        .row('FGH')
        .key('A', ore('receiverHeavyAnyBismoidBronze'))
        .key('B', item('hbm:circuit:11'))
        .key('C', ore('shellCopper'))
        .key('D', item('hbm:coil_copper_torus'))
        .key('F', ore('gripAnyHardPlastic'))
        .key('G', ore('gunMechanismSaturnite'))
        .key('H', ore('stockAnyHardPlastic'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:gun_autoshotgun_heretic'))
        .row('ABC')
        .row('DFG')
        .row('HHJ')
        .key('A', item('hbm:gun_minigun_dual'))
        .key('B', item('hbm:ducc'))
        .key('C', item('hbm:wild_p'))
        .key('D', ore('barrelHeavySaturnite'))
        .key('F', ore('receiverHeavySaturnite'))
        .key('G', ore('gunMechanismSaturnite'))
        .key('H', ore('gripAnyHardPlastic'))
        .key('J', item('hbm:ammo_bag'))
        .register()
recipeCount++

// im not gonna even count this shit
// ncrpa to rpa and rpa to ncrpa
// because ncrpa armor is cool but its too close to rpa armor to justify making a recipe for it
crafting.addShapeless(item('hbm:ncrpa_helmet'), [item('hbm:rpa_helmet').withNbt(['charge': 2500000l]), item('hbm:screwdriver:*').reuse().transformDamage(1)])
crafting.addShapeless(item('hbm:ncrpa_helmet'), [item('hbm:rpa_helmet').withNbt(['charge': 2500000l]), item('hbm:screwdriver_desh').reuse()])
crafting.addShapeless(item('hbm:ncrpa_plate'), [item('hbm:rpa_plate').withNbt(['charge': 2500000l]), item('hbm:screwdriver:*').reuse().transformDamage(1)])
crafting.addShapeless(item('hbm:ncrpa_plate'), [item('hbm:rpa_plate').withNbt(['charge': 2500000l]), item('hbm:screwdriver_desh').reuse()])
crafting.addShapeless(item('hbm:ncrpa_legs'), [item('hbm:rpa_legs').withNbt(['charge': 2500000l]), item('hbm:screwdriver:*').reuse().transformDamage(1)])
crafting.addShapeless(item('hbm:ncrpa_legs'), [item('hbm:rpa_legs').withNbt(['charge': 2500000l]), item('hbm:screwdriver_desh').reuse()])
crafting.addShapeless(item('hbm:ncrpa_boots'), [item('hbm:rpa_boots').withNbt(['charge': 2500000l]), item('hbm:screwdriver:*').reuse().transformDamage(1)])
crafting.addShapeless(item('hbm:ncrpa_boots'), [item('hbm:rpa_boots').withNbt(['charge': 2500000l]), item('hbm:screwdriver_desh').reuse()])

crafting.addShapeless(item('hbm:rpa_helmet'), [item('hbm:ncrpa_helmet').withNbt(['charge': 2500000l]), item('hbm:screwdriver:*').reuse().transformDamage(1)])
crafting.addShapeless(item('hbm:rpa_helmet'), [item('hbm:ncrpa_helmet').withNbt(['charge': 2500000l]), item('hbm:screwdriver_desh').reuse()])
crafting.addShapeless(item('hbm:rpa_plate'), [item('hbm:ncrpa_plate').withNbt(['charge': 2500000l]), item('hbm:screwdriver:*').reuse().transformDamage(1)])
crafting.addShapeless(item('hbm:rpa_plate'), [item('hbm:ncrpa_plate').withNbt(['charge': 2500000l]), item('hbm:screwdriver_desh').reuse()])
crafting.addShapeless(item('hbm:rpa_legs'), [item('hbm:ncrpa_legs').withNbt(['charge': 2500000l]), item('hbm:screwdriver:*').reuse().transformDamage(1)])
crafting.addShapeless(item('hbm:rpa_legs'), [item('hbm:ncrpa_legs').withNbt(['charge': 2500000l]), item('hbm:screwdriver_desh').reuse()])
crafting.addShapeless(item('hbm:rpa_boots'), [item('hbm:ncrpa_boots').withNbt(['charge': 2500000l]), item('hbm:screwdriver:*').reuse().transformDamage(1)])
crafting.addShapeless(item('hbm:rpa_boots'), [item('hbm:ncrpa_boots').withNbt(['charge': 2500000l]), item('hbm:screwdriver_desh').reuse()])


crafting.addShapeless(item('hbm:balefire') * 64, [item('hbm:undefined')])
crafting.addShapeless(item('hbm:fire_digamma')  * 64, [item('hbm:undefined'), item('hbm:undefined')])
crafting.addShapeless(item('hbm:digamma_matter')  * 64, [item('hbm:undefined'), item('hbm:undefined'), item('hbm:undefined')])
recipeCount++
recipeCount++
recipeCount++

// ace and queen of spades cards
crafting.addShapeless(item('hbm:card_aos'), [ore('paper'), ore('dyeBlack'), item('hbm:coin_maskman')])
crafting.addShapeless(item('hbm:card_qos'), [ore('paper'), ore('dyeBlack'), ore('dyeRed'),item('hbm:coin_worm')])
recipeCount++
recipeCount++

crafting.addShapeless(item('hbm:fabsols_vodka'), [item('hbm:canteen_vodka'), item('hbm:powder_euphemium'), item('hbm:syringe_awesome')])
crafting.addShapeless(item('hbm:wild_p'), [item('hbm:flame_pony'), item('hbm:canteen_vodka'), item('hbm:powder_cadmium'), item('minecraft:potion').withNbt(['Potion': 'minecraft:strong_harming'])])
crafting.addShapeless(item('hbm:scrumpy'), [item('hbm:canteen_vodka'), item('hbm:powder_lead'), item('minecraft:potion').withNbt(['Potion': 'minecraft:strong_healing'])])
recipeCount++
recipeCount++
recipeCount++

// mask man and big man johnson
crafting.addShapeless(item('minecraft:spawn_egg').withNbt(['EntityTag': ['id': 'hbm:entity_mask_man']]), [ore('egg'), item('hbm:undefined'), item('hbm:undefined'),item('hbm:undefined')])
crafting.addShapeless(item('minecraft:spawn_egg').withNbt(['EntityTag': ['id': 'hbm:entity_glyphid_nuclear']]), [item('hbm:egg_glyphid'), item('hbm:undefined'), item('hbm:undefined'),item('hbm:undefined')])
recipeCount++
recipeCount++

crafting.addShapeless(item('hbm:spawn_duck'), [ore('egg'), ore('ingotGold')])
recipeCount++

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

// chicago pile
// old rods bye
crafting.removeByOutput(item('hbm:pile_rod_uranium'))
crafting.removeByOutput(item('hbm:pile_rod_source'))
crafting.removeByOutput(item('hbm:pile_rod_boron'))
crafting.removeByOutput(item('hbm:pile_rod_lithium'))
crafting.removeByOutput(item('hbm:pile_rod_detector'))
removedCount++
removedCount++
removedCount++
removedCount++
removedCount++

// bye bye reactors, rods, and plates
// deprecate to match v 1.0.27_X5771
crafting.removeByOutput(item('hbm:rod:*'))
crafting.removeByOutput(item('hbm:rod_dual:*'))
crafting.removeByOutput(item('hbm:rod_quad:*'))
removedCount++
removedCount++
removedCount++
// add new recipes here levviata for the love of god

// book of boxcar pages, stupid as hell but thats what makes it fun
crafting.addShapeless(item('hbm:stamp_book'), [ore('flatStamp'), ore('logWood'), ore('cropPotato'), ore('stone'), ore('paper')]) // page 1
crafting.addShapeless(item('hbm:stamp_book:1'), [ore('flatStamp'), ore('ingotIron'), ore('dustRedstone'), ore('gemCoal'), ore('paper')]) // page 2
crafting.addShapeless(item('hbm:stamp_book:2'), [ore('flatStamp'), ore('ingotTitanium'), ore('ingotLatex'), ore('ingotAsbestos'), ore('paper')]) // page 3
crafting.addShapeless(item('hbm:stamp_book:3'), [ore('flatStamp'), ore('ingotMingrade'), ore('ingotGraphite'), ore('ingotCobalt'), ore('paper')]) // page 4
crafting.addShapeless(item('hbm:stamp_book:4'), [ore('flatStamp'), ore('dustDuraSteel'), ore('dustSteel'), ore('deshPowder'), item('hbm:flame_opinion')]) // page 5
crafting.addShapeless(item('hbm:stamp_book:5'), [ore('flatStamp'), ore('dustCadmium'), ore('ingotFerrouranium'), ore('ingotFiberglass'), item('hbm:flame_conspiracy')]) // page 6
crafting.addShapeless(item('hbm:stamp_book:6'), [ore('flatStamp'), item('hbm:gun_lag'), item('minecraft:sugar'), ore('dustSaturnite'), item('hbm:mucho_mango'), item('hbm:flame_politics')]) // page 7
crafting.addShapeless(item('hbm:stamp_book:7'), [ore('flatStamp'), item('hbm:gun_minigun'), item('hbm:nuke_fstbmb'), ore('ingotEuphemium'), ore('ingotSchrabidium'), item('hbm:flame_pony')]) // page 8
recipeCount++
recipeCount++
recipeCount++
recipeCount++
recipeCount++
recipeCount++
recipeCount++
recipeCount++

crafting.shapedBuilder()
        .output(item('hbm:medal_liquidator'))
        .row('ABA')
        .row('BCB')
        .row('ABA')
        .key('A', item('hbm:nugget_au198'))
        .key('B', item('hbm:ingot_boron'))
        .key('C', item('hbm:coin_radiation'))
        .register()
recipeCount++

crafting.shapedBuilder()
        .name(resource('hbm:block_slag'))
        .output(item('hbm:block_slag'))
        .row('AAA')
        .row('AAA')
        .row('AAA')
        .key('A', ore('ingotSlag'))
        .replaceByName()
        .register()
replacedCount++

crafting.addShapeless(item('hbm:sliding_blast_door_legacy'), [ore('ntmscrewdriver').reuse(), item('hbm:sliding_blast_door_2')])
crafting.addShapeless(item('hbm:sliding_blast_door_2'), [ore('ntmscrewdriver').reuse(), item('hbm:sliding_blast_door_legacy')])
recipeCount++
recipeCount++

// stupid thing
crafting.removeByOutput(item('hbm:sliding_blast_door'))
removedCount++

crafting.removeByOutput(item('hbm:sliding_blast_door_skin0'))
crafting.removeByOutput(item('hbm:sliding_blast_door_skin1:1'))
crafting.removeByOutput(item('hbm:sliding_blast_door_skin2:2'))
removedCount++
removedCount++
removedCount++

// plate metal
crafting.removeByOutput(item('hbm:platemetal:*'))
crafting.addShapeless(item('hbm:platemetal'), [ore('coloredPlatemetal')])
removedCount++
recipeCount++

crafting.addShapeless(item('hbm:sliding_blast_door_skin0'), [ore('plateIron'), ore('dyeWhite')])
crafting.addShapeless(item('hbm:sliding_blast_door_skin1'), [ore('plateIron'), ore('dyeOrange')])
crafting.addShapeless(item('hbm:sliding_blast_door_skin2'), [ore('plateIron'), ore('dyeOrange'), ore('dyeBlack')])
recipeCount++
recipeCount++
recipeCount++

crafting.addShapeless(item('hbm:sliding_blast_door_skin0'), [ore('slidingBlastDoor').reuse(), ore('dyeWhite')])
crafting.addShapeless(item('hbm:sliding_blast_door_skin1'), [ore('slidingBlastDoor').reuse(), ore('dyeOrange')])
crafting.addShapeless(item('hbm:sliding_blast_door_skin2'), [ore('slidingBlastDoor').reuse(), ore('dyeOrange'), ore('dyeBlack')])
recipeCount++
recipeCount++
recipeCount++

crafting.addShapeless(item('hbm:gun_b92'), [ore('ntmscrewdriver').reuse(), item('hbm:gun_b93')])
crafting.addShapeless(item('hbm:gun_b93'), [ore('ntmscrewdriver').reuse(), item('hbm:gun_b92')])
recipeCount++
recipeCount++

// par with 1.7.10
crafting.shapedBuilder()
        .name(resource('hbm:mp_warhead_15_boxcar'))
        .output(item('hbm:mp_warhead_15_boxcar'))
        .row('ABA')
        .row('CFC')
        .row('ADA')
        .key('A', ore('ingotStarmetal'))
        .key('B', item('hbm:det_nuke'))
        .key('C', item('hbm:circuit:9'))
        .key('D', ore('container16000tritium'))
        .key('F', item('hbm:boxcar'))
        .replaceByName()
        .register()
replacedCount++

crafting.shapedBuilder()
        .output(item('hbm:mp_stability_20_flat'))
        .row('BAB')
        .row('BAB')
        .key('A', item('hbm:steel_scaffold:*'))
        .key('B', item('hbm:plate_cast:50')) // weapon steel
        .register()
recipeCount++

// no recipe in 1.7.10, why bob?
crafting.shapedBuilder()
        .output(item('hbm:grenade_extra:3'))
        .row(' B ')
        .row('BCB')
        .row(' A ')
        .key('A', ore('plateSteel'))
        .key('B', ore('grenadeShell'))
        .key('C', item('hbm:powder_magic'))
        .register()
recipeCount++

crafting.addShapeless(item('hbm:anvil_steel'), [ore('ironAnvil').reuse(), ore('ingotSteel') * 10])
recipeCount++

//scrap is steel
furnace.add(item("hbm:scrap"), item("hbm:ingot_steel"))

// END NUCLEAR TECH //

log.info("Adding " + recipeCount + " NTM recipes.")
log.info("Replacing " + replacedCount + " NTM recipes.")
log.info("Removed " + removedCount + " NTM recipes.")
log.info("Documented a total of " + documented + " NTM recipes!")
def totalCount = removedCount + replacedCount + recipeCount + hbmRecipes + refinedStorageRecipes

log.info("Changed a total of " + totalCount + " recipes!")

log.info("Loaded NTM recipes!")


