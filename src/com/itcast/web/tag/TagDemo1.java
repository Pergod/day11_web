package com.itcast.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * 控制标签体是否输出
 */
public class TagDemo1 extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		
		return Tag.EVAL_BODY_INCLUDE;
	}
	
}
