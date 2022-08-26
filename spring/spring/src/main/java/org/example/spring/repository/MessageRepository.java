package org.example.spring.repository;

import org.example.spring.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findByTagOrText(String tag, String text);
}
