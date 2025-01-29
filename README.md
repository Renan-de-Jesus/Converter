# Conversor de Texto para PDF

## 📌 Sobre o Projeto
Este projeto é um conversor de arquivos **TXT** para **PDF** desenvolvido em **Java** utilizando a biblioteca [iText](https://itextpdf.com/). Ele permite que o usuário selecione um arquivo de texto e o converta automaticamente para um arquivo PDF, que será salvo na área de trabalho.

## 🛠 Tecnologias Utilizadas
- **Java** - Linguagem principal do projeto
- **Swing** - Para a interface gráfica
- **iText** - Para a manipulação e criação do arquivo PDF

## 📂 Estrutura do Projeto
```
📁 ConversorTextoPDF
│-- 📁 src
│   │-- 📁 Model
│   │   │-- TextToPDF.java  # Classe responsável pela conversão
│   │   │-- SearchFiles.java  # Classe para seleção de arquivos
│   │-- 📁 View
│   │   │-- ConversorScreen.java  # Interface gráfica do programa
│-- 📄 README.md  # Documentação do projeto
```

## 🎯 Funcionalidades
✅ Selecionar um arquivo `.txt` do computador

✅ Converter o arquivo `.txt` em um `.pdf`

✅ Salvar automaticamente o PDF na **área de trabalho**

✅ Interface gráfica simples e intuitiva

## 🚀 Como Executar o Projeto
### 1️⃣ Pré-requisitos
Antes de executar, certifique-se de ter instalado:
- **Java JDK 8+**
- **IDE Java (Eclipse, IntelliJ, NetBeans, etc.)**


### 2️⃣ Executando
1. **Clone o repositório** (ou baixe o código-fonte)
   ```bash
   git clone https://github.com/seu-usuario/conversor-txt-pdf.git
   ```
2. **Abra o projeto em sua IDE preferida**
3. **Compile e execute a classe `ConversorScreen`**

### 3️⃣ Utilizando a Aplicação
1. Clique no botão `...` para selecionar um arquivo **TXT**
2. O nome do arquivo aparecerá no campo de texto
3. Clique em `Converter` para gerar o PDF
4. O arquivo PDF será salvo na **área de trabalho** do usuário

## 📝 Exemplo de Uso
1. **Arquivo `input.txt` de entrada:**
   ```
   Olá, este é um teste de conversão.
   Esse arquivo será convertido para PDF.
   ```
2. **Arquivo `input.pdf` gerado:**
   - O conteúdo do TXT será formatado como um documento PDF
   - O PDF será salvo automaticamente na **área de trabalho**

## 📌 Contribuição
Se quiser contribuir, siga os passos:
1. Faça um **fork** do projeto
2. Crie uma **branch**: `git checkout -b minha-feature`
3. Faça as alterações e **commit**: `git commit -m 'Minha nova feature'`
4. Faça um **push** para a branch: `git push origin minha-feature`
5. Abra um **Pull Request**

## 📄 Licença
Este projeto está sob a licença **MIT**. Sinta-se à vontade para usá-lo e modificá-lo. 😊

---
✉️ **Dúvidas?** Entre em contato!

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/renan-de-jesus-848308268/)

