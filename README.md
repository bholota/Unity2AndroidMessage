# Unity2AndroidMessage
Sample string message sending from unity to android.

Method that handles unity3d ui action creates AndroidJavaClass object that allows to work on ```MessageDispatcher``` java class. It calls static method ```BroadcastMessage``` with string param. On Android side ```MessageDispatcher``` when recives new message sends local broadcast with message. By default it's recived by ```UnityPlayerActivity``` which shows ```Toast``` with received message.

Android project can be found under Unity2AndroidMessage/AndroidProject/Unity2AndroidMessage
