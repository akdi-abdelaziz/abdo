public class Etudiant {

	private long IdEtudiant;
	private String NomeEtudiant;
	private String PrenomeEtudiant ;
	
	public Etudiant() {
		super();
	}

	public Etudiant(long idEtudiant, String nomeEtudiant, String prenomeEtudiant) {
		super();
		IdEtudiant = idEtudiant;
		NomeEtudiant = nomeEtudiant;
		PrenomeEtudiant = prenomeEtudiant;
	}

	public long getIdEtudiant() {
		return IdEtudiant;
	}

	public void setIdEtudiant(long idEtudiant) {
		IdEtudiant = idEtudiant;
	}

	public String getNomeEtudiant() {
		return NomeEtudiant;
	}

	public void setNomeEtudiant(String nomeEtudiant) {
		NomeEtudiant = nomeEtudiant;
	}

	public String getPrenomeEtudiant() {
		return PrenomeEtudiant;
	}

	public void setPrenomeEtudiant(String prenomeEtudiant) {
		PrenomeEtudiant = prenomeEtudiant;
	}

}
