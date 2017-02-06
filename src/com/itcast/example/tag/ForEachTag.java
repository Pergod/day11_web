package com.itcast.example.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ForEachTag extends SimpleTagSupport{
	private Object item;
	private String var;
	private Collection collection;
	
	public void setItem(Object item) {
		this.item = item;
		if (item instanceof Collection) {
			collection=(Collection)item;
		}
		if (item instanceof Map) {
			Map map=(Map)item;
			collection=map.entrySet();
		}
		if (item instanceof Object[]) {
			Object obj[] =(Object[])item;
			Arrays.asList(obj);
		}
	}
	public void setVar(String var) {
		this.var = var;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		List list=(ArrayList)item;
		Iterator iterator=list.iterator();
		while (iterator.hasNext()) {
			this.getJspContext().setAttribute(var, iterator.next());
			this.getJspBody().invoke(null);
		}
	}
}
