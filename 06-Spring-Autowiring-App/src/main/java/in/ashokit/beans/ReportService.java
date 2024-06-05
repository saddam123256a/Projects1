package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	
	//@Qualifier("mysqlDao")
	private ReportDao dao;
	
	@Autowired
	public ReportService(ReportDao dao) {
		this.dao=dao;
		System.out.println("ReportService::cons");
	}
	public void generateReport() {
		dao.getData();
		System.out.println("Report generator...");
	}
}
