package kishanSir;

import java.util.ArrayList;
import java.util.List;

public class RegularUser extends User{
	
	List<Post> posts = new ArrayList<>();

	public RegularUser(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayProfile() {
		System.out.println("User name: "+username);
		System.out.println("Password: "+ password);
		
	}
	void addPost(String post) {
		Post post2 = new Post("hello! This is a post!!");
		posts.add(post2);
	}
	void addPost(Post post) {
		posts.add(post);
	}

}
