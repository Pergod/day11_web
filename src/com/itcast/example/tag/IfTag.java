package com.itcast.example.tag;


import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class IfTag extends SimpleTagSupport{
	private boolean test;
	
	public void setTest(boolean test) {
		this.test = test;
	}
	@Override
	public void doTag() throws JspException, IOException {
		JspFragment jspFragment=this.getJspBody();
		if (test) {
			jspFragment.invoke(null);
		}
	}
}
