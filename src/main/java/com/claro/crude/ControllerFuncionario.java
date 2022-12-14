package com.claro.crude;

import com.crude.crude.Funcionario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1")

public class ControllerFuncionario {
    @Autowired
    private RepositorioFuncionario repositorioFuncionario;

    @GetMapping("/funcionarios")
    public List<Funcionario> getTodosFuncionarios(){
        return repositorioFuncionario.findAll();
    }

  /*  @GetMapping("/funcionarios/{id}")
    public ResponseEntity<Funcionario> getIdFuncionario(@PathVariable(value = "id") Long funcionarioId) throws RecursoNaoEncontrado{
        Funcionario funcionario = repositorioFuncionario.findAllById(funcionarioId).orElseThrow(() -> new RecursoNaoEncontrado("Funcionário não encontrado para este Id:..." + funcionarioId));
        return ResponseEntity.ok().body(funcionario);
    }
*/
    @PostMapping("/funcionarios")
    public Funcionario criaFuncionario(@Valid @RequestBody Funcionario funcionario){
        return repositorioFuncionario.save(funcionario);
    }

  /*  @PutMapping("/funcionario/{id}")
    public ResponseEntity<Funcionario> autalizaFuncionario(@PathVariable(value = "id") Long idDoFuncionario, @Valid @RequestBody Funcionario funcionarioDetalhes) throws RecursoNaoEncontrado{
        Funcionario funcionario = repositorioFuncionario.findAll(idDoFuncionario).orElseThrow(() -> new RecursoNaoEncontrado("Funcioário não encontrado" + idDoFuncionario));

        funcionario.setEmailId(funcionarioDetalhes.getEmailId());
        funcionario.setSobreNome(funcionarioDetalhes.getSobreNome());
        funcionario.setNome(funcionarioDetalhes.getNome());
        final Funcionario atualizaFuncionario = repositorioFuncionario.save(funcionario);
        return ResponseEntity.ok(atualizaFuncionario);
    }
*/
   /* @DeleteMapping("/funcionarios/{id}")
    public Map< String, Boolean > apagaFuncionario(@PathVariable(value = "id") Long idDoFuncionario) throws RecursoNaoEncontrado{
        Funcionario funcionario = repositorioFuncionario.findAll(idDoFuncionario).orElseThrow(() -> new RecursoNaoEncontrado(" funcionário não encontrado : " + idDoFuncionario));

        repositorioFuncionario.delete(funcionario);
        Map < String, Boolean> response = new HashMap<>();
        response.put("delete", Boolean.TRUE);
        return response;
    }
*/
}
