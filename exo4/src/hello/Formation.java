package hello;

public class Formation {
	
	private int id;
	private String label;
	public Formation (int id, String label) {
			this.id = id;
			this.label = label;

	}
	
	public Formation() {
		// TODO Auto-generated constructor stub
	}

	public String getInfo() {
		return String.format("%d %s", id, label);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
