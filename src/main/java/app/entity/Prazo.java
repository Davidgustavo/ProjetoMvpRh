package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRAZO
 * @generated
 */
@Entity
@Table(name = "\"PRAZO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Prazo")
public class Prazo implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "datafinal", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date datafinal;

  /**
   * Construtor
   * @generated
   */
  public Prazo(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Prazo setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Prazo setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém datafinal
   * return datafinal
   * @generated
   */
  
  public java.util.Date getDatafinal(){
    return this.datafinal;
  }

  /**
   * Define datafinal
   * @param datafinal datafinal
   * @generated
   */
  public Prazo setDatafinal(java.util.Date datafinal){
    this.datafinal = datafinal;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Prazo object = (Prazo)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
