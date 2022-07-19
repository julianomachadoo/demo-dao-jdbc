package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	/* Comunicação direta com o JDBC 
	*/
	void insert(Seller seller);	// insere departamento no banco de dados
	void update(Seller seller);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
