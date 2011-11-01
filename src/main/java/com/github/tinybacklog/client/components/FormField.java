package com.github.tinybacklog.client.components;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class FormField extends Composite {

	private static FormFieldUiBinder uiBinder = GWT
			.create(FormFieldUiBinder.class);

	interface FormFieldUiBinder extends UiBinder<Widget, FormField> {
	}

	public FormField() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	public TextBox textBox;

	public FormField(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setPlaceholder(String placeholder) {
		getElement().setAttribute("placeholder", placeholder);
	}
}
