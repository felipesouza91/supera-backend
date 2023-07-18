package br.com.banco.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.api.filter.TranferenciaFilter;
import br.com.banco.domain.model.Transferencia;
import br.com.banco.domain.service.FindTransferenciaService;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

  @Autowired
  private FindTransferenciaService transferenciaRepository;

  @GetMapping("/{contaId}")
  public Page<Transferencia> find(@PathVariable Integer contaId, TranferenciaFilter filtro, Pageable page) {
    System.out.println(contaId);
    return transferenciaRepository.execute(contaId, filtro, page);
  }

}
