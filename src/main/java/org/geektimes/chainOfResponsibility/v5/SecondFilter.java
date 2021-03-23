package org.geektimes.chainOfResponsibility.v5;

import org.geektimes.chainOfResponsibility.v5.filter.Filter;
import org.geektimes.chainOfResponsibility.v5.filter.FilterChain;
import org.geektimes.chainOfResponsibility.v5.http.Request;
import org.geektimes.chainOfResponsibility.v5.http.Response;

public class SecondFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("SecondFilter ...start");
        filterChain.doFilter(request, response);
        System.out.println("SecondFilter ...end");
    }
}
