package gostack.desafio01.filters;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;

import gostack.desafio01.error.ResourceNotFoundExeception;

// import org.springframework.stereotype.Component;

/**
 * VerifyProject
 */

public class VerifyProject implements HandlerInterceptor {

    private static Logger log = LoggerFactory.getLogger(VerifyProject.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        final Map<String, String> pathVariables = (Map<String, String>) request
                .getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);

        Integer pathId = Integer.valueOf(pathVariables.get("id"));

        log.info("FUI INTERCEPTADO, id: " + pathId);

        if (pathId != 1) {
            throw new ResourceNotFoundExeception("Project not found for id: " + pathId);
        }
        // return HandlerInterceptor.super.preHandle(request, response, handler);
        return true;
    }

}