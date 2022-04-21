package com.okno.kubki.beer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MugRepository extends JpaRepository<Mug, Integer> {

    Mug findById (int id);
}
