package com.hh.demo.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Function:
 * <P> 版权所有 ©2013 Biostime Inc.. All Rights Reserved
 * <p> 未经本公司许可，不得以任何方式复制或使用本程序任何部分 <p>
 * User: 12360
 * Date: 2017/6/26
 * Time: 10:37
 */
public class AccessFilter extends ZuulFilter{

    private static final Logger logger = Logger.getLogger(ZuulFilter.class.getName());

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        logger.info("send "+request.getMethod()+" request to "+request.getRequestURI().toString());

        Object accessToken = request.getParameter("appKey");
        if(accessToken == null){
            logger.warning("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("access token is empty");
        }
        logger.info("access token ok");
        return null;
    }
}
