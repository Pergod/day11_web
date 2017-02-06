package com.itcast.web.simple.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/*
 * µü´ú±êÇ©Ìå
 */
public class SimpleTagDemo4 extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspFragment jspFragment=this.getJspBody();
		StringWriter sw=new StringWriter();
		jspFragment.invoke(sw);
		String content=sw.toString();
		content=content.toUpperCase();
		this.getJspContext().getOut().write(content);
	}
	
}
