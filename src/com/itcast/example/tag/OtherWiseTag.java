package com.itcast.example.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class OtherWiseTag extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		ChooseTag parentTag=(ChooseTag) this.getParent();
		if (!parentTag.isDo()) {
			this.getJspBody().invoke(null);
		}
	}
}
