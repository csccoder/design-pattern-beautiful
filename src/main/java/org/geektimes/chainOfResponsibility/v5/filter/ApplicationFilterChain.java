package org.geektimes.chainOfResponsibility.v5.filter;

import org.geektimes.chainOfResponsibility.v5.http.Request;
import org.geektimes.chainOfResponsibility.v5.http.Response;
import org.geektimes.chainOfResponsibility.v5.http.Servlet;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFilterChain implements FilterChain {

    private List<Filter> filterList = new ArrayList<>();

    private Servlet servlet;

    private int position;

    @Override
    public void doFilter(Request request, Response response) {
        if (position < filterList.size()) {
            Filter filter = filterList.get(position++);
            filter.doFilter(request, response, this);
        } else {
            servlet.service(request, response);
        }
    }

    public void addFilter(Filter filter) {
        this.filterList.add(filter);
    }

    public void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }
}
