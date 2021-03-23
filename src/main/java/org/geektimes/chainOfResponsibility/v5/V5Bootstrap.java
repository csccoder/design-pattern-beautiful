package org.geektimes.chainOfResponsibility.v5;

import org.geektimes.chainOfResponsibility.v5.filter.ApplicationFilterChain;
import org.geektimes.chainOfResponsibility.v5.filter.FilterChain;
import org.geektimes.chainOfResponsibility.v5.http.Request;
import org.geektimes.chainOfResponsibility.v5.http.Response;

public class V5Bootstrap {
    public static void main(String[] args) {
        ApplicationFilterChain applicationFilterChain = new ApplicationFilterChain();

        applicationFilterChain.addFilter(new FirstFilter());
        applicationFilterChain.addFilter(new SecondFilter());
        applicationFilterChain.addFilter(new ThirdFilter());

        applicationFilterChain.setServlet(((request, response) -> {
            System.out.println("servlet service....");
        }));

        Request request = null;
        Response response = null;
        FilterChain filterChain = applicationFilterChain;
        filterChain.doFilter(request, response);
    }
}
