package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="account_tbl")
public class Account {
	
	private String holderName;
	private String branch;
	
	@EmbeddedId
	private AccountPK accountPk;

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public AccountPK getAccountPk() {
		return accountPk;
	}

	public void setAccountPk(AccountPK accountPk) {
		this.accountPk = accountPk;
	}



}