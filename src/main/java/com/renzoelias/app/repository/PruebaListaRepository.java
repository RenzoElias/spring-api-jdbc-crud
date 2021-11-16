package com.renzoelias.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.renzoelias.app.model.Pais;
import com.renzoelias.app.rowmapper.PruebaListaRowMapper;


@Repository
public class PruebaListaRepository {
	@Autowired
	JdbcTemplate sqlServer;
//	List<Pais>
	public String pruebaLista(Integer id){
		//instanciando que el String se pueda leer en la BD
		StringBuilder sql = new StringBuilder();
		sql.append("select nombre from pais where id = "+id);
		String listaPaises = sqlServer.queryForObject(sql.toString(), String.class);
		return listaPaises;
	}
	
	public List<Pais> obtenerLista(Integer id){
		//instanciando que el String se pueda leer en la BD
		StringBuilder sql = new StringBuilder();
		sql.append("select * from pais where id <= "+id);
		List<Pais> listaPaises = sqlServer.query(sql.toString(), new PruebaListaRowMapper());
		return listaPaises;
	}

}
