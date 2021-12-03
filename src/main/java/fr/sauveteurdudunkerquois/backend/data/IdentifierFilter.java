package fr.sauveteurdudunkerquois.backend.data;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class IdentifierFilter implements Filter {
	private final String uuid;

	public IdentifierFilter() {
		uuid = UUID.randomUUID().toString();
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
		((HttpServletResponse)servletResponse).setHeader("Instance-ID", uuid);
	}
}
