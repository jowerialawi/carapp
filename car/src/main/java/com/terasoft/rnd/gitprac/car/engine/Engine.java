package com.terasoft.rnd.gitprac.car.engine;

import java.util.ArrayList;
import java.util.List;

public class Engine implements ISystem {

	private String engine_name = "engine"; 
	private List<ISystem> engine_subsystems = new ArrayList<ISystem>();
	private List<ISystemPart> engine_parts = new ArrayList<ISystemPart>();
	
	public String name() {
		return engine_name;
	}

	public List<ISystemPart> parts() {
		return engine_parts;
	}

	public List<ISystem> subsystems() {
		return engine_subsystems;
	}

	public void addPart(ISystemPart part) {
		this.engine_parts.add(part);
	}

	public void addSystem(ISystem system) {
		this.engine_subsystems.add(system);
	}

	public void rmvPart(ISystemPart part) {
		this.engine_parts.remove(part);
	}

	public void rmvSystem(ISystem system) {
		this.engine_subsystems.remove(system);
	}

}
