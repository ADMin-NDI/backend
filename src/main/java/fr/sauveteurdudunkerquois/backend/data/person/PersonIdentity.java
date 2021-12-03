package fr.sauveteurdudunkerquois.backend.data.person;

import fr.sauveteurdudunkerquois.backend.data.DataIdentity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("person")
public class PersonIdentity extends DataIdentity {
	@Id
	public Long id;
	// TODO as ArticleIdentity
}
