package com.terasoft.rnd.gitprac.car.engine;

import java.util.List;

public interface ISystem {
	
	public String name();
	public List<ISystemPart> parts();
	public List<ISystem> subsystems();
	public void addPart(ISystemPart part);
	public void addSystem(ISystem system);
	public void rmvPart(ISystemPart part);
	public void rmvSystem(ISystem system);
	
}
