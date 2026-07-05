**OBS: O passo a passo foi gerado por um LLM**

Pré-requisitos
• Windows 10 ou superior
• Java JDK 17+
• Docker Desktop
• VS Code
• Projeto Java (Maven ou Gradle)
1. Atualizar o WSL
Abra o PowerShell como administrador e execute:

wsl --update

Reinicie o computador.
2. Verificar o Docker
Abra o Docker Desktop e aguarde aparecer 'Engine running'.

Comando de teste:

docker --version
3. Iniciar o SonarQube
docker run -d --name sonarqube -p 9000:9000 sonarqube:lts-community
4. Acessar o SonarQube
URL: http://localhost:9000
Usuário: admin
Senha: admin
5. Gerar Token
My Account → Security → Generate Tokens.
6. Instalar extensão
Instale a extensão 'SonarQube for IDE' da SonarSource no VS Code.
7. Conectar ao servidor
Ctrl+Shift+P → SonarQube: Connect to SonarQube Server
URL: http://localhost:9000
Cole o token gerado.
8. Associar projeto
Ctrl+Shift+P → SonarQube: Bind all workspace folders to SonarQube.
9. Executar análise Maven
mvn clean verify
mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.token=SEU_TOKEN
10. Visualizar métricas
Abra http://localhost:9000 para consultar Bugs, Vulnerabilities, Code Smells, Coverage e Quality Gate.
