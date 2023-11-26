package com.codebyarunyadav.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codebyarunyadav.orderservice.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
