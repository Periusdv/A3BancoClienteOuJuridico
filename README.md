[![Github Actions Status for Periusdv/A3BancoClienteOuJuridico](https://github.com/Periusdv/A3BancoClienteOuJuridico/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/Periusdv/A3BancoClienteOuJuridico/actions)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=Periusdv_A3BancoClienteOuJuridico&metric=coverage)](https://sonarcloud.io/summary/new_code?id=Periusdv_A3BancoClienteOuJuridico)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Periusdv_A3BancoClienteOuJuridico&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Periusdv_A3BancoClienteOuJuridico)

## Integrantes:

Gabriel Teotônio Cordeiro 10724111027 \
Luan Campi Galatti 1072419087 \
Davi Dias Perius 10724114628 \
Victor Lucio Scheuer Rodrigues 1072410296

Trabalho A3 de Gestão e Qualidade de Software Prof.ª Samara Soares Leal
------------------------------------------------------------------------
## Casos De Teste:

## ID Do Caso de Teste: CT-001

Item do teste: TestAgencia
dentro de TestAgencia ha testConstrutorAgencia,testSetNumero,testGetNumero.

Espexificação de Entrada:
1. testConstrutorAgencia: ID 1 
2. testSetNumero: ID 1
3. testGetNumero: ID 1
Procedimentos:
1. Verifica se a agencia e igual a 1 no Id do testCostrutorAgencia.
2. levanta Id = 1 em test SetNumero.
3. retorna Id = 1 em test GetNumero.

Espificação de Saida:
os teste não apresenta saída nenhuma, nem mesmo de  Systema

## ID Do Caso de Teste: CT-002

Item do teste: TestAula
dentro de TestAula ha testPessoaJuridicaComContas,testPessoaJuridicaSemContas,testPessoaFisicaSomenteContaCorrente,testPessoaFisicaSomentePoupanca.

Expecificação de Entrada:
1.testPessoaJuridicaComContas: Agencia 1, Nome João,Fisica ou Juridica 1,Cnpj 9999999,Corente 1,Salario 100,000,Poupança 1,Rendimento 0,1.
2.testPessoaJuridicaSemContas: Agencia 2,Nome Fredico,Fisica ou Juridica 1,Cnpj 9999999, Corente 2, Poupança 2.
3.testPessoaFisicaSomenteContaCorrente Agencia 2,Nome Willan Afthon,Fisica ou Juridica 2,CPF 9999999,Corente 1,Salario 300,000,Poupança 2.
4.testPessoaFisicaSomentePoupanca Agencia 2,Nome Amilton,Fisica ou Juridica 2,CPF 9999999,Corente 2,Poupança 1,Rendimento 0,2.
Procedimentos:
1. levanta Numero de Agencia 1, Nome João,levanta pessoa Juridica com 1, Levanta Cnpj 999999, levanta conta corente 1 assim pedindo Salario, levanta Poupança assim pedindo o Rendimento.
2. levanta Numero de Agencia 2, Nome Frederico,levanta pessoa Juridica com 1, Levanta Cnpj 999999,levanta Cotente e Poupança com 2 negando a necesidade de ambus.
3. levanta Numero de Agencia 2, Nome Willan Afthon, levanta  Pesoa Fisica com 2, Levanta Cpf 999999,Levanta conta corente 1 assim pedindo Salario,Levanta Poupança com 2 negando a necesidade.
4. levanta Numero de Agencia 2, Nome Amilton,levanta Pessoa Fisica com 2, Levanta Cpf 99999,Levanta conta corente 2 assim negando a necesidade de salario,Levanta Poupança com 1 assim pedindo Rendimento.

Espificação de Saida:
Todas as Saidas estão relacionadas aos testes acima com a injeção de dados dentro da aplicação nehuma saida expecifica como caixas de texto apenas o prorpio sistema sendo auto testado com a ingeção de dados.
