package com.app.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Billing;
import com.app.model.PerformaInvoice;
import com.app.model.ProjectDetails;
import com.app.service.impl.BillingServiceImpl;
import com.app.service.impl.PerformaInvoiceServiceImpl;
import com.app.service.impl.ProjectDetailsServiceImpl;

@Component
public class ConsoleRunner implements CommandLineRunner {

	
	  @Autowired private BillingServiceImpl ser1;
	  @Autowired private PerformaInvoiceServiceImpl ser2;
	  @Autowired private ProjectDetailsServiceImpl ser3;
	 
	public void run(String... args) throws Exception {

		Billing b = new Billing();
		b.setBillNumber("Bill101");
		b.setBillDate(new Date());
		b.setBillAmount(3.2);
		ser1.saveBilling(b);
		
		PerformaInvoice pi = new PerformaInvoice();
		pi.setPiNumber("PI101");
		pi.setPiDate(new Date());
		pi.setPiAmount(2.3);
		ser2.savePerformaInvoice(pi);
		
		
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
		
		ser3.saveProjectDetails(pd);

		
	}
}