package com.pokecontrol.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.pokecontrol.PokeAPI.PokemonListResponse;

@Controller
public class Pokemon_API_Controller {

    private static final String POKEAPI_URL = "https://pokeapi.co/api/v2/pokemon?limit=20";

    @GetMapping("/pokemon")
    public String getPokemonList(Model model) {
        RestTemplate restTemplate = new RestTemplate();

        // Obtener la respuesta de la PokeAPI
        PokemonListResponse response = restTemplate.getForObject(POKEAPI_URL, PokemonListResponse.class);

        // Agregar la lista de pokemons al modelo
        model.addAttribute("pokemon", response.getResults());

        return "pokemon-list";
    }
}
