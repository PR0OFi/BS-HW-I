package com.binary_studio.fleet_commander.core.subsystems;

import com.binary_studio.fleet_commander.core.common.Attackable;
import com.binary_studio.fleet_commander.core.common.PositiveInteger;
import com.binary_studio.fleet_commander.core.subsystems.contract.AttackSubsystem;

public final class AttackSubsystemImpl implements AttackSubsystem {

	public static AttackSubsystemImpl construct(String name, PositiveInteger powergridRequirments,
			PositiveInteger capacitorConsumption, PositiveInteger optimalSpeed, PositiveInteger optimalSize,
			PositiveInteger baseDamage) throws IllegalArgumentException {

		if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name should be not null and not empty");
		} else {
			return AttackSubsystemBuilder.named(name).pg(powergridRequirments.value())
					.capacitorUsage(capacitorConsumption.value()).optimalSpeed(optimalSpeed.value()).
							optimalSize(optimalSize.value()).damage(baseDamage.value()).construct();
		}
	}

	@Override
	public PositiveInteger getPowerGridConsumption() {
		// TODO: Ваш код здесь :)
		return null;
	}

	@Override
	public PositiveInteger getCapacitorConsumption() {
		// TODO: Ваш код здесь :)
		return null;
	}

	@Override
	public PositiveInteger attack(Attackable target) {
		// TODO: Ваш код здесь :)
		return null;
	}

	@Override
	public String getName() {
		// TODO
		return null;
	}

}
