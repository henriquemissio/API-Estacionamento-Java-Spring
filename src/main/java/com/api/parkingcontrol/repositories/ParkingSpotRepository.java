package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
/*
* Extende de JPA Repository e passa o UUID que é o ID do Model
* Extendemos o JPA pois ele possui vários metodos prontos para transações com banco de dados
* como buscar listagem, salvar, deletar esse recurso, assim ele já trás a simplicação desses
* recursos, utilizando o Spring Data, facilitando nosso trabalho.
* */

@Repository //Para transações com o banco de dados
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
