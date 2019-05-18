# caelum-fj22 - Lab. Java com Testes, JSF e Design Patterns

* [Apostila online](https://www.caelum.com.br/apostila-java-testes-jsf-web-services-design-patterns/) 
* [Apostila offline](https://www.caelum.com.br/download/caelum-java-testes-jsf-web-services-design-patterns-fj22.pdf) 

Rascunho de Aulas

 # Rascunho de Aulas


## Notas:

* Material kit
* Brackets

___________________________________
	[working directory]
___________________________________	
	[staging area]
___________________________________
	[repository]

Comandos Git

	$ git init - Criar repositorio

	$ git status - arquivos modificados
	
	$ git add - adicionar arquivos
	
	$ git commit - "descrição modificação"
		-a (adicionar todos) 
		-o (arquivo especifico)
		-m (mensagem)

	$ git log
		commit (identificador)
		author (Nome <email>)
		date 18/05/19 09:00



___________________________________


<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
http://maven.apache.org/xsd/maven-4.0.0.xsd">
<!--Informações básicas do seu projeto-->
<groupId>br.com.caelum</groupId>
<artifactId>fj22-ingresso</artifactId>
<version>1.0</version>
<!--Configurações do build * Opcional-->
<build>
...
</build>
<!--Declaração de dependências * Opcional-->
<dependencies>
<!--Declarando a dependência do hibernate-core na versão 5.2.6.Final -->
<dependency>
<groupId>org.hibernate</groupId>
<artifactId>hibernate-core</artifactId>
<version>5.2.6.Final</version>
</dependency>
</dependencies>
</project>


Além disso, o Maven tem uma estrutura padrão de pastas que deve ser seguida, como visto a seguir:
+-src/
|
+- main/
|
|
|
+- java/
|
+- resources/
|
+- webapp/ (em caso de projetos web com empacotamento _.war_)
|
+- test/
|
+- java/
+- resources/
src/main/java/ - classes do nosso projeto.
src/main/resources/ - arquivos de configuração, como, xml, properties e arquivos estáticos do
projeto.
src/main/webapp/ - pasta WEB-INF com seus arquivos internos (web.xml, por exemplo) e arquivos
JSP.
src/test/java - classes de testes.
src/test/reso
___________________________________

	
