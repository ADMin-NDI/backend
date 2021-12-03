package fr.sauveteurdudunkerquois.backend.data.article;

public class Article extends ArticleIdentity {
	private final String title;

	public Article(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
