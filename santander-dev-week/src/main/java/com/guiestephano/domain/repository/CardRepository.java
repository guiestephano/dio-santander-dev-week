package com.guiestephano.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guiestephano.domain.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>{

}
