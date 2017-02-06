package com.itcast.web.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ViewIPTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		HttpServletRequest request=(HttpServletRequest) this.pageContext.getRequest();
		JspWriter out=this.pageContext.getOut();
		try {
			out.print(request.getContextPath());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return super.doStartTag();
	}

}
