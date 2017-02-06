package com.itcast.web.simple.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/*
 * 控制标签体是否输出
 */
public class SimpleTagDemo1 extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspFragment jspFragment=this.getJspBody();
//		jspFragment.invoke(this.getJspContext().getOut());  == jspFragment.invoke(null);
//		jspFragment.invoke(null);
	}
	
}
