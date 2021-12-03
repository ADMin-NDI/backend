package fr.sauveteurdudunkerquois.backend.data.article;

import fr.sauveteurdudunkerquois.backend.data.DataIdentity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("article")
public class ArticleIdentity extends DataIdentity {
	@Id
	public Long id;
	public String title;
}
