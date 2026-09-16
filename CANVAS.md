# 🎯 Canvas do Projeto Final — App Android

> Depois de preenchido e validado pelo professor, ele vira a base do [`PRD.md`](PRD.md).

| | |
|---|---|
| **Grupo nº** | |
| **Integrantes (3 a 4)** | Amabily, Analy, Fábio Matheus |
| **Turma** | 3º ano A — Ensino Médio |
| **Repositório** | `https://github.com/AmabilyH/projeto-final-Ateli-da-Suuh-` |
| **Data de preenchimento** | 16/09/2026 |
| **Entrega final** | **10/12/2026** |

---

## 🧩 Bloco 1 — Nome e pitch do app

**Nome do app:** Ateliê da Suuh

**Pitch em uma frase:**
> "O **Ateliê da Suuh** ajuda **a Suely** a **organizar o status das encomendas, os pagamentos e o faturamento** sem precisar de **caderno de papel, calculadora e agenda separados**."

---

## 😖 Bloco 2 — Problema

- Suely anota vendas e status de encomendas em vários cadernos e agendas diferentes, e acaba perdendo informações por não ter um único lugar organizado.
- Ela faz contas de cabeça ou em voz alta na correria, sem calculadora por perto, e pode errar os valores.

**Como esse problema é resolvido hoje (sem o app)?**

- Ela anota no primeiro caderno que encontra e só registra tudo depois de terminar as tarefas do dia, o que faz esquecer detalhes.

---

## 👥 Bloco 3 — Público-alvo

- **Perfil principal:** pessoas que vendem vários tipos de produtos ou serviços por encomenda (como a Suely, que vende lingerie, bottoms, chaveiros e crochê) e fazem tarefas variadas, correndo risco de se confundir sem um lugar único e organizado.
- **Quando/onde usam:** em qualquer lugar, muitas vezes com pressa, entre um afazer e outro — nem sempre com internet disponível.
- **Uma pessoa real que testaria o app:** Suely — dona do ateliê, vai testar o `.apk` na Etapa 3.

---

## 💡 Bloco 4 — Solução em uma tela

- **A tela principal lista:** as encomendas em andamento (pendente / em produção / pronta), com cliente, produto, valor e status de pagamento (pago / não pago). Um resumo no topo mostra o faturamento total, quantas encomendas faltam pagar e quantas já foram pagas e aguardam entrega — para a Suely saber o que é mais urgente (prioridade pra quem já pagou).
- **A ação principal do usuário é:** tocar em uma encomenda para marcar como paga e/ou como entregue.
- **Depois de agir, o usuário vê:** os totais e contadores atualizados na hora; ao marcar como entregue, a encomenda passa para a aba "Entregues".

---

## ✅ Bloco 5 — Funcionalidades do MVP

| # | Funcionalidade | Essencial? | Quem faz |
|---|---|---|---|
| F1 | Cadastro e lista de encomendas por status (pendente/em produção/pronta), com aba separada para "Entregues" | Sim | Amabily |
| F2 | Controle de pagamento (marcar pago/não pago + valor), com soma automática do faturamento total e contadores (quantas faltam pagar, quantas pagas aguardando entrega) | Sim | Fábio Matheus |
| F3 | Calculadora simples embutida | Sim/Não | Analy |
| F4 | Bloco de notas rápido para anotações soltas | Não | Analy |

---

## 🚫 Bloco 6 — Fora do escopo

- ❌ Login/cadastro de usuário (app de uso pessoal da Suely, sem múltiplas contas)
- ❌ Sincronização automática com a nuvem (nesta versão o app funciona 100% local, no próprio celular)
- ❌ Notificações push, chat, mapa ou processamento real de pagamento — o app só **marca** se uma encomenda foi paga ou não, não integra com meios de pagamento (faz sentido, já que as entregas geralmente são retiradas no próprio ateliê)

---

## ⚙️ Bloco 7 — Caminho técnico

- [x] **Opção A — Room:** dados salvos no próprio celular
- [ ] **Opção B — Retrofit**
- [ ] **Opção C — Desafio**

**Onde entra o `try/catch`?**

- Pode falhar: salvar uma encomenda com o campo de valor vazio ou com texto no lugar de número; abrir o app pela primeira vez com o banco de dados vazio; marcar pagamento/entrega de uma encomenda que já foi removida.
- O usuário vê a mensagem: "Preencha o valor corretamente" ou "Nenhuma encomenda cadastrada ainda — toque em + para começar".

---

## 🎨 Bloco 8 — Identidade visual

| Item | Definição do grupo |
|---|---|
| Nome exibido (`strings.xml`) | Ateliê da Suuh |
| Cor principal (hex, em `Color.kt`) | `#8B6AAE` |
| Ideia do ícone (512×512) | Tesoura + agulha com linha, em traço branco, sobre fundo degradê roxo — remete ao trabalho manual do ateliê. |
| `applicationId` | `br.edu.ifpe.ateliedasuuh` |
| Versão inicial | `1.0` (versionCode `1`) |

---

## 👤 Bloco 9 — Equipe, papéis e riscos

| Integrante | Papel principal | Responsável por |
|---|---|---|
| Amabily | Dev / dados e funcionalidades complexas (Room) | F1 — cadastro e lista de encomendas com status, estrutura do banco de dados |
| Analy | Dev / telas simples | F3 e F4 — calculadora e bloco de notas; apoio na identidade visual (cores, ícone) |
| Fábio Matheus | Dev / funcionalidades médias + documentação | F2 — controle de pagamento, soma e contadores; README, AGENTS.md e geração do build/apk |

**Riscos — o que pode dar errado e o plano B:**

| Risco | Plano B |
|---|---|
| Prazo apertado por sermos iniciantes | Reduzir o MVP para só F1 e F2 (encomendas + pagamento/faturamento) |
| Perder dados por o app fechar sem querer | Testar o Room desde o início e salvar cada ação direto no banco |
| A soma e os contadores de pagamento darem valor errado | Testar com poucas encomendas de valores simples antes de usar com dados reais |

---

## 🤖 Bloco 10 — Acordo de trabalho com IA

A implementação pode ser feita com o **Gemini no Android Studio**. Vocês orientam, ele digita — e cada integrante precisa saber explicar o que entrou no projeto. Regras completas em [`docs/USO_DE_IA.md`](docs/USO_DE_IA.md).

**Três regras que vamos escrever no nosso `AGENTS.md`:**

1. A IA só mexe no arquivo da tela ou funcionalidade que estamos pedindo naquele momento — nunca em `build.gradle` sem o grupo revisar antes.
2. Toda sugestão de código vem acompanhada de uma explicação simples do que ela faz, antes de qualquer integrante aceitar.
3. Nenhuma senha, chave de API ou dado real da Suely (nome completo, valores de venda) entra no prompt.

**Combinados do grupo:**

- [ ] Ninguém clica *Accept* no Agent Mode sem ler a mudança inteira.
- [ ] Quem aceitou o código escreve o comentário de fronteira do arquivo.
- [ ] Antes de cada marco, revisamos juntos: alguém aqui não entende alguma parte?
- [ ] Nenhuma chave de API ou senha vai para o prompt.
- Outro combinado nosso: revisar juntos o código gerado antes de cada marco, mesmo quando só uma pessoa implementou aquela parte.

**Como vamos garantir que todos entendem tudo:**

- Quem implementou uma parte explica ela para os outros dois antes de fazer o commit.

---

## 🗓️ Bloco 11 — Marcos até 10/12

| Marco | Prazo | Como se comprova no GitHub |
|---|---|---|
| M1 — Canvas preenchido + repositório criado | 16/09 | `CANVAS.md` no `main` |
| M2 — PRD aprovado + telas rascunhadas | 30/09 | `PRD.md` + imagens em `docs/` |
| M3 — Funcionalidade base rodando | 21/10 | tela principal lista dados + 1 ação + `try/catch` |
| M4 — Dados completos (Room) e erros tratados | 11/11 | commits da camada de dados |
| M5 — Identidade visual + `.apk` de release testado | 25/11 | ícone, cores, `.apk` testado por 2 pessoas de fora |
| M6 — `.aab` + material de loja + `README.md` | 02/12 | pasta `loja/` + `README.md` completo |
| **Entrega e apresentação** | **10/12** | tag `v1.0` no repositório |

---

## 🏁 Bloco 12 — Definição de pronto

- [ ] O app abre e não fecha sozinho depois de 5 minutos de uso.
- [ ] A tela principal mostra dados reais (não texto de exemplo fixo no código).
- [ ] A ação principal funciona e o resultado aparece na tela.
- [ ] Quando algo falha, aparece uma mensagem clara — o app não quebra.
- [ ] O app tem nome, ícone e cor próprios (nada de ícone padrão do Android).
- [ ] Duas pessoas de fora do grupo instalaram o `.apk` e conseguiram usar sem explicação.
- [ ] O `README.md` explica o que o app faz, com o que foi feito e como gerar o build.
- [ ] O `docs/USO_DE_IA.md` e o `AGENTS.md` estão preenchidos.
- [ ] Cada integrante consegue abrir o projeto e fazer uma mudança pequena sozinho.
- [ ] Todo arquivo nosso tem o comentário de fronteira escrito por nós.

---

## ✍️ Validação do professor

| | |
|---|---|
| Data | |
| Situação | ( ) Aprovado ( ) Aprovado com ajustes ( ) Refazer |
| Observações | |
EOF
echo "done"
