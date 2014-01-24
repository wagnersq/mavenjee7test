package br.com.wagnersq;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class MavenTestResource {

	@GET
	public String show() {
		return "Maven rocks";
	}

}