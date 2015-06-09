package com.terasoft.rnd.gitprac.car.engine;

public class EngineBuilder {

	public Engine buildBasicEngine()
	{
		Engine engine = new Engine();
		engine.addPart(new EnginePart("Camshaft"));
		engine.addPart(new EnginePart("Valve Cover"));
		engine.addPart(new EnginePart("Intake Valve"));
		engine.addPart(new EnginePart("Intake Port"));
		engine.addPart(new EnginePart("Head"));
		engine.addPart(new EnginePart("Coolant"));
		engine.addPart(new EnginePart("Engine Block"));
		engine.addPart(new EnginePart("Oil Pan"));
		engine.addPart(new EnginePart("Oil Sump"));
		engine.addPart(new EnginePart("Spark Plug"));
		engine.addPart(new EnginePart("Exhaust Valve"));
		engine.addPart(new EnginePart("Exhaust Port"));
		engine.addPart(new EnginePart("Piston"));
		engine.addPart(new EnginePart("Cylinder"));
		engine.addPart(new EnginePart("Piston Rings"));
		engine.addPart(new EnginePart("Connecting Rod"));
		engine.addPart(new EnginePart("Rod Bearing"));
		engine.addPart(new EnginePart("Crankshaft"));
		return engine;
	}
	
}
