# JAVA_ORIENTED_SOLID_PRINCIPLES
This github repository is intended to accommodate the java source code implementing the SOLID principles of the TD D'INF331 sheet by Dr Monthé



# <p align="center">Université de Yaoundé I</p>
# <p align="center">Département d’Informatique</p>

<p align="center">
  <img src="image.png" alt="Description de l'image" />
</p>
  <p align="center">Licence 3</p>

# <p align="center">INF331 : Approche Orientée Objet de Modélisation des SI, UML</p>

# <p align="center">2023-2024   </p>

# <p align="center">TD N°5 : Principes SOLID</p>
# <p align="center">Enseignant : Dr Valéry MONTHE</p>


[Télécharger le PDF](TD_5_INF331_Principes-SOLID_23-24.pdf)

# Exercice 1 :SRP

1. Que signifie **SRP** ? Qu’est-ce que c’est ?

2. Que dit le SRP ? 

3. Soit le modèle ci-dessous.
   <p align="center">
  <img src="Screenshot from 2024-02-04 16-33-14.png" alt="Description de l'image" />
</p>

       Donner un squelette de code de cette classe en Java.
4. La classe **Employee** respecte-t-elle le SRP ? expliquer
5. Si la réponse en 4 est négative, proposer une nouvelle modélisation qui corrige le problème.
6. Donner le code source Java de cette nouvelle solution.


# Exercice 2 : OCP

1. Que signifie OCP ? Que dit l’OCP ?

2. On considère une application de commerce électronique. Des développeurs ont conçu un modèle de classes
pour l’application. La figure ci-dessous donne un extrait du modèle.

   <p align="center">
  <img src="Screenshot from 2024-02-04 16-37-37.png" alt="Description de l'image" />
</p>

On a la classe **_Order_** qui gère les commandes. La méthode **getShippingCos()** calcule les frais d’expédition de la commande. Quand elle se fait par route,l’expédition est gratuite si la commande dépasse 100 Dollar, sinon elle coûte 15$ /Kg, avec un minimum de 10$. Par contre quand elle se fait par voie aérienne, l’expédition coûte 3$ / kg avec un minimum de 20$.

      a  Donner un squelette de code de cette classe en Java.

      b La classe Order respecte-t-elle l’OCP? expliquer

      c Si la réponse en b est négative, proposer une nouvelle modélisation qui corrige le problème.

      d Donner le code source Java de cette nouvelle solution.



# Exercice 3 : LSP

1. Que signifie LSP ? Que dit le LSP ?
2. On considère le modèle ci-dessous qui décrit une hiérarchie de documents. On peut avoir des documents
en lecture seule, mais aussi des documents modifiables.

 <p align="center">
  <img src="Screenshot from 2024-02-04 16-45-06.png" alt="Description de l'image" />
</p>


    a Donner un squelette de code en Java pour ce modèle.
    b Ce modèle respecte-t-il le LSP? expliquer
    c Si la réponse en b est négative, proposer une nouvelle modélisation qui corrige le problème.
    d Donner le code source Java de cette nouvelle solution.
# Exercice 4 : ISP

1. Que signifie ISP ? Que dit l’ISP ?
2. On considère le modèle ci-dessous qui décrit 2 fournisseurs de cloud. Cette modélisation considère que
Dropbox ne permet ni de créer des serveurs, ni de gérer les CDN (Content Delivery Networks)

 <p align="center">
  <img src="Screenshot from 2024-02-04 16-50-08.png" alt="Description de l'image" />
</p>


   a Donner un squelette de code de ce modèle en Java.
   b Ce modèle respecte-t-il ISP? expliquer
   c Si la réponse en b est négative, proposer une nouvelle modélisation qui corrige le problème.
   d Donner le code source Java de cette nouvelle solution.

# Exercice 5 : DIP

1. Que signifie DIP ? Que dit le DIP ?
2. On considère le modèle ci-dessous. Il décrit une application en couche. Une couche de haut niveau qui gère
la production des rapports sur le budget d’une entreprise, et une couche en dessous qui gère l’accès aux
bases de données.

<p align="center">
  <img src="Screenshot from 2024-02-04 16-53-41.png" alt="Description de l'image" />
</p>


   a Donner un squelette de code de ce modèle en Java.
   b Ce modèle respecte-t-il DIP? expliquer
   c Si la réponse en b est négative, proposer une nouvelle modélisation qui corrige le problème.
   d Donner le code source Java de cette nouvelle solution

