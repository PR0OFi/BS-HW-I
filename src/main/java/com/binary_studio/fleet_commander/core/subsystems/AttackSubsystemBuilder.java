package com.binary_studio.fleet_commander.core.subsystems;

import com.binary_studio.fleet_commander.core.common.PositiveInteger;

public final class AttackSubsystemBuilder {

	private String name;

	private PositiveInteger baseDamage;

	private PositiveInteger optimalSize;

	private PositiveInteger optimalSpeed;

	private PositiveInteger capacitorUsage;

	private PositiveInteger pgRequirement;

	public static AttackSubsystemBuilder named(String name) {
		var builder = new AttackSubsystemBuilder();
		builder.name = name;
		return builder;
	}

	public String getName() {
		return name;
	}

	public PositiveInteger getBaseDamage() {
		return baseDamage;
	}

	public PositiveInteger getOptimalSize() {
		return optimalSize;
	}

	public PositiveInteger getOptimalSpeed() {
		return optimalSpeed;
	}

	public PositiveInteger getCapacitorUsage() {
		return capacitorUsage;
	}

	public PositiveInteger getPgRequirement() {
		return pgRequirement;
	}


	public AttackSubsystemBuilder pg(Integer val) {
		this.pgRequirement = PositiveInteger.of(val);
		return this;
	}

	public AttackSubsystemBuilder damage(Integer val) {
		this.baseDamage = PositiveInteger.of(val);
		return this;
	}

	public AttackSubsystemBuilder optimalSize(Integer val) {
		this.optimalSize = PositiveInteger.of(val);
		return this;
	}

	public AttackSubsystemBuilder optimalSpeed(Integer val) {
		this.optimalSpeed = PositiveInteger.of(val);
		return this;
	}

	public AttackSubsystemBuilder capacitorUsage(Integer val) {
		this.capacitorUsage = PositiveInteger.of(val);
		return this;
	}

	public AttackSubsystemImpl construct() {
		return new AttackSubsystemImpl(this);
	}

}
