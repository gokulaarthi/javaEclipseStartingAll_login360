package bank_in;

public class Transition {
	
	private String id;
	private String date;
	private int ammount;
	private String type;
	
	public Transition(String id, String date, int ammount, String type) {
		super();
		this.id = id;
		this.date = date;
		this.ammount = ammount;
		this.type = type;
	}
	//geter settter
	public String getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public int getAmmount() {
		return ammount;
	}
	public String getType() {
		return type;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Transition_id=" + id + ", date=" + date + ", ammount=" + ammount + ", type=" + type ;
	}

}
