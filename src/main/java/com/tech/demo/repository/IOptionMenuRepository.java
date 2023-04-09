package com.tech.demo.repository;

import com.tech.demo.document.OptionsMenu;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOptionMenuRepository extends ReactiveMongoRepository<OptionsMenu, String> {
}
