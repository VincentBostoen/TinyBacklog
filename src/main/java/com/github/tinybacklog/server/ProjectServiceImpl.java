package com.github.tinybacklog.server;

import com.github.tinybacklog.client.ProjectService;
import com.github.tinybacklog.shared.Project;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ProjectServiceImpl extends RemoteServiceServlet implements
		ProjectService {

	public Project createPoject(Project project) throws IllegalArgumentException {

		return project;
	}
}
