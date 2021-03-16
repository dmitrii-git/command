package ru.geekbrains.javacommand.command.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.javacommand.command.entities.Errand;

@Repository
public interface ErrandRepository extends JpaRepository<Errand, Long> {
}
