package gostack.desafio01.filters;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

/**
 * NumberOfRequests
 */
@Component
public class NumberOfRequests implements Filter {

    private final AtomicInteger counter = new AtomicInteger();

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain next)
            throws IOException, ServletException {

        System.out.println("\n Total de requisicoes: " + counter.incrementAndGet() + " \n");
        next.doFilter(req, res);
    }

}