package hello;

import java.util.List;

import javax.sql.DataSource;

public interface ServiceDAO<T> { //template T
	
	void setDataDource(DataSource ds);
	void setDataDource();
	void ajouter(T t);
	List<T> lister();
	T trouver(int id);
	void modifier(T t);//modifie le label d'un id donné
	void supprimer(T t);
	
}
