package fr.sauveteurdudunkerquois.backend.app;

import fr.sauveteurdudunkerquois.backend.data.DataIdentity;
import fr.sauveteurdudunkerquois.backend.data.article.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.StreamSupport;

@RestController
public class BackendController {
    private final BackendRepository repo;

    public BackendController(BackendRepository repository) {
        repo = repository;
    }

    @PostMapping("/api/article")
    public void addArticle(@RequestBody Article article) {
		repo.save(article);
	}

    @GetMapping("/api/articles")
    public List<DataIdentity> getArticles() {
		return StreamSupport.stream(repo.findAll().spliterator(), false)
			.filter(data -> data.getClass().equals(Article.class))
			.toList();
	}

    @GetMapping("/api/repo")
    public BackendRepository getRepo() {
		return repo;
    }
}
