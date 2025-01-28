<body>
    <h1>Worker Income Management System</h1>
    <p>
        Este projeto é parte do curso de Java do professor <strong>Nélio Alves</strong> na Udemy. 
        Ele demonstra conceitos de Orientação a Objetos, como classes, enums, listas e encapsulamento.
    </p>

  <h2>Descrição</h2>
    <p>
        O sistema gerencia informações sobre trabalhadores, departamentos, contratos por hora e calcula o rendimento mensal de um trabalhador com base em contratos associados.
    </p>

  <h3>Funcionalidades:</h3>
    <ul>
        <li>Cadastrar trabalhadores e vinculá-los a um departamento.</li>
        <li>Adicionar contratos por hora a um trabalhador.</li>
        <li>Calcular o rendimento de um trabalhador com base no mês/ano informado.</li>
    </ul>

   <h2>Como Executar</h2>
    <ol>
        <li>Certifique-se de ter o <strong>Java JDK 8+</strong> instalado em seu computador.</li>
        <li>Baixe o código ou clone o repositório.</li>
        <li>Compile e execute o arquivo principal: <code>application/Program.java</code>.</li>
        <li>Siga as instruções exibidas no console.</li>
    </ol>

   <h3>Exemplo de Execução:</h3>
    <pre>
Enter with department name: Sales
Enter Worker data:
Name: John Doe
Level: Senior
Base salary: 4000
How many contracts to this worker? 2
Enter contract #1 data: 
Date: DD/MM/YYYY 15/01/2023
Value per hour: 50
Duration (hours): 20
Enter contract #2 data: 
Date: DD/MM/YYYY 20/01/2023
Value per hour: 80
Duration (hours): 10
Enter month and year to calculate income (MM/YYYY) 01/2023
Name: John Doe
Department: Sales
Income for 01/2023: 6000.00
    </pre>

  <h2>Estrutura do Projeto</h2>
    <p>O projeto contém as seguintes classes e pacotes:</p>
    <ul>
        <li><strong>application.Program</strong>: Classe principal para execução do programa.</li>
        <li><strong>entities</strong>: Contém as classes principais do sistema:
            <ul>
                <li><code>Worker</code>: Representa um trabalhador.</li>
                <li><code>Department</code>: Representa o departamento do trabalhador.</li>
                <li><code>HourContract</code>: Representa um contrato de trabalho por hora.</li>
            </ul>
        </li>
        <li><strong>entities.enums</strong>: Contém o enum <code>WorkerLevel</code>, que define os níveis de um trabalhador.</li>
    </ul>
