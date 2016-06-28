package com.jinlong.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")            //URI
public class V1_status {

	private static final String api_version= "00.01.11";
	
	@GET
	@Produces(MediaType.TEXT_XML)    
	// XML.JSON
	
	public String returnTitle()
	{
		return 	"<?xml version='1.0' ?>"+
				"<p> Welcome to web services</p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_XML)    
	// XML.JSON
	
	public String returnVersion()
	{
		return 	"<?xml version='1.0' ?>"+
				"<p>Version: "+ api_version +"</p>";
	}
	
	
	
}
