package com.itcast.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * 控制标签循环输出
 */
public class TagDemo3 extends TagSupport{
	
	private int x=10;
	@Override
	public int doStartTag() throws JspException {
		return Tag.EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		this.x--;
		if (x>0) {
			return IterationTag.EVAL_BODY_AGAIN;
		}else {
			return IterationTag.SKIP_BODY;
		}
	}
}
