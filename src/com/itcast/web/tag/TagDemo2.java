package com.itcast.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * ��������jspҳ���Ƿ����
 */
public class TagDemo2 extends TagSupport{

	@Override
	public int doEndTag() throws JspException {
		return Tag.SKIP_PAGE;
	}
	
}
