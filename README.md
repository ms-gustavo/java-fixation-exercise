<h1>Exercícios de Fixação - Java</h1>
    <p>Este repositório contém três exercícios de fixação em Java. Cada exercício tem como objetivo reforçar conceitos importantes de programação orientada a objetos e uso de classes e enums no Java.</p>

 <h2>Projeto 1: Gestão de Contratos de Trabalhador</h2>
    <p>Este exercício simula a gestão de contratos de trabalho para um trabalhador em um determinado departamento. Ele utiliza:</p>
    <ul>
        <li>Classes: <code>Worker</code>, <code>Department</code>, <code>HourContract</code></li>
        <li>Enum: <code>WorkerLevel</code></li>
    </ul>
    <p><strong>Funcionalidades:</strong></p>
    <ul>
        <li>Adicionar contratos a um trabalhador.</li>
        <li>Calcular a renda total do trabalhador para um mês/ano específico.</li>
    </ul>
    <p><strong>Entrada:</strong></p>
    <ul>
        <li>Nome do trabalhador, nível, salário base.</li>
        <li>Detalhes do contrato: data, valor por hora, duração.</li>
        <li>Mês e ano para calcular a renda.</li>
    </ul>
    <p><strong>Saída:</strong></p>
    <ul>
        <li>Nome do trabalhador, departamento e renda calculada.</li>
    </ul>
    <h2>Projeto 2: Postagens com Comentários</h2>
    <p>Este exercício simula um sistema de postagens com comentários. Ele utiliza:</p>
    <ul>
        <li>Classes: <code>Post</code>, <code>Comment</code></li>
    </ul>
    <p><strong>Funcionalidades:</strong></p>
    <ul>
        <li>Criar postagens com título, conteúdo, data/hora e número de curtidas.</li>
        <li>Adicionar comentários às postagens.</li>
    </ul>
    <p><strong>Entrada:</strong></p>
    <ul>
        <li>Detalhes das postagens: data, título, conteúdo, curtidas.</li>
        <li>Comentários associados a cada postagem.</li>
    </ul>
    <p><strong>Saída:</strong></p>
    <ul>
        <li>Resumo de cada postagem com seus comentários.</li>
    </ul>
    <h2>Projeto 3: Sistema de Pedidos</h2>
    <p>Este exercício simula um sistema de gerenciamento de pedidos. Ele utiliza:</p>
    <ul>
        <li>Classes: <code>Order</code>, <code>OrderItem</code>, <code>Product</code>, <code>Client</code></li>
        <li>Enum: <code>OrderStatus</code></li>
    </ul>
    <p><strong>Funcionalidades:</strong></p>
    <ul>
        <li>Registrar clientes com nome, email e data de nascimento.</li>
        <li>Gerenciar pedidos com itens e status (enum).</li>
        <li>Calcular o total do pedido.</li>
    </ul>
    <p><strong>Entrada:</strong></p>
    <ul>
        <li>Dados do cliente: nome, email, data de nascimento.</li>
        <li>Dados do pedido: status, itens (nome, preço, quantidade).</li>
    </ul>
    <p><strong>Saída:</strong></p>
    <ul>
        <li>Resumo do pedido com cliente, itens e total.</li>
    </ul>

  <h2>Como Executar</h2>
    <ol>
        <li>Certifique-se de ter o Java instalado na sua máquina.</li>
        <li>Clone este repositório: <code>git clone [URL_DO_REPOSITORIO]</code></li>
        <li>Compile os arquivos Java: <code>javac application/Program.java</code></li>
        <li>Execute os programas: <code>java application.Program</code></li>
    </ol>

 <h2>Estrutura do Projeto 1</h2>
    <pre>
    src/
    ├── application/
    │   └── Program.java
    ├── entities/
    │   ├── Department.java
    │   ├── HourContract.java
    │   └── Worker.java
    └── entities/enums/
        └── WorkerLevel.java
    </pre>

<h2>Estrutura do Projeto 2</h2>
    <pre>
    src/
    ├── application/
    │   └── Program.java
    ├── entities/
    │   ├── Post.java
        └── Comment.java
</pre>

 <h2>Estrutura do Projeto 1</h2>
    <pre>
    src/
    ├── application/
    │   └── Program.java
    ├── entities/
    │   ├── Client.java
    │   ├── Order.java
    │   ├── OrderItem.java
    │   ├── Product.java
    └── entities/enums/
        ├── OrderStatus.java
    </pre>

 <h2>Autor</h2>
    <p>Exercícios desenvolvidos como prática de fixação em Java. Sinta-se à vontade para contribuir ou enviar sugestões!</p>
