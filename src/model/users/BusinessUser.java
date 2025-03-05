package model.users;

import java.util.ArrayList;

import model.Page;
import model.PostType;
public class BusinessUser extends RegisteredUser{
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	
	//id, username and password will be inherited from base classes
	private String businessName;
	private ArrayList<Page> pages = new ArrayList<Page>();
	
	
	
	@Override
	public void createPost(PostType postType, String... params) throws Exception 
	{
		
	}


}
