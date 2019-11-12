package com.sapient.zuul;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;



public class ZuulLoggingFilter extends ZuulFilter{
	
	private Logger logger = LoggerFactory.getLogger(ZuulLoggingFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("request -> {} request uri -> {}",request,request.getRequestURI());		
		return request;
	}

	@Override
	public String filterType() {
		return null;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
