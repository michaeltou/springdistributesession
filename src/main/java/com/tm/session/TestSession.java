package com.tm.session;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/4/14.
 */
@RestController
public class TestSession {

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public Map<String, Object> firstResp (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.getSession().setAttribute("map", request.getRequestURL());
        map.put("request Url", request.getRequestURL());
        return map;
    }

    @RequestMapping(value = "/sessions", method = RequestMethod.GET)
    public Object sessions (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("map"));
        return map;
    }


    @RequestMapping(value = "/putsession", method = RequestMethod.GET)
    public Object putsession (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.getSession().setAttribute("sessiondata","this is michael login data");
        map.put("sessionId is:", request.getSession().getId());
        return map;
    }


    @RequestMapping(value = "/session", method = RequestMethod.GET)
    public Object session (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId is:", request.getSession().getId());
        map.put("session data is:", request.getSession().getAttribute("sessiondata"));
        return map;
    }

}
