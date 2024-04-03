package org.springframework.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.msscbeerservice.domain.Beer;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
