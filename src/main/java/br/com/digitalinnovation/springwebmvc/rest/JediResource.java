package br.com.digitalinnovation.springwebmvc.rest;

import br.com.digitalinnovation.springwebmvc.model.Jedi;
import br.com.digitalinnovation.springwebmvc.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class JediResource {

    @Autowired
    private JediService service;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi() {
        return service.findAll();
    }

    @GetMapping("/api/jedi/{id}")
    public ResponseEntity<Jedi> getJedi(@PathVariable ("id") Long id, HttpResponse response) {
        final Jedi jedi = service.findById(id);
            return ResponseEntity.ok(jedi);
    }

    @PostMapping("/api/jedi")
    @ResponseStatus(HttpStatus.CREATED)
    public Jedi createJedi(@Valid @RequestBody Jedi jedi) {
        return service.save(jedi);
    }

    public ResponseEntity<Jedi> updateJedi (@PathVariable("id") Long id, @Valid @RequestBody Jedi dto) {

       final Jedi jedi = service.update(id, dto);

       return ResponseEntity.ok(jedi);
    }

    @DeleteMapping("/api/jedi/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
