# Modificadores de Acesso em Java

Os modificadores de acesso são responsáveis por determinar quem tem autorização de acesso à variáveis, atributos, métodos e classes.

Em Java existem quatro modificadores de acesso: default, public, protected e private.

&nbsp;

## Default

Esse é o modificador padrão adotado pela linguagem, quando definimos nossas variáveis, atributos, etc... esse modificador é atribuido, mesmo que implicitamente.

O default permite acesso a membros do mesmo pacote.

## Public

O public permite acesso em qualquer lugar por qualquer um.

## Protected

O protected permite acesso a membros do mesmo pacote, e a subclasses em pacotes diferentes.

## Private

O private é o modificador mais restrito entre os quatro, permitindo que variáveis, atributos, métodos sejam acessados apenas pela sua própria classe.

&nbsp;

## Tabela de Autorizações de Acessos

| **Modificador/Autorização de Acesso** | default | public | protected | private |
| --- | --- | --- | --- | --- |
| Mesma classe | **SIM** | **SIM** | **SIM** | **SIM** |
| Mesmo pacote & subclasse | **SIM** | **SIM** | **SIM** | **NÃO** |
| Mesmo pacote | **SIM** | **SIM** | **SIM** | **NÃO** |
| Pacote diferente & subclasse | **NÃO** | **SIM** | **SIM** | **NÃO** |
| Pacote diferente | **NÃO** | **SIM** | **NÃO** | **NÃO** |

&nbsp;

# Usabilidade Geralmente Adotada

1. Tenta-se manter classes públicas *(public)*.

2. Tenta-se manter atributos de instância privados *(private)*.

3. Na maioria das vezes métodos serão públicos, mas caso sinta-se a necessidade de manter um método ou variável de tal forma que possam ser acessados por subclasses fora do próprio pacote, então utiliza-se o modificador protegido *(protected)*.

4. Geralmente não é algo que deve-se ser utilizado com frequência, logo tenta-se evitar o uso do modificador padrão *(default)*.