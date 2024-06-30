package med.voll.api.paciente;

import med.voll.api.endereco.DadosEnederco;


public record DadosCadastroPaciente(String nome, String email, String cpf, String telefone, DadosEnederco endereco) {
}
