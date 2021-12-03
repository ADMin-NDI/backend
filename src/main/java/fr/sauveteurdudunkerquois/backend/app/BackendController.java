package fr.sauveteurdudunkerquois.backend.app;

import fr.sauveteurdudunkerquois.backend.data.article.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
    private final BackendRepository repo;

    public BackendController(BackendRepository repository) {
        repo = repository;
    }

    @PostMapping("/api/article")
    public void addArticle(@RequestBody Article article) {}

    @GetMapping("/api/article")
    public void getArticles() {}

    @GetMapping("/api/repo")
    public BackendRepository getRepo() {
		return repo;
    }
}
