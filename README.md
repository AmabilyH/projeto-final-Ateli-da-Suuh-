Ateliê da Suuh

App Android para ajudar a Suely a organizar o status das encomendas, os pagamentos e o faturamento do seu ateliê — sem precisar de caderno de papel, calculadora e agenda separados.

Projeto final — Módulo 03, 3º ano A (Ensino Médio). Entrega: 10/12/2026.

📖 Sobre o projeto

A Suely vende produtos variados por encomenda — lingerie, bottoms, chaveiros e crochê — e hoje anota tudo em vários cadernos e agendas diferentes, o que faz com que informações se percam. As contas de faturamento e pagamento são feitas de cabeça, na correria, sem calculadora por perto, o que aumenta o risco de erro.

O Ateliê da Suuh resolve isso reunindo, em um único lugar:

as encomendas em andamento, organizadas por status (pendente / em produção / pronta);
o controle de pagamento de cada encomenda (pago / não pago);
o faturamento total e contadores de quanto falta receber e quantas encomendas pagas aguardam entrega.

O app funciona 100% local, direto no celular, sem necessidade de internet.

✨ Funcionalidades
#	Funcionalidade	Responsável
F1	Cadastro e lista de encomendas por status (pendente / em produção / pronta), com aba separada para "Entregues"	Amabily
F2	Controle de pagamento (pago / não pago + valor), com soma automática do faturamento total e contadores de encomendas a pagar / pagas aguardando entrega	Fábio Matheus
F3	Calculadora simples embutida	Analy

Fora do escopo desta versão: login/cadastro de usuário, sincronização com a nuvem, notificações push, chat, mapa e processamento real de pagamento (o app apenas marca se uma encomenda foi paga, sem integrar com meios de pagamento).

📱 Como usar
Na tela principal, veja as encomendas listadas com cliente, produto, valor e status de pagamento.
Um resumo no topo mostra o faturamento total, quantas encomendas faltam pagar e quantas já foram pagas e aguardam entrega.
Toque em uma encomenda para marcar como paga e/ou como entregue — os totais e contadores são atualizados na hora.
Encomendas marcadas como entregues passam para a aba "Entregues".
🛠️ Tecnologias
Linguagem: Kotlin
Persistência de dados: Room (banco de dados local no celular)
applicationId: br.edu.ifpe.ateliedasuuh
Versão: 1.0 (versionCode 1)
🎨 Identidade visual
Item	Definição
Nome exibido	Ateliê da Suuh
Cor principal	
#8B6AAE
Tesoura + agulha com linha, em traço branco, sobre fundo degradê roxo — remete ao trabalho manual do ateliê.
🚀 Como rodar o projeto
Clone o repositório:
bash
   git clone https://github.com/AmabilyH/projeto-final-Ateli-da-Suuh-.git
Abra a pasta no Android Studio.
Aguarde a sincronização do Gradle.
Rode em um emulador ou dispositivo físico com o Android configurado para depuração USB.
Gerando o build de release
bash
# .apk (para teste em dispositivos)
./gradlew assembleRelease

# .aab (para publicação na loja)
./gradlew bundleRelease

Os artefatos gerados ficam em app/build/outputs/.

👥 Equipe
Integrante	Papel	Responsável por
Amabily	Dev / dados e funcionalidades complexas (Room)	Cadastro e lista de encomendas com status; estrutura do banco de dados
Analy	Dev / telas simples	Calculadora; apoio na identidade visual (cores, ícone)
Fábio Matheus	Dev / funcionalidades médias + documentação	Controle de pagamento, soma e contadores; README, AGENTS.md e geração do build/apk
🗓️ Marcos do projeto
Marco	Prazo	Status
M1 — Canvas preenchido + repositório criado	16/09	✅
M2 — PRD aprovado + telas rascunhadas	30/09	⏳
M3 — Funcionalidade base rodando	21/10	⏳
M4 — Dados completos (Room) e erros tratados	11/11	⏳
M5 — Identidade visual + .apk de release testado	25/11	⏳
M6 — .aab + material de loja + README final	02/12	⏳
Entrega e apresentação	10/12	⏳
📄 Documentação relacionada
CANVAS.md — visão geral do projeto
PRD.md — requisitos detalhados do produto
AGENTS.md — regras de uso da IA neste projeto
docs/USO_DE_IA.md — registro de uso da IA
📝 Licença

Projeto acadêmico desenvolvido para fins e
