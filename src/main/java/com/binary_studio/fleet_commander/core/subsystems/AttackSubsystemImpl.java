package com.binary_studio.fleet_commander.core.subsystems;

import com.binary_studio.fleet_commander.core.common.Attackable;
import com.binary_studio.fleet_commander.core.common.PositiveInteger;
import com.binary_studio.fleet_commander.core.subsystems.contract.AttackSubsystem;

public final class AttackSubsystemImpl implements AttackSubsystem {

	private String name;

	private PositiveInteger baseDamage;

	private PositiveInteger optimalSize;

	private PositiveInteger optimalSpeed;

	private PositiveInteger capacitorUsage;

	private PositiveInteger pgRequirement;

	public AttackSubsystemImpl(AttackSubsystemBuilder builder){
		this.name = builder.getName();
		this.baseDamage = builder.getBaseDamage();
		this.optimalSize = builder.getOptimalSize();
		this.optimalSpeed = builder.getOptimalSpeed();
		this.capacitorUsage = builder.getCapacitorUsage();
		this.pgRequirement = builder.getPgRequirement();
	}

	public static AttackSubsystemImpl construct(String name, PositiveInteger powergridRequirments,
			PositiveInteger capacitorConsumption, PositiveInteger optimalSpeed, PositiveInteger optimalSize,
			PositiveInteger baseDamage) throws IllegalArgumentException {

		if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name should be not null and not empty");}
		return AttackSubsystemBuilder.named(name).pg(powergridRequirments.value())
				.capacitorUsage(capacitorConsumption.value()).optimalSpeed(optimalSpeed.value()).
						optimalSize(optimalSize.value()).damage(baseDamage.value()).construct();
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
	public PositiveInteger attack(Attackable target) {
		// TODO: Ваш код здесь :)
		return null;
	}

	@Override
	public String getName() {

		return name;
	}

}
