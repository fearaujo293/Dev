package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entidades.Horário_Domain;

@Repository
public interface Horario_Repository extends JpaRepository<Horário_Domain, Long> {}
