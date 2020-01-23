package com.pragim.jersyrestexample.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.http.MediaType;

import com.pragim.jersyrestexample.model.User;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users")
@Path("/user")
public class UserController {

	static List<User> userlist = null;
	static {
		userlist = new ArrayList<User>();
		userlist.add(new User(101, "kamal", "bangl"));
		userlist.add(new User(102, "john", "bangl"));
		userlist.add(new User(103, "nithin", "bangl"));
		userlist.add(new User(104, "abhi", "bangl"));
	}
	
	@Context 
    private ServletContext servletContext;

	@GET
	@Path("/list")
	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getuserList() {
		return userlist;
	}

	@POST
	@Path("/add")
	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
	public Response addUser(User user) throws URISyntaxException {
		userlist.add(user);
		Map<String, String> map = new HashMap<String, String>();
		map.put("msg", "user added!!");
		System.out.println(servletContext.getContextPath());
		return Response.status(200).entity(map).contentLocation(new URI(servletContext.getContextPath()+"/user/find/"+user.getId())).build();
	}
	
	@GET
	@Path("/find/{id}")
	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
	public Response findUser(@PathParam("id") String id) {
		int uid = Integer.parseInt(id);
		User userdata = null;
		for (User user : userlist) {
			if(user.getId() == uid){
				userdata = user;
				break;
			}
				
				
		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("msg", "user added!!");
		return Response.status(200).entity(userdata).build();
	}

	@DELETE
	@Path("/delete")
	@Produces(value = MediaType.APPLICATION_JSON_VALUE)
	public Response deleteUser(@QueryParam("id") String id) {
		int uid = Integer.parseInt(id);

		Iterator<User> iterator = userlist.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (uid == user.getId())
				iterator.remove();
		}

		Map<String, String> map = new HashMap<String, String>();
		map.put("msg", "user deleted!!");
		return Response.status(200).entity(map).build();
	}

}
