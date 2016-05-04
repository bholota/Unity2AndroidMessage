using UnityEngine;
using System.Collections;

public class MenuScript : MonoBehaviour {

	public void onMenuClick() {

#if UNITY_ANDROID
		AndroidJavaClass androidClass = new AndroidJavaClass ("com.empty.sample.MessageDispatcher");
		androidClass.CallStatic ("BroadcastMessage", "my message data");
#else
		Debug.Log("Button clicked!");
#endif
	}
}
