package pt.ist.fenixWebFramework.renderers.utils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.jsp.PageContext;

public interface ModuleResolver {

    public String maybeResolveModule(HttpServletRequest request);

    public String maybeResolveActionMapping(String mapping, PageContext ctx);

}
