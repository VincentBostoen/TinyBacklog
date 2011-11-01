package com.github.tinybacklog.client;

import com.github.tinybacklog.client.components.FormField;
import com.github.tinybacklog.shared.Project;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

public class CreateProjectForm extends Composite {

	private final ProjectServiceAsync projectService = GWT
			.create(ProjectService.class);

	private static CreateProjectFormUiBinder uiBinder = GWT
			.create(CreateProjectFormUiBinder.class);

	interface CreateProjectFormUiBinder extends
			UiBinder<Widget, CreateProjectForm> {
	}

	public CreateProjectForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	FormField projectNameField;

	@UiField
	TextArea summaryField;

	@UiField
	FormField mailField;

	@UiField
	Button validateButton;

	@UiHandler("validateButton")
	void handleClick(ClickEvent e) {
		Project project = new Project();

		project.setName(projectNameField.textBox.getText());
		project.setSummary(summaryField.getText());
		project.setUserMail(mailField.textBox.getText());

		projectService.createPoject(project, new AsyncCallback<Project>() {
			public void onFailure(Throwable caught) {
				GWT.log("ERREUR", caught);
				Window.alert("KO");
			}

			public void onSuccess(Project createdProject) {
				Window.alert(createdProject.toString());
			}
		});
	}
}
