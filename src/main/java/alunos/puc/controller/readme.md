orquestração entre service e view

View (Terminal)
    ↓ (usuário escolhe opção)
Controller (recebe e processa)
    ↓ (chama método apropriado)
Service (executa lógica de negócio)
    ↓ (acessa dados)
Repository/Database
    ↓ (retorna dados)
Service (processa resultado)
    ↓ (retorna para controller)
Controller (formata resposta)
    ↓ (envia para exibir)
View (mostra ao usuário)

