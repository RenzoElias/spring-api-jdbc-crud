package com.renzoelias.app.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.renzoelias.app.model.Pais;

public class PruebaListaRowMapper implements RowMapper<Pais>{
	
	public Pais mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pais pais= new Pais();
		pais.setId(rs.getInt("id"));
		pais.setNombre(rs.getString("nombre"));
		
		return pais;
	}

}
