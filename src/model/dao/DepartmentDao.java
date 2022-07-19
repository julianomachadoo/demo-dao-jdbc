package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	/* Comunicação direta com o JDBC 
	*/
	void insert(Department obj);	// insere departamento no banco de dados
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
