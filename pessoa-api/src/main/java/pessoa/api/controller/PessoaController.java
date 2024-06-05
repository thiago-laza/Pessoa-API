package pessoa.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pessoa.api.model.Pessoa;
import pessoa.api.repository.PessoaRepository;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaRepository repository;

    @Autowired
    public PessoaController(PessoaRepository repository) {
        this.repository = repository;
    }

    // Retorna todas as pessoas
    @GetMapping
    public List<Pessoa> all() {
        return repository.findAll();
    }

    // Cria uma nova pessoa
    @PostMapping
    public Pessoa newPessoa(@RequestBody Pessoa newPessoa) {
        return repository.save(newPessoa);
    }

    // Retorna uma única pessoa pelo ID
    @GetMapping("/{id}")
    public Pessoa one(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // Atualiza uma pessoa existente ou cria uma nova se não existir
    @PutMapping("/{id}")
    public Pessoa replacePessoa(@RequestBody Pessoa newPessoa, @PathVariable Long id) {
        return repository.findById(id)
                .map(pessoa -> {
                    pessoa.setName(newPessoa.getName());
                    pessoa.setAge(newPessoa.getAge());
                    pessoa.setWeight(newPessoa.getWeight());
                    pessoa.setHeight(newPessoa.getHeight());
                    return repository.save(pessoa);
                })
                .orElseGet(() -> {
                    newPessoa.setId(id);
                    return repository.save(newPessoa);
                });
    }

    // Deleta uma pessoa pelo ID
    @DeleteMapping("/{id}")
    public void deletePessoa(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
