package br.com.banco.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "tranferencia")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Transferencia {

  @Id
  @EqualsAndHashCode.Include
  private Integer id;

  @Column(name = "data_transferencia")
  private LocalDateTime dataTransferencia;

  private Float valor;

  private String tipo;

  @Column(name = "nome_operador_transacao")
  private String nomeOperadorTransacao;

  @ManyToOne()
  private Conta conta;

}
