package com.example.demo2.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class RequestModifier extends HttpServletRequestWrapper {
    HttpServletRequest request;

    public RequestModifier(HttpServletRequest request) {
        super(request);
    }

    public String getParameterToModify(String key){
        return "request.getParameter";
    }

}
