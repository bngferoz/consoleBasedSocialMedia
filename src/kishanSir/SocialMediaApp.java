package kishanSir;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaApp {
	List<User> users = new ArrayList<>();
	void addUser(User user) throws NullPointerException{
		if(user == null) throw new NullPointerException();
		this.users.add(user);
	}
	void removeUser(User user) throws NullPointerException{
		if(user == null)throw new NullPointerException();
		this.users.remove(user);
	}
	void displayAllUsers() {
		for(int i = 0 ;i<users.size();i++) {
			System.out.println("User "+i+1+" :");
			System.out.println("Username: "+users.get(i).username);
		}
	}
	void displayUserPosts(String username) {
		try {
			for(User user: users) {
				if(user.username.equals(username)) {
					
						try {
							RegularUser regularUser = (RegularUser) user;
						for(Post post: regularUser.posts) {
							System.out.println(post.getContent());
						}
						}catch(ClassCastException e) {
							System.out.println("Unable to convert user to Regular User");
						}
					}
			}
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	void likePost(String userName, String postContent) {
		try {
			for(User user: users) {
				if(user.username.equals(userName)) {
					
						try {
							RegularUser regularUser = (RegularUser) user;
						for(Post post: regularUser.posts) {
							if(post.getContent().equalsIgnoreCase(postContent)) {
								post.like();
							}
						}
						}catch(ClassCastException e) {
							System.out.println("Unable to convert user to Regular User");
						}
					}
			}
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	void unlikePost(String userName, String postContent) {
		try {
			for(User user: users) {
				if(user.username.equals(userName)) {
					
						try {
							RegularUser regularUser = (RegularUser) user;
						for(Post post: regularUser.posts) {
							if(post.getContent().equalsIgnoreCase(postContent)) {
								post.unlike();
							}
						}
						}catch(ClassCastException e) {
							System.out.println("Unable to convert user to Regular User");
						}
					}
			}
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
