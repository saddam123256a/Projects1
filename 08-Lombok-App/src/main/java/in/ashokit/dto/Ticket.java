package in.ashokit.dto;

public class Ticket {

	private Integer ticketId;
	private String from;
	private String to;
	private String doj;
	
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ticket(Integer ticketId, String from, String to, String doj) {
		super();
		this.ticketId = ticketId;
		this.from = from;
		this.to = to;
		this.doj = doj;
	}

	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", from=" + from + ", to=" + to + ", doj=" + doj + "]";
	}


}
