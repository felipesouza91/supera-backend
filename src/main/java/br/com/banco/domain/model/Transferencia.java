package br.com.banco.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tranferencia")
public class Transferencia {

  @Id
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
