package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
				SpringApplication.run(Application.class, args);
		AccountRepo bean=context.getBean(AccountRepo.class);
		
		//setting composite key values
		//AccountPK pk=new AccountPK();
		//pk.setAccNum(14555555);
		//pk.setAccType("savings");
		
		//setting entity data
		//Account acc=new Account();
		//acc.setHolderName("Ashoke");
		//acc.setBranch("Ameerper");
		//acc.setAccountPk(pk);
		
		
		
	//	bean.save(acc);
		//System.out.println("Reocrd saved");
	
	
		AccountPK pk=new AccountPK();
		pk.setAccNum(14555555);
		pk.setAccType("savings");
	}

}
