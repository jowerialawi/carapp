package com.terasoft.rnd.gitprac.car.engine;

import java.util.ArrayList;
import java.util.List;

public class EnginePart implements ISystemPart {

	private String name = "";
	private List<ISystemPart> subparts = new ArrayList<ISystemPart>();
	
	public EnginePart(String name) {
		super();
		this.name = name;
	}

	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	public List<ISystemPart> subparts() {
		// TODO Auto-generated method stub
		return subparts;
	}

	public void addSubPart(ISystemPart part) {
		this.subparts.add(part);
	}

	public void rmvSubPart(ISystemPart part) {
		this.subparts.remove(part);
	}

}
