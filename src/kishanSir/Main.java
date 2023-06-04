package kishanSir;

public class Main {
 public static void main(String[] args) {
	RegularUser regularUser = new RegularUser("feroz", "feroz");
	regularUser.addPost("hello! This is my first post!");
	
	RegularUser unwantedUser = new RegularUser("user2", "user2");
	
	Admin admin = new Admin("admin", "admin", "admin");
	Post post = new Post("Hello World!");
	regularUser.addPost(post);
	SocialMediaApp socialMediaApp = new SocialMediaApp();
	
	try {
		socialMediaApp.addUser(regularUser);
	}catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	try {
		socialMediaApp.addUser(admin);
	}catch (NullPointerException e) {
		System.out.println("User is null");
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	
	socialMediaApp.addUser(unwantedUser);
	socialMediaApp.displayAllUsers();
	
	try {
		socialMediaApp.removeUser(unwantedUser);
	}catch (NullPointerException e) {
		System.out.println("User is null");
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	
	socialMediaApp.displayAllUsers();
	regularUser.addPost("hello!! This is my Second post!!");
	socialMediaApp.displayUserPosts("feroz");
	
	Post postObj = new Post("Hello! This is post class!!");
	regularUser.addPost(postObj);
	socialMediaApp.likePost("feroz", "Hello! This is post class!!");
	
	
}
}
