package com.ll.chatApp.domain.article.article.repository;

import com.ll.chatApp.domain.article.article.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    Page<Article> findByTitileContainIngOrContentContaining(String kwTypes, String kw, Pageable pageable);

    Page<Article> findByTitileContainIng(String kwTypes, String kw, Pageable pageable);

    Page<Article> findByContentContainIng(String kwTypes, String kw, Pageable pageable);
}
