package com.project.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "Cv")
public class Cv implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private String path;
	private String otherQualifications;
	private String personalDescription;

	@ManyToOne
	@JoinColumn(name = "user")
	private User user;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "cv")
	private List<Language> language;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "cv")
	private List<Skill> skill;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "cv")
	private List<Education> education;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "cv")
	private List<Experience> experience;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getOtherQualifications() {
		return otherQualifications;
	}

	public void setOtherQualifications(String otherQualifications) {
		this.otherQualifications = otherQualifications;
	}

	public String getPersonalDescription() {
		return personalDescription;
	}

	public void setPersonalDescription(String personalDescription) {
		this.personalDescription = personalDescription;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Language> getLanguage() {
		return language;
	}

	public void setLanguage(List<Language> language) {
		this.language = language;
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Cv [id=" + id + ", path=" + path + ", otherQualifications=" + otherQualifications
				+ ", personalDescription=" + personalDescription + ", user=" + user + ", language=" + language
				+ ", skill=" + skill + ", education=" + education + "]";
	}

}
