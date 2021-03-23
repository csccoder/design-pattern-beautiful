package org.geektimes.chainOfResponsibility.v5.filter;

import org.geektimes.chainOfResponsibility.v5.http.Request;
import org.geektimes.chainOfResponsibility.v5.http.Response;

public interface FilterChain {

    void doFilter(Request request, Response response);
}
