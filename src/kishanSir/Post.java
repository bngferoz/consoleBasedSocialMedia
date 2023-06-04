package kishanSir;

public class Post implements Likeable {
	private String content;
	private int likes;
	
	public Post(String content) {
		this.content = content;
	}
	
	@Override
	public void like() {
		this.likes++;

	}

	@Override
	public void unlike() {
		this.likes--;

	}
	public String getContent() {
		return this.content;
	}
	
	public int getLikes() {
		return likes;
	}

}
