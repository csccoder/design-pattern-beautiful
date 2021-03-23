package org.geektimes.chainOfResponsibility.v5.filter;

import org.geektimes.chainOfResponsibility.v5.http.Request;
import org.geektimes.chainOfResponsibility.v5.http.Response;

public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
