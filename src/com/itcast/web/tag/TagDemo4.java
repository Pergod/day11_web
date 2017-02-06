package com.itcast.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;

/*
 * 修改标签体内容
 */
public class TagDemo4 extends BodyTagSupport{

	@Override
	public int doStartTag() throws JspException {
		return BodyTag.EVAL_BODY_BUFFERED;
	}
	
	@Override
	public int doEndTag() throws JspException {
		BodyContent bodyContent=this.getBodyContent();
		String content=bodyContent.getString();
		content =content.toUpperCase();
		
		try {
			this.pageContext.getOut().write(content);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return BodyTag.EVAL_PAGE;
	}

}
