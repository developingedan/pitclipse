package org.pitest.pitclipse.pitrunner.model;

public interface EclipseStructureService {
	String packageFrom(String project, String mutatedClass);

	boolean isClassInProject(String mutatedClass, String project);
}
