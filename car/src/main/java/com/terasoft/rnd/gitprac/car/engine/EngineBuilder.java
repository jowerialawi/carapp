package com.terasoft.rnd.gitprac.car.engine;

public class EngineBuilder {

	public Engine buildBasicEngine()
	{
		Engine engine = new Engine();
		engine.addPart(new EnginePart("Camshaft"));
		engine.addPart(new EnginePart("ValveCover"));
		engine.addPart(new EnginePart("IntakeValve"));
		engine.addPart(new EnginePart("IntakePort"));
		engine.addPart(new EnginePart("Head"));
		engine.addPart(new EnginePart("Coolant"));
		engine.addPart(new EnginePart("EngineBlock"));
		engine.addPart(new EnginePart("OilPan"));
		engine.addPart(new EnginePart("OilSump"));
		engine.addPart(new EnginePart("SparkPlug"));
		engine.addPart(new EnginePart("ExhaustValve"));
		engine.addPart(new EnginePart("ExhaustPort"));
		engine.addPart(new EnginePart("Piston"));
		engine.addPart(new EnginePart("ConnectingRod"));
		engine.addPart(new EnginePart("RodBearing"));
		engine.addPart(new EnginePart("Crankshaft"));
		return engine;
	}
	
}
