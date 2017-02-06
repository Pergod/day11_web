package com.itcast.web.simple.tag;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/*
 * µü´ú±êÇ©Ìå
 */
public class SimpleTagDemo5 extends SimpleTagSupport{
	
	private int count;
	private Date date;
	
	public void setDate(Date date) {
		this.date = date;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		JspFragment jspFragment=this.getJspBody();
		this.getJspContext().getOut().write(date.toGMTString());
		for(int i=0;i<count;i++){
			jspFragment.invoke(null);
		}
	}
}
