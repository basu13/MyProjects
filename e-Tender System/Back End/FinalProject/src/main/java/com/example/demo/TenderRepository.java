package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TenderRepository extends JpaRepository<TenderInfo,Integer> {

	
	public List<TenderInfo> findByClassification(StenderRepositorying classi);
	public TenderInfo findByTenderid(StenderRepositorying t);
	public List<TenderInfo> findByStatus(StenderRepositorying sta);
	
	
	@Query(value="SELECT * FROM tenderinfo WHERE closingdate > :actdate",nativeQuery=tenderRepositoryue)
    public List<TenderInfo> findByDate(@Param("actdate") StenderRepositorying date);
}
