package fr.sauveteurdudunkerquois.backend.app;

import fr.sauveteurdudunkerquois.backend.data.article.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/articles")
public class BackendController {
	@Autowired
    private final BackendRepository repo;

    public BackendController(BackendRepository repository) {
        repo = repository;
    }

    @PostMapping
    public void addArticle(@RequestBody Article article) {
		repo.save(article);
	}

    @GetMapping
    public ResponseEntity<List<Article>> getArticles() {
		List<Article> articles = new ArrayList<>();
		repo.findAll().forEach(e -> {
			if (e.getClass().equals(Article.class))
				articles.add((Article) e);
		});
		return ResponseEntity.ok(articles);
	}
}
