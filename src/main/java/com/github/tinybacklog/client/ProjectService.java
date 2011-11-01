package com.github.tinybacklog.client;

import com.github.tinybacklog.shared.Project;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("project")
public interface ProjectService extends RemoteService {
	Project createPoject(Project project) throws IllegalArgumentException;
}
