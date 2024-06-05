package in.ashokit.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable {


	private Long accNum;
	private String accType;
	public Long getAccNum() {
		return accNum;
	}
	public void setAccNum(long i) {
		this.accNum = i;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public AccountPK(Long accNum, String accType) {
		super();
		this.accNum = accNum;
		this.accType = accType;
	}
	public AccountPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AccountPK [accNum=" + accNum + ", accType=" + accType + "]";
	}	


}
