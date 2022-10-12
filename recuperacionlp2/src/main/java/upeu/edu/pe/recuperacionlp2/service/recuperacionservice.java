package upeu.edu.pe.recuperacionlp2.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.recuperacionlp2.dao.Operaciones;
import upeu.edu.pe.recuperacionlp2.daoImpl.Recuperaciondaoimpl;

@Service
public class recuperacionservice implements Operaciones {
	@Autowired
	private Recuperaciondaoimpl recuperaciondaoimpl;
	
	@Override
	public List<Map<String, Object>> Readcantidadclienteregion() {
		// TODO Auto-generated method stub
		return recuperaciondaoimpl.Readcantidadclienteregion();
	}

	@Override
	public List<Map<String, Object>> Readordenesporterritorio() {
		// TODO Auto-generated method stub
		return recuperaciondaoimpl.Readordenesporterritorio();
	}

}
