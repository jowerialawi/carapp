package com.terasoft.rnd.gitprac.car.engine;

import java.util.List;

public interface ISystemPart {
	public String name();
	public List<ISystemPart> subparts();
	public void addSubPart(ISystemPart part);
	public void rmvSubPart(ISystemPart part);
}
