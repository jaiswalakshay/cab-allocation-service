package com.akshay.dao;

import com.akshay.domain.Cab;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CabRepository extends PagingAndSortingRepository<Cab, Integer> {

    Cab findByCabId(String cabId);

    Cab save(Cab cab);

}
