package com.eventoapp.eventoapp.controllers;

<<<<<<< HEAD
import com.eventoapp.eventoapp.models.Convidado;
import com.eventoapp.eventoapp.models.Evento;
import com.eventoapp.eventoapp.repository.ConvidadoRepository;
import com.eventoapp.eventoapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
=======
import com.eventoapp.eventoapp.models.Evento;
import com.eventoapp.eventoapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
<<<<<<< HEAD
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
=======
>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a

@Controller
public class EventoController {

    @Autowired
    private EventoRepository er;

<<<<<<< HEAD
    @Autowired
    private ConvidadoRepository cr;

=======
>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String form() {
        return "evento/novoEvento";
    }

    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento) {

        er.save(evento);
        return "redirect:/cadastrarEvento";
    }

<<<<<<< HEAD
    @RequestMapping("/deletarEvento")
    public String deletarEvento(long codigo){
        Evento evento = er.findByCodigo(codigo);
        er.delete(evento);
        return "redirect:/eventos";
    }

    @RequestMapping("/deletarConvidado")
    public String deletarConvidado(Integer rg){
        Convidado convidado = cr.findByRg(rg);
        cr.delete(convidado);

        Evento evento = convidado.getEvento();
        long codigoLong = evento.getCodigo();

        String codigo = "" + codigoLong;
        return "redirect:/evento/" + codigo;
    }

=======
>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a
    @RequestMapping("/eventos")
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = er.findAll();
        mv.addObject("eventos", eventos);

        return mv;
    }

<<<<<<< HEAD
    @RequestMapping(value = "/evento/{codigo}", method = RequestMethod.GET)
=======
    @RequestMapping("/evento/{codigo}")
>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a
    public ModelAndView detalhesEvento(@PathVariable("codigo") long codigo){
        Evento evento = er.findByCodigo(codigo);
        ModelAndView mv = new ModelAndView("evento/detalhesEvento");
        mv.addObject("evento", evento);

<<<<<<< HEAD
        Iterable<Convidado> convidados = cr.findByEvento(evento);
        mv.addObject("convidados", convidados);
        return mv;
    }

    @RequestMapping(value = "/evento/{codigo}", method = RequestMethod.POST)
    public String detalhesEventoPost(@PathVariable("codigo") long codigo, @Valid Convidado convidado, BindingResult result, RedirectAttributes attributes){

        Evento evento = er.findByCodigo(codigo);
        convidado.setEvento(evento);
        cr.save(convidado);
        attributes.addFlashAttribute("message", "Convidado cadastrado!");

        return "redirect:/evento/{codigo}";
    }


=======
        return mv;
    }
>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a
}
