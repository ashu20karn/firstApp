package com.app.runner;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Billing;
import com.app.model.FinancialYear;
import com.app.model.Location;
import com.app.model.PerformaInvoice;
import com.app.model.ProjectDetails;
import com.app.model.ProjectStatus;
import com.app.repo.BillingRepository;
import com.app.repo.FinancialYearRepository;
import com.app.repo.LocationRepository;
import com.app.repo.PerformaInvoiceRepository;
import com.app.repo.ProjectDetailsRepository;
import com.app.repo.ProjectStatusRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private LocationRepository repo1;
	@Autowired 
	private ProjectStatusRepository repo2;
	@Autowired
	private FinancialYearRepository repo3;
	@Autowired
	private ProjectDetailsRepository repo4;
	@Autowired
	private PerformaInvoiceRepository repo5;
	@Autowired
	private BillingRepository repo6;

	public void run(String... args) throws Exception {


		//Insert Location 
		repo1.save(new Location("Bhubaneswar")); 
		repo1.save(new Location("Delhi-Laxmi Nagar")); 
		repo1.save(new Location("Delhi-Shastri Park")); 
		repo1.save(new Location("Hyderabad")); 
		List<Location> l1 = repo1.findAll();
		l1.forEach(System.out::println);
		System.out.println("======================");
		// Insert Status
		repo2.save(new ProjectStatus("Active"));
		repo2.save(new ProjectStatus("Closed"));
		repo2.save(new ProjectStatus("Free"));
		List<ProjectStatus> l2 = repo2.findAll();
		l2.forEach(System.out::println);
		System.out.println("======================");

		// Insert Financial Year
		repo3.save(new FinancialYear("2014-2015"));
		repo3.save(new FinancialYear("2015-2016"));
		repo3.save(new FinancialYear("2016-2017"));
		repo3.save(new FinancialYear( "2017-2018"));
		repo3.save(new FinancialYear("2018-2019"));
		List<FinancialYear> l3 = repo3.findAll();
		l3.forEach(System.out::println);
		System.out.println("======================");

		Billing b = new Billing();
		b.setBillNumber("Bill101");
		b.setBillDate(new Date());
		b.setBillAmount(3.2);
		

		PerformaInvoice pi = new PerformaInvoice();
		pi.setPiNumber("PI101");
		pi.setPiDate(new Date());
		pi.setPiAmount(2.3);
		
		repo5.save(pi);
		repo6.save(b);
		
		List<PerformaInvoice> l4 = repo5.findAll();
		l4.forEach(System.out::println);
		System.out.println("======================");
		List<Billing> l5 = repo6.findAll();
		l5.forEach(System.out::println);
		System.out.println("======================");
		ProjectDetails pd = new ProjectDetails();
		pd.setProjNumber("PRJ101");
		pd.setProjName("MYPROJ");
		pd.setCloudAccNumber("ACC101");
		pd.setAmtRecvFrmUser(55.36);
		pd.setTdsAmount(2.3);
		pd.setRemarks("Done");
		pd.setLoc("NDLS");
		pd.setStatus("ACTIVE");
		pd.setYear("2018-2019");

		pd.getBill().add(b);
		pd.getPi().add(pi);


		repo4.save(pd);

		List<ProjectDetails> l6 = repo4.findAll();
		l4.forEach(System.out::println);
		System.out.println("======================");

	}

}