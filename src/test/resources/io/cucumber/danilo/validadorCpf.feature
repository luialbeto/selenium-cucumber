# language: pt
Funcionalidade: Validação de CPF
  Fizemos no curso um sitema que vaz uma validação de cpf
  com isso estamos criando um teste para automatizar o processo de validação

  Cenario: Testando CPF valido
    Quando eu acesso o sistema de validacao de CPF
    E digito no campo nome "Danilo"
    E digito no campo cpf "571.663.770-11"
    Entao eu devo ver a mensagem de sucesso "Foi validado com sucesso“