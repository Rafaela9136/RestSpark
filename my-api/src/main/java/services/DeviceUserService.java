package services;

import java.util.Arrays;
import java.util.List;

import objects.DeviceUser;

public class DeviceUserService {
	 
	  DeviceUser user1 = new DeviceUser("Maria", "123", "Maria", "Vasconcelos");
	  DeviceUser user2 = new DeviceUser("Pedro", "345", "Pedro", "Vasconcelos");
	  DeviceUser user3 = new DeviceUser("Gabriel", "123", "Gabriel", "Vasconcelos");
	  
	  private List<DeviceUser> users = Arrays.asList(user1, user2, user3);	  
	  
	  // returns a list of all users
	  public List<DeviceUser> getAllUsers() { 
		  return users;
	  }
	   
	  // returns a single user by id
	  public DeviceUser getUser(String nick, String pass) { 
		  DeviceUser user = null;
		  for (DeviceUser deviceUser : users) {
			if(deviceUser.getNickName().equals(nick) && deviceUser.getPassword().equals(pass)) {
				user = deviceUser;
			}
		}
		  return user;
	  }
	 
	  // creates a new user
	  public DeviceUser createUser(String name, String email) { 
		  return null;
	  }
	 
	  // updates an existing user
	  public DeviceUser updateUser(String id, String name, String email) {
		  return null;
	  }
	}