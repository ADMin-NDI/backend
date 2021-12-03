package fr.sauveteurdudunkerquois.backend.data.article;

import fr.sauveteurdudunkerquois.backend.data.DataIdentity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Table("article")
public class ArticleIdentity extends DataIdentity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	public String title;
	public Date date = new Date();
	public String description;
	public String source;
	public String image;
	public String lieu;
}
