package com.itcast.example.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class WhenTag extends SimpleTagSupport{
	private boolean test;
	
	
	public void setTest(boolean test) {
		this.test = test;
	}


	@Override
	public void doTag() throws JspException, IOException {
		ChooseTag parentTag=(ChooseTag) this.getParent();
		if (test && !parentTag.isDo()) {
			this.getJspBody().invoke(null);
			parentTag.setDo(true);
		}
	}
}
