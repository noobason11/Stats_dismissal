package com.ihorcom.statistics.repos;

import org.springframework.data.repository.CrudRepository;

import com.ihorcom.statistics.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long>  {
    List<Message> findByTag(String tag);
}
