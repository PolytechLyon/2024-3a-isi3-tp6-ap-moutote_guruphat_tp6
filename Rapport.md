# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : GURUPHAT Nicolas & MOUTOTE Grégory

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

Non, les classes `Wheel` et `Bike` n'appartiennent pas au même package.

`Bike` hérite de `Vehicle` et `Wheel` utilise un `Bike`. 

Il y a une relation d'interdépendance, donc si les deux packages se trouvaient dans un module différent, ils ne seraient pas possible d'instancier un objet `Bike` (car il est impossible de choisir un ordre d'instanciation pour les objets interdépedants).

Cette dépendance n'adhère donc pas aux bonnes pratiques de conception.

`Wheel` utilise la méthode `getPush()` de la classe `Bike`. Il existe une abstraction dans `Vehicle`, qui se trouve dans le package transport.

Pour casser la dépendance, il nous suffit donc d'utiliser l'abstraction de `Bike` dans `Wheel`. Ainsi, `Wheel` n'utilisera que des classes du même package.

## Exercices 5

Il suffit de centraliser la partie commune (construction du message) au niveau de la classe parent pour éviter la duplication du code.

## Exercices 6

Dans le cas présent, la différence entre une frabique statique et le singleton et que, même si la fabrication d'une instance est statique, le singleton ne fabrique qu'une seule et unique instance contrairement à la fabrique qui en construit plusieurs.

## Exercices 7

Pour répondre à ce besoin, nous avons créé un décorateur qui possède une méthode log et une propriété de type `Logger`. Dans l'appel à la méthode `log()`, nous générons une nouvelle `String` contenant la date et nous l'injectons dans le format avant d'appeler la fonction du logger concret injecté lors de la construction.

Ainsi, pour utiliser ce décorateur, il faut appeller le constructeur avec une instance d'un des enfants concrets de `Logger`.

## Exercices 8

La classe `Contexte` suit le patron itérateur.

Oui, il est possible d'avoir plusieurs lignes dans le fichier. Chaque ligne correspondra à une nouvelle instance. Ainsi, dans la méthode `inject()`, un nouvel objet sera créé pour chaque ligne en correspondance avec la classe indiquée. Cependant, nous n'utilisons que la première instance (car nous retournons seulement le premier élément de l'itérateur).

## Exercices 9

La méthode `load(klass)` va elle-même récupérer les classes d'implémentation de `klass`, donc tous les éléments présents dans l'itérateur correspondent à la classe `klass` demandée.

Dans `injectAll`, on peut donc directement retourner l'itérateur sur les classes d'implémentation trouvées.
Pour faire la simulation sur tous les vélos (implémentations de `Bike`), il suffit donc d'itérer sur le retour de `injectAll(Bike.class)`. Cependant une ligne dupliquée dans le fichier de configuration seront ignorées et l'absence de lignes impliquera un itérateur vide.