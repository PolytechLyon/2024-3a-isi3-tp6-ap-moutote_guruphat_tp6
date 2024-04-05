# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme :

## Exercices 1
Le patron de conception mis en oeuvre et le design pattern Composite car chaque élément `MobileObject` du vélo représente un composant et le vélo `Vehicle` lui même représente en composant également.

Pour la création de la classe `TagAlongBike`, il n'est pas nécessaire de réécrire la méthode `getVelocity` et `getMass` car le vélo est un composant `MobileComponent`.

## Exercices 2
La méthode `getVelocity()` utilise le patron de conception Iterateur. Ce patron permet d'avoir plus de contrôle sur le parcours des objets de la liste et d'abstraire la façon dont sont stockées les données.

On ne doit pas modifier la méthode car le type de stockage est abstrait par la création de l'itérateur. Ainsi, lors de la création de l'itérateur, le résultat sera la même, donc il suffit de change le type.

## Exercices 3

La réalisation de ce pattern est composée de trois étapes :
- d'abord, il faut rendre le constructeur privé afin de bloquer l'instanciation de la classe
- ensuite, il faut créer une fonction `getInstance()` qui possède deux cas de figure :
    - si l'objet n'a jamais été instancié, il est instancié et stocké dans une propriété static
    - si l'objet a déjà été instancié, il est retourné
- enfin, il faut remplacer les appels au constructeur par des appels à la méthdoe `getInstance()`

## Exercices 4

## Exercices 5

## Exercices 6

## Exercices 7

## Exercices 8

## Exercices 9
