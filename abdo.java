public class Client {
	private long idClient;
	private String name;
	private String prenome ;
	public Client(long idClient, String name, String prenome) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.prenome = prenome;
	}
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenome() {
		return prenome;
	}
	public void setPrenome(String prenome) {
		this.prenome = prenome;
	}
	

}