package com.itcast.web.simple.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/*
 *����jsp�Ƿ�ִ��
 */
public class SimpleTagDemo3 extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		throw new SkipPageException();
	}
	
}
