package com.itcast.web.simple.tag;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ReferTag extends SimpleTagSupport{
	
	private String site;
	private String page;

	public void setSite(String site) {
		this.site = site;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Override
	public void doTag() throws JspException, IOException {
		PageContext context=(PageContext) this.getJspContext();
		HttpServletRequest request=(HttpServletRequest) context.getRequest();
		HttpServletResponse response=(HttpServletResponse) context.getResponse();
		//得到来访者的Refer
		String referer=request.getHeader("referer");
		System.out.println(referer);
		System.out.println(site);
		System.out.println(page);
		System.out.println(request.getContextPath());
		System.out.println("========================");
		//判断来访者的页面是不是要防盗链的网站
		if (referer==null||!referer.startsWith(site)) {
				// day11/index.jsp
			if (page.startsWith(request.getContextPath())) {
				response.sendRedirect(page);
				// /index.jsp
			}else if (page.startsWith("/")) {
				response.sendRedirect(request.getContextPath()+page);
				// index.jsp
			}else {
				response.sendRedirect(request.getContextPath()+"/"+page);
			}
			throw new SkipPageException();
		}
	}
}
