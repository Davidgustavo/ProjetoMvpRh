package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela ARQUIVOPDF
 * @generated
 */
@Entity
@Table(name = "\"ARQUIVOPDF\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ArquivoPdf")
public class ArquivoPdf implements Serializable {

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
  @Column(name = "arquivo", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="X6M1BYtVuYIAAAAAAAAAAUZye-VEqx3ruLhnO6HTDsFPC-WRouFI6AdnQErIj6t8")
  
  private java.lang.String arquivo;

  /**
   * Construtor
   * @generated
   */
  public ArquivoPdf(){
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
  public ArquivoPdf setId(java.lang.String id){
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
  public ArquivoPdf setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém arquivo
   * return arquivo
   * @generated
   */
  
  public java.lang.String getArquivo(){
    return this.arquivo;
  }

  /**
   * Define arquivo
   * @param arquivo arquivo
   * @generated
   */
  public ArquivoPdf setArquivo(java.lang.String arquivo){
    this.arquivo = arquivo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ArquivoPdf object = (ArquivoPdf)obj;
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
