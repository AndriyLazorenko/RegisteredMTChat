package Lazorenko.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Lazorenko.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
