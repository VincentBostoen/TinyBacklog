package com.github.tinybacklog.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class TinyBacklog implements EntryPoint {

	public void onModuleLoad() {
		RootLayoutPanel.get().add(new CreateProjectForm());
  }
}
