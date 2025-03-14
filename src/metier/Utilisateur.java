package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Utilisateur")
public class Utilisateur {
	
	@Id
	@Column(name="idUtilisateur")
	private String idUtilisateur;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="login")
	private String login;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="cp")
	private String cp;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="dateEmbauche")
	private Date dateEmbauche;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telfixe")
	private String telfixe;
	
	@Column(name="telPortable")
	private String telPortable;
	
	@ManyToOne
	@JoinColumn(name="idRegion")
	private Region region;
	
	@ManyToOne
	@JoinColumn(name="idRole")
	private Role role;
	
	@OneToMany
	@JoinColumn(name="idVisiteur")
	private List<FicheFrais> lesFicheFrais;

	public Utilisateur(String idUtilisateur, String nom, String prenom, String login, String adresse, String cp,
			String ville, Date dateEmbauche, String email, String telfixe, String telPortable, Region region, Role role,
			List<FicheFrais> lesFicheFrais) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.dateEmbauche = dateEmbauche;
		this.email = email;
		this.telfixe = telfixe;
		this.telPortable = telPortable;
		this.region = region;
		this.role = role;
		this.lesFicheFrais = lesFicheFrais;
	}
	
	public Utilisateur() {
		super();
		this.lesFicheFrais = new ArrayList<FicheFrais>();

	}
	
	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelfixe() {
		return telfixe;
	}

	public void setTelfixe(String telfixe) {
		this.telfixe = telfixe;
	}

	public String getTelPortable() {
		return telPortable;
	}

	public void setTelPortable(String telPortable) {
		this.telPortable = telPortable;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<FicheFrais> getLesFicheFrais() {
		return lesFicheFrais;
	}

	public void setLesFicheFrais(List<FicheFrais> lesFicheFrais) {
		this.lesFicheFrais = lesFicheFrais;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", login="
				+ login + ", adresse=" + adresse + ", cp=" + cp + ", ville=" + ville + ", dateEmbauche=" + dateEmbauche
				+ ", email=" + email + ", telfixe=" + telfixe + ", telPortable=" + telPortable + ", region=" + region
				+ ", role=" + role + ", lesFicheFrais=" + lesFicheFrais + "]";
	}
	
}