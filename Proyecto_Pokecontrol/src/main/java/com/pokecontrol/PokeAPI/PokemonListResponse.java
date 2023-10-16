package com.pokecontrol.PokeAPI;

/* PokemonListResponse es una representación en Java de la estructura 
 * de la respuesta JSON obtenida al solicitar una lista de Pokémon a la PokeAPI. 
 * Proporciona métodos y propiedades para acceder y manipular los datos 
 * de manera conveniente en el código de la aplicación.
*/
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pokecontrol.models.Pokemon_base;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonListResponse {
    @JsonProperty("count")
    private int count;

    @JsonProperty("results")
    private List<Pokemon_base> results;

    // Getters y setters

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Pokemon_base> getResults() {
        return results;
    }

    public void setResults(List<Pokemon_base> results) {
        this.results = results;
    }
}