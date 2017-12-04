package domain;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class MatriculaCurso {
	
	@Id
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "matricula_id")
	private Matricula matricula;

	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;
	
	public Integer getId() {
	  return id;
	}

	public void setId(Integer id) {
	  this.id = id;
	}

	public Matricula getMatricula() {
	  return matricula;
	}

	public void setMatricula(Matricula matricula) {
	  this.matricula = matricula;
	}

	public Curso getCurso() {
	  return curso;
	}

	public void setCurso(Curso curso) {
	  this.curso = curso;
	}
	
}
