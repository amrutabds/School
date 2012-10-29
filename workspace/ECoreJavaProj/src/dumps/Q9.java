//Which Man class properly represents the relationship “Man has a bestfriend who is a Dog”?
 class Man extends Dog { }
 class Man implements Dog { }
class Man { private BestFriend dog; }
class Man { private Dog bestFriend; }---ans
 class Man { private Dog<bestFriend> }
 class Man { private BestFriend<dog> }
 
 // Man has a object(bestfriend) who is a --Int or double or string like that type(dog)