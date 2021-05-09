package com.binary_studio.fleet_commander.core.subsystems;

import com.binary_studio.fleet_commander.core.actions.attack.AttackAction;
import com.binary_studio.fleet_commander.core.actions.defence.RegenerateAction;
import com.binary_studio.fleet_commander.core.common.PositiveInteger;
import com.binary_studio.fleet_commander.core.subsystems.contract.DefenciveSubsystem;

public final class DefenciveSubsystemImpl implements DefenciveSubsystem {

	private String name;

	private PositiveInteger impactReduction;

	private PositiveInteger shieldRegen;

	private PositiveInteger hullRegen;

	private PositiveInteger capacitorUsage;

	private PositiveInteger pgRequirement;

	public DefenciveSubsystemImpl(DefenciveSubsystemBuilder builder) {
		this.name = builder.getName();
		this.impactReduction = builder.getImpactReduction();
		this.shieldRegen = builder.getShieldRegen();
		this.hullRegen = builder.getHullRegen();
		this.capacitorUsage = builder.getCapacitorUsage();
		this.pgRequirement = builder.getPgRequirement();
	}

	public static DefenciveSubsystemImpl construct(String name, PositiveInteger powergridConsumption,
												   PositiveInteger capacitorConsumption, PositiveInteger impactReductionPercent,
												   PositiveInteger shieldRegeneration, PositiveInteger hullRegeneration) throws IllegalArgumentException {
		if(name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name should be not null and not empty");
		}
		return DefenciveSubsystemBuilder.named(name).impactReduction(impactReductionPercent.value()).shieldRegen(shieldRegeneration.value())
				.capacitorUsage(capacitorConsumption.value()).hullRegen(hullRegeneration.value()).pg(powergridConsumption.value()).construct();
	}

	@Override
	public PositiveInteger getPowerGridConsumption() {

		return pgRequirement;
	}

	@Override
	public PositiveInteger getCapacitorConsumption() {

		return capacitorUsage;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public AttackAction reduceDamage(AttackAction incomingDamage) {
		// TODO: Ваш код здесь :)
		return null;
	}

	@Override
	public RegenerateAction regenerate() {
		// TODO: Ваш код здесь :)
		return null;
	}

}
