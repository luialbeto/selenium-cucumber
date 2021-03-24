# language: pt
Funcionalidade: Consulta site Prof
Fizemos no curso um sitema que consulta um site

        Cenário: Entrar no site do tornese um programador e buscar pelo conteúdo tdd
            Dado que estou no site do tornese um programador
              E digito no campo de busca a palavra "TDD"
             Então devo ver o resultado na busca

        Cenário: Entrar no site do tornese um programador e buscar pelo conteúdo bdd
            Dado que estou no site do tornese um programador
              E digito no campo de busca a palavra "BDD"
             Então devo ver o resultado na busca
