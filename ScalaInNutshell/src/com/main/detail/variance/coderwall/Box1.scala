package com.main.detail.variance.coderwall


/*Box1 is covariant in T
Box[Dog] can be used for Box[Mammal] not Box[Animal] 
Only subtypes of Mammal are ok*/
class Box1[+T] {}