package fr.sauveteurdudunkerquois.backend.data.article;

public class Article extends ArticleIdentity {

	public void setTitle(String title) {
		super.title = title;
	}

	public void setDescription(String description) {
		super.description = description;
	}

	public void setImage(String image) {
		super.image = image;
	}

	public void setLieu(String lieu) {
		super.lieu = lieu;
	}

	public void setSource(String source) {
		super.source = source;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

	public String getLieu() {
		return lieu;
	}

	public String getSource() {
		return source;
	}
}
