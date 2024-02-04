 #  CORRECTION EXERCICE 1 : SRP 

 1. **SRP** signifie : **S**ingle **R**esponsability **P**rinciple. 

     C'est un principe _SOLID_


2. Le SRP stipule qu'une classe ne doit faire qu'une seule chose, ne doit avoir qu'une seule responsabilté , ne devrait avoir qu'une seule raison de changer

3. **Squelle de code**
    <p align="center">Cliquez sur Employee.java  pour voir le code java de cette classe  </p> 

-  [Employee.java](Employee.java) : Cette classe contient le code java de la classe  (`Employee`) de la fiche de TD D'INF 331.

4. Non . car elle a pour responsabilité la gestion des employés et l'impression  d'un rapport de feuille de temps qui sont deux responsabilités qui ne sont pas en rapport. 

5. Une nouvelle modélisation qui corrige le problème


 <p align="center"> 
  <img src="Screenshot from 2024-02-04 17-52-50.png" alt="Description de l'image" />
</p>


6. Le code source Java de cette nouvelle solution. 


- [EmployeeSet.java](EmployeeSet.java) : Cette classe contient le code java de la nouvelle  classe  (`Employee`) qui respecte le SRP. 

- [Rapport.java](Rapport.java) : Cette classe contient le code java de la nouvelle  classe  (`Employee`) qui respecte le SRP.

