package med.voll.api.medico;

import med.voll.api.endereco.DadosEnederco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEnederco endereco) {
}
