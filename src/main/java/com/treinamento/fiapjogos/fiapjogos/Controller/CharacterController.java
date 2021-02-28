package com.treinamento.fiapjogos.fiapjogos.Controller;

import com.treinamento.fiapjogos.fiapjogos.Service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @Autowired
    private CharacterService service;
}
