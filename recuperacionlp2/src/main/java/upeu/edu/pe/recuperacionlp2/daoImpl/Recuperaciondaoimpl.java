package upeu.edu.pe.recuperacionlp2.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.recuperacionlp2.dao.Operaciones;

@Component
public class Recuperaciondaoimpl  implements Operaciones{
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public List<Map<String, Object>> Readcantidadclienteregion() {
		String sql= "select r.RegionDescription as region, count(*) as cantidad from orders as o\r\n"
				+ "join customers as c on c.CustomerID=o.CustomerID\r\n"
				+ "join employees as e on e.EmployeeID=o.EmployeeID\r\n"
				+ "join employeeterritories as tr on tr.EmployeeID=e.EmployeeID\r\n"
				+ "join territories as te on te.TerritoryID=tr.TerritoryID\r\n"
				+ "join region as r on r.RegionID=te.RegionID\r\n"
				+ "group by r.RegionDescription\r\n"
				+ "order by RegionDescription;";
		return jdbctemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> Readordenesporterritorio() {
		String sql= "select te.TerritoryDescription as Territorio, count(*) as orden from orders ord\r\n"
				+ "join customers cu on cu.CustomerID=ord.CustomerID\r\n"
				+ "join employees em on em.EmployeeID=ord.EmployeeID\r\n"
				+ "join employeeterritories terr on terr.EmployeeID=em.EmployeeID\r\n"
				+ "join territories te on te.TerritoryID=terr.TerritoryID\r\n"
				+ "group by te.TerritoryDescription\r\n"
				+ "order by TerritoryDescription;";
		return jdbctemplate.queryForList(sql);
	}

}
