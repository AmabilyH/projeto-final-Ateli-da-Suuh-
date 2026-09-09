# 📦 Ateliê da Suuh — App de Gestão de Encomendas e Produção

Aplicativo para Android do **Ateliê da Suuh**, criado para automatizar a produção de artes e organizar as encomendas de bottons, chaveiros, ímãs de geladeira, marca-páginas e fotos polaroid.

O app permite montar layouts de impressão prontos para produção (PDF em 600 DPI, folha A4) direto do celular, além de acompanhar pedidos, prazos e status de produção da equipe.

---

## 📱 Sobre o app

O Ateliê da Suuh funciona como um **PWA (Progressive Web App)** — ou seja, é instalado no celular como um app normal (ícone na tela inicial, tela cheia, sem barra de navegador), mas construído a partir do sistema web já existente.

**Vantagens desse formato:**
- Instala direto no Android sem precisar de Play Store
- Abre e funciona como um app nativo
- Continua funcionando também em computador/navegador, sem duplicar código
- Atualizações no servidor refletem automaticamente no app

---

## ✨ Funcionalidades

### 🎨 Editor de Artes
- Upload de imagens com recorte circular, quadrado ou em formato de coração
- Zoom e arraste (pan) para ajuste fino da foto dentro da forma
- Seleção de tamanho por imagem (32mm / 44mm / 58mm)
- Modo de borda **orgânica** (gradiente radial) ou **centralizada**
- Seletor de cor com conta-gotas duplo
- Produtos suportados: botton redondo, quadrado, coração, chaveiro, ímã, marca-página e polaroid
- Polaroid com legenda manuscrita ou normal, suporte a múltiplas linhas e seleção de fonte (Google Fonts)

### 🧩 Layout e Impressão
- Algoritmo de empacotamento (*shelf packing*) para organizar tamanhos mistos automaticamente
- Modo manual de posicionamento (arrastar e soltar)
- Prévia em tempo real da folha A4
- Geração de PDF em alta resolução (600 DPI), pronto para corte/prensa

### 📋 Gestão de Encomendas
- Cadastro de pedidos por cliente
- Acompanhamento de status (em produção, pronto, entregue etc.)
- Organização de prazos e prioridades
- Login com senha e sessão protegida por token

---

## 👥 Equipe

| Nome | Função |
|---|---|
| **Amabily** | Desenvolvimento do sistema (frontend, backend, automação de PDF e manutenção técnica) |
| **Analy** | Atendimento ao cliente e organização das encomendas |
| **Fabio Mateus** | Produção física (prensa, corte e acabamento dos produtos) |

*Cliente: **Suuh**, proprietária do Ateliê e responsável pela identidade da marca.*

---

## 🛠️ Stack Técnica

- **Frontend / App:** HTML/CSS/JS empacotado como PWA — hospedado na **Netlify**
- **Backend:** Node.js + Express — hospedado no **Render**
- **Geração de PDF:** jsPDF
- **Autenticação:** login com senha + sessão por token
- **Instalação no Android:** manifest PWA (`manifest.json`) + service worker

---

## 🚀 Como rodar localmente

```bash
# Clonar o repositório
git clone <url-do-repositorio>
cd ateliê-da-suuh

# Instalar dependências
npm install

# Rodar o servidor
npm start
```

O frontend/app pode ser servido separadamente (Netlify) apontando para a URL do backend no Render.

Para testar a instalação como app no Android, acesse o site pelo Chrome do celular e use a opção **"Adicionar à tela inicial"** (ou o prompt automático de instalação, quando configurado).

---

## 📌 Próximos passos / Bugs conhecidos

- [ ] Configurar `manifest.json` e ícone do app para instalação como PWA
- [ ] Adicionar service worker para funcionamento offline básico
- [ ] Corrigir comportamento de zoom no modo botton centralizado (foto perde o formato circular e encolhe ao dar zoom out)
- [ ] Finalizar configuração do segundo Web Service no Render (repositório `servidor`)

---

*Desenvolvido com 💛 para o Ateliê da Suuh.*
