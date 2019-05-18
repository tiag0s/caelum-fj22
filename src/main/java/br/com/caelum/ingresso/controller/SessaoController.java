package br.com.caelum.ingresso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Autowired
private SalaDao salaDao;

@Autowired
private FilmeDao filmeDao;

@GetMapping("/admin/sessao")
public ModelAndView form(@RequestParam("salaId") Integer salaId) {

	ModelAndView modelAndView = new ModelAndView("sessao/sessao");

	modelAndView.addObject("sala", salaDao.findOne(salaId));
modelAndView.addObject("filmes", filmeDao.findAll());
return modelAndView;
}
}



public class SessaoController {

}
